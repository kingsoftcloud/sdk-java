/*
 * Decompiled with CFR 0.152.
 */
package common.annotation;

import java.lang.annotation.*;

@Documented
@Retention(value=RetentionPolicy.RUNTIME)
@Target(value={ElementType.FIELD})
public @interface KsYunField {
    public String name() default "";

    public int type() default 1;
}

