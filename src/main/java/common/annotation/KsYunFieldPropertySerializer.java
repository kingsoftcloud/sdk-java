/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.core.JsonGenerator
 *  com.fasterxml.jackson.core.JsonProcessingException
 *  com.fasterxml.jackson.databind.JsonSerializer
 *  com.fasterxml.jackson.databind.SerializerProvider
 *  org.apache.commons.lang3.StringUtils
 */
package common.annotation;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Collection;

public class KsYunFieldPropertySerializer
extends JsonSerializer<Object> {
    public void serialize(Object value, JsonGenerator gen, SerializerProvider serializers) throws IOException, JsonProcessingException {
        Field[] fields = value.getClass().getDeclaredFields();
        if (fields.length <= 0) {
            return;
        }
        gen.writeStartObject();
        for (Field field : fields) {
            try {
                field.setAccessible(true);
                String propertyName = field.getName();
                Object fieldValue = field.get(value);
                if (fieldValue == null) continue;
                if (!field.isAnnotationPresent(KsYunField.class)) {
                    gen.writeObjectField(propertyName, fieldValue);
                    continue;
                }
                KsYunField annotation = field.getAnnotation(KsYunField.class);
                if (StringUtils.isNotEmpty((CharSequence)annotation.name())) {
                    propertyName = annotation.name();
                }
                if (fieldValue instanceof Collection) {
                    gen.writeFieldName(propertyName);
                    gen.writeStartArray();
                    Collection collection = (Collection)fieldValue;
                    for (Object item : collection) {
                        String typeName = item.getClass().getTypeName();
                        if (typeName.startsWith("java")) {
                            gen.writeObject(item);
                            continue;
                        }
                        this.serialize(item, gen, serializers);
                    }
                    gen.writeEndArray();
                    continue;
                }
                // 判断是否为自定义嵌套对象，如果是则递归序列化
                String typeName = fieldValue.getClass().getTypeName();
                if (typeName.startsWith("java")) {
                    // 基本类型或 Java 内置类型，直接写
                    gen.writeObjectField(propertyName, fieldValue);
                } else {
                    // 自定义嵌套对象，递归序列化以支持无限层级
                    gen.writeFieldName(propertyName);
                    this.serialize(fieldValue, gen, serializers);
                }
            }
            catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        gen.writeEndObject();
    }
}

