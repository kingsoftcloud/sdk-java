/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSONObject
 *  com.fasterxml.jackson.databind.JsonSerializer
 *  com.fasterxml.jackson.databind.Module
 *  com.fasterxml.jackson.databind.ObjectMapper
 *  com.fasterxml.jackson.databind.module.SimpleModule
 *  org.apache.commons.lang3.StringUtils
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package common;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.Module;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import common.Credential;
import common.annotation.KsYunField;
import common.annotation.KsYunFieldPropertySerializer;
import common.exception.ClientException;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BaseClient {
    protected static final Logger log = LoggerFactory.getLogger(BaseClient.class);
    private static final List<String> basicFieldTypeNameList = new ArrayList<String>();

    public JSONObject getCommonParams(Credential credential, JSONObject requestParams) {
        if (credential == null) {
            throw new ClientException("inner_error", "credential error");
        }
        if (requestParams == null) {
            throw new ClientException("inner_error", "requestParams error");
        }
        credential.check();
        requestParams.put("Accesskey", (Object)credential.getSecretKey());
        requestParams.put("Timestamp", (Object)credential.getTimestamp());
        requestParams.put("SignatureVersion", (Object)credential.getSignatureVersion());
        requestParams.put("SignatureMethod", (Object)credential.getSignatureMethod());
        requestParams.put("Region", (Object)credential.getRegion());
        return requestParams;
    }

    public void setRequestField(Object requestObj, JSONObject requestParams) throws Exception {
        this.fillJSONObject(requestObj, requestParams, "");
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void fillJSONObject(Object requestObj, JSONObject requestParams, String preKeyName) throws Exception {
        Class<?> requestClass = requestObj.getClass();
        Field[] fields = requestClass.getDeclaredFields();
        if (fields != null && fields.length > 0) {
            for (Field field : fields) {
                try {
                    Object fieldValue;
                    field.setAccessible(true);
                    if (field == null || field.get(requestObj) == null || (fieldValue = field.get(requestObj)) == null) continue;
                    KsYunField firstKsYunField = field.getAnnotation(KsYunField.class);
                    String fieldTypeName = field.getType().getName();
                    log.info("fieldTypeName:{}", (Object)fieldTypeName);
                    if (basicFieldTypeNameList.contains(fieldTypeName)) {
                        if (fieldValue == null) continue;
                        if (firstKsYunField != null) {
                            String requestKey = firstKsYunField.name();
                            if (StringUtils.isEmpty((CharSequence)preKeyName)) {
                                requestParams.put(requestKey, (Object)fieldValue.toString());
                                continue;
                            }
                            requestParams.put(preKeyName + requestKey, fieldValue);
                            continue;
                        }
                        if (!StringUtils.isNotEmpty((CharSequence)preKeyName)) continue;
                        requestParams.put(preKeyName, fieldValue);
                        continue;
                    }
                    if (fieldTypeName.equals("java.util.List")) {
                        List dtoList = (List)field.get(requestObj);
                        if (dtoList == null || dtoList.size() <= 0) continue;
                        for (int i = 0; i < dtoList.size(); ++i) {
                            String dtoPreKeyName;
                            int index = i + 1;
                            Object obj = dtoList.get(i);
                            if (obj == null) continue;
                            String listObjClassName = obj.getClass().getName();
                            if (basicFieldTypeNameList.contains(listObjClassName)) {
                                dtoPreKeyName = "";
                                dtoPreKeyName = firstKsYunField.type() == 1 ? preKeyName + firstKsYunField.name() + "." + index : preKeyName + firstKsYunField.name() + "[" + i + "]";
                                requestParams.put(dtoPreKeyName, obj);
                                continue;
                            }
                            dtoPreKeyName = "";
                            dtoPreKeyName = firstKsYunField.type() == 1 ? preKeyName + firstKsYunField.name() + "." + index + "." : preKeyName + firstKsYunField.name() + "[" + index + "]" + ".";
                            this.fillJSONObject(obj, requestParams, dtoPreKeyName);
                        }
                        continue;
                    }
                    Object obj = field.get(requestObj);
                    String dtoPreKeyName = preKeyName + firstKsYunField.name() + ".";
                    this.fillJSONObject(obj, requestParams, dtoPreKeyName);
                }
                finally {
                    field.setAccessible(false);
                }
            }
        }
    }

    @Deprecated
    public void setRequestField(Object requestObj, JSONObject requestParams, String preKeyName) throws Exception {
        Class<?> requestClass;
        Field[] fields;
        if (requestObj != null && (fields = (requestClass = requestObj.getClass()).getDeclaredFields()) != null && fields.length > 0) {
            for (Field field : fields) {
                field.setAccessible(true);
                String fieldTypeName = field.getType().getName();
                System.out.println("fieldTypeName: " + fieldTypeName);
                if (basicFieldTypeNameList.contains(fieldTypeName)) {
                    KsYunField ksYunField = field.getAnnotation(KsYunField.class);
                    Object fieldValue = field.get(requestObj);
                    if (ksYunField != null && fieldValue != null) {
                        String requestKey = ksYunField.name();
                        requestParams.put(requestKey, fieldValue);
                    }
                } else if (fieldTypeName.equals("java.util.List")) {
                    KsYunField dtoListKey = field.getAnnotation(KsYunField.class);
                    List dtoList = (List)field.get(requestObj);
                    if (dtoList != null && dtoList.size() > 0) {
                        for (int i = 0; i < dtoList.size(); ++i) {
                            Field[] dtoFields;
                            int index = i + 1;
                            Object dto = dtoList.get(i);
                            if (dto == null) {
                                return;
                            }
                            for (Field dtoField : dtoFields = dto.getClass().getDeclaredFields()) {
                                dtoField.setAccessible(true);
                                KsYunField dtoFieldKey = dtoField.getAnnotation(KsYunField.class);
                                Object fieldValue = dtoField.get(dto);
                                if (fieldValue == null) {
                                    return;
                                }
                                if (dtoFieldKey != null && dtoFieldKey.name() != null && dtoFieldKey.name() != "") {
                                    requestParams.put(dtoListKey.name() + "." + index + "." + dtoFieldKey.name(), fieldValue);
                                } else {
                                    requestParams.put(dtoListKey.name() + "." + index, dto);
                                }
                                dtoField.setAccessible(false);
                            }
                        }
                    }
                }
                field.setAccessible(false);
            }
        }
    }

    public void setRequestFieldForPostRaw(Object requestObj, JSONObject requestParams) throws Exception {
        this.fillJSONObjectForRaw(requestObj, requestParams);
    }

    private void fillJSONObjectForRaw(Object requestObj, JSONObject requestParams) throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        SimpleModule module = new SimpleModule();
        module.addSerializer(requestObj.getClass(), (JsonSerializer)new KsYunFieldPropertySerializer());
        objectMapper.registerModule((Module)module);
        String paramsJson = objectMapper.writeValueAsString(requestObj);
        if (StringUtils.isNotEmpty((CharSequence)paramsJson)) {
            JSONObject.parseObject((String)paramsJson).entrySet().forEach(entry -> requestParams.put((String)entry.getKey(), entry.getValue()));
        }
        log.info("requestParams:{}", (Object)JSONObject.toJSONString((Object)requestParams));
    }

    public static void main(String[] args) {
        BaseClient baseClient = new BaseClient();
        TestFirstObj testFirstObj = new TestFirstObj();
        testFirstObj.setTestInt(1);
        testFirstObj.setTestInteger(2);
        String[] strings = new String[]{"3", "4"};
        testFirstObj.setTestStrList(Arrays.asList(strings));
        Integer[] intArray = new Integer[]{5, 6};
        testFirstObj.setTestIntList(Arrays.asList(intArray));
        Long[] longArray = new Long[]{7L, 8L};
        testFirstObj.setTestLongList(Arrays.asList(longArray));
        TestSencodObj testSencodObj = new TestSencodObj();
        testSencodObj.setTestStr("sencond");
        testSencodObj.setTestLong(10L);
        testFirstObj.setTestSencodObj(testSencodObj);
        TestThirdObj testThirdObj = new TestThirdObj();
        testThirdObj.setTestStr("third");
        testThirdObj.setTestLong(11L);
        testSencodObj.setTestThirdObj(testThirdObj);
        ArrayList<TestSencodObj> testSencodObjList = new ArrayList<TestSencodObj>();
        testFirstObj.setTestSencodObjList(testSencodObjList);
        TestSencodObj testSencodObj1 = new TestSencodObj();
        testSencodObj1.setTestStr("zhangsan");
        testSencodObj1.setTestLong(11L);
        testSencodObj1.setTestBoolean(false);
        ArrayList<TestThirdObj> testThirdObjList1 = new ArrayList<TestThirdObj>();
        TestThirdObj testThirdObj2 = new TestThirdObj();
        testThirdObj2.setTestStr("third");
        testThirdObj2.setTestLong(11L);
        testThirdObjList1.add(testThirdObj2);
        TestThirdObj testThirdObj3 = new TestThirdObj();
        testThirdObj3.setTestStr("third");
        testThirdObj3.setTestLong(11L);
        testThirdObjList1.add(testThirdObj3);
        testSencodObj1.setTestThirdObjList(testThirdObjList1);
        testSencodObjList.add(testSencodObj1);
        TestSencodObj testSencodObj2 = new TestSencodObj();
        testSencodObj2.setTestStr("lisi");
        testSencodObj2.setTestLong(12L);
        testSencodObj2.setTestBoolean(false);
        ArrayList<TestThirdObj> testThirdObjList2 = new ArrayList<TestThirdObj>();
        TestThirdObj testThirdObj4 = new TestThirdObj();
        testThirdObj4.setTestStr("third");
        testThirdObj4.setTestLong(11L);
        testThirdObjList2.add(testThirdObj4);
        TestThirdObj testThirdObj5 = new TestThirdObj();
        testThirdObj5.setTestStr("third");
        testThirdObj5.setTestLong(11L);
        testThirdObjList2.add(testThirdObj5);
        testSencodObj2.setTestThirdObjList(testThirdObjList2);
        testSencodObjList.add(testSencodObj2);
        try {
            JSONObject jsonObject = new JSONObject();
            baseClient.fillJSONObject(testFirstObj, jsonObject, "");
            System.out.println("1");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    static {
        basicFieldTypeNameList.add("int");
        basicFieldTypeNameList.add("java.lang.Integer");
        basicFieldTypeNameList.add("java.lang.String");
        basicFieldTypeNameList.add("java.lang.Boolean");
        basicFieldTypeNameList.add("boolean");
        basicFieldTypeNameList.add("java.lang.Long");
        basicFieldTypeNameList.add("long");
        basicFieldTypeNameList.add("java.lang.Double");
        basicFieldTypeNameList.add("double");
        basicFieldTypeNameList.add("java.lang.Float");
        basicFieldTypeNameList.add("float");
        basicFieldTypeNameList.add("java.math.BigDecimal");
        basicFieldTypeNameList.add("char");
    }

    static class TestThirdObj {
        @KsYunField(name="testStr")
        private String testStr;
        @KsYunField(name="testBoolean")
        private Boolean testBoolean;
        @KsYunField(name="testLong")
        private Long testLong;
        @KsYunField(name="testDouble")
        private Double testDouble;
        @KsYunField(name="testFloat")
        private Float testFloat;
        @KsYunField(name="testBig")
        private BigDecimal testBig;

        public String getTestStr() {
            return this.testStr;
        }

        public Boolean getTestBoolean() {
            return this.testBoolean;
        }

        public Long getTestLong() {
            return this.testLong;
        }

        public Double getTestDouble() {
            return this.testDouble;
        }

        public Float getTestFloat() {
            return this.testFloat;
        }

        public BigDecimal getTestBig() {
            return this.testBig;
        }

        public void setTestStr(String testStr) {
            this.testStr = testStr;
        }

        public void setTestBoolean(Boolean testBoolean) {
            this.testBoolean = testBoolean;
        }

        public void setTestLong(Long testLong) {
            this.testLong = testLong;
        }

        public void setTestDouble(Double testDouble) {
            this.testDouble = testDouble;
        }

        public void setTestFloat(Float testFloat) {
            this.testFloat = testFloat;
        }

        public void setTestBig(BigDecimal testBig) {
            this.testBig = testBig;
        }

        public boolean equals(Object o) {
            if (o == this) {
                return true;
            }
            if (!(o instanceof TestThirdObj)) {
                return false;
            }
            TestThirdObj other = (TestThirdObj)o;
            if (!other.canEqual(this)) {
                return false;
            }
            String this$testStr = this.getTestStr();
            String other$testStr = other.getTestStr();
            if (this$testStr == null ? other$testStr != null : !this$testStr.equals(other$testStr)) {
                return false;
            }
            Boolean this$testBoolean = this.getTestBoolean();
            Boolean other$testBoolean = other.getTestBoolean();
            if (this$testBoolean == null ? other$testBoolean != null : !((Object)this$testBoolean).equals(other$testBoolean)) {
                return false;
            }
            Long this$testLong = this.getTestLong();
            Long other$testLong = other.getTestLong();
            if (this$testLong == null ? other$testLong != null : !((Object)this$testLong).equals(other$testLong)) {
                return false;
            }
            Double this$testDouble = this.getTestDouble();
            Double other$testDouble = other.getTestDouble();
            if (this$testDouble == null ? other$testDouble != null : !((Object)this$testDouble).equals(other$testDouble)) {
                return false;
            }
            Float this$testFloat = this.getTestFloat();
            Float other$testFloat = other.getTestFloat();
            if (this$testFloat == null ? other$testFloat != null : !((Object)this$testFloat).equals(other$testFloat)) {
                return false;
            }
            BigDecimal this$testBig = this.getTestBig();
            BigDecimal other$testBig = other.getTestBig();
            return !(this$testBig == null ? other$testBig != null : !((Object)this$testBig).equals(other$testBig));
        }

        protected boolean canEqual(Object other) {
            return other instanceof TestThirdObj;
        }

        public int hashCode() {
            int PRIME = 59;
            int result = 1;
            String $testStr = this.getTestStr();
            result = result * 59 + ($testStr == null ? 43 : $testStr.hashCode());
            Boolean $testBoolean = this.getTestBoolean();
            result = result * 59 + ($testBoolean == null ? 43 : ((Object)$testBoolean).hashCode());
            Long $testLong = this.getTestLong();
            result = result * 59 + ($testLong == null ? 43 : ((Object)$testLong).hashCode());
            Double $testDouble = this.getTestDouble();
            result = result * 59 + ($testDouble == null ? 43 : ((Object)$testDouble).hashCode());
            Float $testFloat = this.getTestFloat();
            result = result * 59 + ($testFloat == null ? 43 : ((Object)$testFloat).hashCode());
            BigDecimal $testBig = this.getTestBig();
            result = result * 59 + ($testBig == null ? 43 : ((Object)$testBig).hashCode());
            return result;
        }

        public String toString() {
            return "BaseClient.TestThirdObj(testStr=" + this.getTestStr() + ", testBoolean=" + this.getTestBoolean() + ", testLong=" + this.getTestLong() + ", testDouble=" + this.getTestDouble() + ", testFloat=" + this.getTestFloat() + ", testBig=" + this.getTestBig() + ")";
        }
    }

    static class TestSencodObj {
        @KsYunField(name="testIntList")
        private List<Integer> testIntList = Arrays.asList(1, 2, 3, 4, 5);
        @KsYunField(name="testStr")
        private String testStr;
        @KsYunField(name="testBoolean")
        private Boolean testBoolean;
        @KsYunField(name="testLong")
        private Long testLong;
        @KsYunField(name="testDouble")
        private Double testDouble;
        @KsYunField(name="testFloat")
        private Float testFloat;
        @KsYunField(name="testBig")
        private BigDecimal testBig;
        @KsYunField(name="testThirdObj")
        private TestThirdObj testThirdObj;
        @KsYunField(name="testThirdObjList")
        private List<TestThirdObj> testThirdObjList;

        public List<Integer> getTestIntList() {
            return this.testIntList;
        }

        public String getTestStr() {
            return this.testStr;
        }

        public Boolean getTestBoolean() {
            return this.testBoolean;
        }

        public Long getTestLong() {
            return this.testLong;
        }

        public Double getTestDouble() {
            return this.testDouble;
        }

        public Float getTestFloat() {
            return this.testFloat;
        }

        public BigDecimal getTestBig() {
            return this.testBig;
        }

        public TestThirdObj getTestThirdObj() {
            return this.testThirdObj;
        }

        public List<TestThirdObj> getTestThirdObjList() {
            return this.testThirdObjList;
        }

        public void setTestIntList(List<Integer> testIntList) {
            this.testIntList = testIntList;
        }

        public void setTestStr(String testStr) {
            this.testStr = testStr;
        }

        public void setTestBoolean(Boolean testBoolean) {
            this.testBoolean = testBoolean;
        }

        public void setTestLong(Long testLong) {
            this.testLong = testLong;
        }

        public void setTestDouble(Double testDouble) {
            this.testDouble = testDouble;
        }

        public void setTestFloat(Float testFloat) {
            this.testFloat = testFloat;
        }

        public void setTestBig(BigDecimal testBig) {
            this.testBig = testBig;
        }

        public void setTestThirdObj(TestThirdObj testThirdObj) {
            this.testThirdObj = testThirdObj;
        }

        public void setTestThirdObjList(List<TestThirdObj> testThirdObjList) {
            this.testThirdObjList = testThirdObjList;
        }

        public boolean equals(Object o) {
            if (o == this) {
                return true;
            }
            if (!(o instanceof TestSencodObj)) {
                return false;
            }
            TestSencodObj other = (TestSencodObj)o;
            if (!other.canEqual(this)) {
                return false;
            }
            List<Integer> this$testIntList = this.getTestIntList();
            List<Integer> other$testIntList = other.getTestIntList();
            if (this$testIntList == null ? other$testIntList != null : !((Object)this$testIntList).equals(other$testIntList)) {
                return false;
            }
            String this$testStr = this.getTestStr();
            String other$testStr = other.getTestStr();
            if (this$testStr == null ? other$testStr != null : !this$testStr.equals(other$testStr)) {
                return false;
            }
            Boolean this$testBoolean = this.getTestBoolean();
            Boolean other$testBoolean = other.getTestBoolean();
            if (this$testBoolean == null ? other$testBoolean != null : !((Object)this$testBoolean).equals(other$testBoolean)) {
                return false;
            }
            Long this$testLong = this.getTestLong();
            Long other$testLong = other.getTestLong();
            if (this$testLong == null ? other$testLong != null : !((Object)this$testLong).equals(other$testLong)) {
                return false;
            }
            Double this$testDouble = this.getTestDouble();
            Double other$testDouble = other.getTestDouble();
            if (this$testDouble == null ? other$testDouble != null : !((Object)this$testDouble).equals(other$testDouble)) {
                return false;
            }
            Float this$testFloat = this.getTestFloat();
            Float other$testFloat = other.getTestFloat();
            if (this$testFloat == null ? other$testFloat != null : !((Object)this$testFloat).equals(other$testFloat)) {
                return false;
            }
            BigDecimal this$testBig = this.getTestBig();
            BigDecimal other$testBig = other.getTestBig();
            if (this$testBig == null ? other$testBig != null : !((Object)this$testBig).equals(other$testBig)) {
                return false;
            }
            TestThirdObj this$testThirdObj = this.getTestThirdObj();
            TestThirdObj other$testThirdObj = other.getTestThirdObj();
            if (this$testThirdObj == null ? other$testThirdObj != null : !((Object)this$testThirdObj).equals(other$testThirdObj)) {
                return false;
            }
            List<TestThirdObj> this$testThirdObjList = this.getTestThirdObjList();
            List<TestThirdObj> other$testThirdObjList = other.getTestThirdObjList();
            return !(this$testThirdObjList == null ? other$testThirdObjList != null : !((Object)this$testThirdObjList).equals(other$testThirdObjList));
        }

        protected boolean canEqual(Object other) {
            return other instanceof TestSencodObj;
        }

        public int hashCode() {
            int PRIME = 59;
            int result = 1;
            List<Integer> $testIntList = this.getTestIntList();
            result = result * 59 + ($testIntList == null ? 43 : ((Object)$testIntList).hashCode());
            String $testStr = this.getTestStr();
            result = result * 59 + ($testStr == null ? 43 : $testStr.hashCode());
            Boolean $testBoolean = this.getTestBoolean();
            result = result * 59 + ($testBoolean == null ? 43 : ((Object)$testBoolean).hashCode());
            Long $testLong = this.getTestLong();
            result = result * 59 + ($testLong == null ? 43 : ((Object)$testLong).hashCode());
            Double $testDouble = this.getTestDouble();
            result = result * 59 + ($testDouble == null ? 43 : ((Object)$testDouble).hashCode());
            Float $testFloat = this.getTestFloat();
            result = result * 59 + ($testFloat == null ? 43 : ((Object)$testFloat).hashCode());
            BigDecimal $testBig = this.getTestBig();
            result = result * 59 + ($testBig == null ? 43 : ((Object)$testBig).hashCode());
            TestThirdObj $testThirdObj = this.getTestThirdObj();
            result = result * 59 + ($testThirdObj == null ? 43 : ((Object)$testThirdObj).hashCode());
            List<TestThirdObj> $testThirdObjList = this.getTestThirdObjList();
            result = result * 59 + ($testThirdObjList == null ? 43 : ((Object)$testThirdObjList).hashCode());
            return result;
        }

        public String toString() {
            return "BaseClient.TestSencodObj(testIntList=" + this.getTestIntList() + ", testStr=" + this.getTestStr() + ", testBoolean=" + this.getTestBoolean() + ", testLong=" + this.getTestLong() + ", testDouble=" + this.getTestDouble() + ", testFloat=" + this.getTestFloat() + ", testBig=" + this.getTestBig() + ", testThirdObj=" + this.getTestThirdObj() + ", testThirdObjList=" + this.getTestThirdObjList() + ")";
        }
    }

    static class TestFirstObj {
        @KsYunField(name="testInt")
        private int testInt;
        @KsYunField(name="testInteger")
        private Integer testInteger;
        @KsYunField(name="testStrList")
        private List<String> testStrList;
        @KsYunField(name="testIntList")
        private List<Integer> testIntList;
        @KsYunField(name="testLongList")
        private List<Long> testLongList;
        @KsYunField(name="testSencodObj")
        private TestSencodObj testSencodObj;
        @KsYunField(name="testSencodObjList")
        private List<TestSencodObj> testSencodObjList;

        public int getTestInt() {
            return this.testInt;
        }

        public Integer getTestInteger() {
            return this.testInteger;
        }

        public List<String> getTestStrList() {
            return this.testStrList;
        }

        public List<Integer> getTestIntList() {
            return this.testIntList;
        }

        public List<Long> getTestLongList() {
            return this.testLongList;
        }

        public TestSencodObj getTestSencodObj() {
            return this.testSencodObj;
        }

        public List<TestSencodObj> getTestSencodObjList() {
            return this.testSencodObjList;
        }

        public void setTestInt(int testInt) {
            this.testInt = testInt;
        }

        public void setTestInteger(Integer testInteger) {
            this.testInteger = testInteger;
        }

        public void setTestStrList(List<String> testStrList) {
            this.testStrList = testStrList;
        }

        public void setTestIntList(List<Integer> testIntList) {
            this.testIntList = testIntList;
        }

        public void setTestLongList(List<Long> testLongList) {
            this.testLongList = testLongList;
        }

        public void setTestSencodObj(TestSencodObj testSencodObj) {
            this.testSencodObj = testSencodObj;
        }

        public void setTestSencodObjList(List<TestSencodObj> testSencodObjList) {
            this.testSencodObjList = testSencodObjList;
        }

        public boolean equals(Object o) {
            if (o == this) {
                return true;
            }
            if (!(o instanceof TestFirstObj)) {
                return false;
            }
            TestFirstObj other = (TestFirstObj)o;
            if (!other.canEqual(this)) {
                return false;
            }
            if (this.getTestInt() != other.getTestInt()) {
                return false;
            }
            Integer this$testInteger = this.getTestInteger();
            Integer other$testInteger = other.getTestInteger();
            if (this$testInteger == null ? other$testInteger != null : !((Object)this$testInteger).equals(other$testInteger)) {
                return false;
            }
            List<String> this$testStrList = this.getTestStrList();
            List<String> other$testStrList = other.getTestStrList();
            if (this$testStrList == null ? other$testStrList != null : !((Object)this$testStrList).equals(other$testStrList)) {
                return false;
            }
            List<Integer> this$testIntList = this.getTestIntList();
            List<Integer> other$testIntList = other.getTestIntList();
            if (this$testIntList == null ? other$testIntList != null : !((Object)this$testIntList).equals(other$testIntList)) {
                return false;
            }
            List<Long> this$testLongList = this.getTestLongList();
            List<Long> other$testLongList = other.getTestLongList();
            if (this$testLongList == null ? other$testLongList != null : !((Object)this$testLongList).equals(other$testLongList)) {
                return false;
            }
            TestSencodObj this$testSencodObj = this.getTestSencodObj();
            TestSencodObj other$testSencodObj = other.getTestSencodObj();
            if (this$testSencodObj == null ? other$testSencodObj != null : !((Object)this$testSencodObj).equals(other$testSencodObj)) {
                return false;
            }
            List<TestSencodObj> this$testSencodObjList = this.getTestSencodObjList();
            List<TestSencodObj> other$testSencodObjList = other.getTestSencodObjList();
            return !(this$testSencodObjList == null ? other$testSencodObjList != null : !((Object)this$testSencodObjList).equals(other$testSencodObjList));
        }

        protected boolean canEqual(Object other) {
            return other instanceof TestFirstObj;
        }

        public int hashCode() {
            int PRIME = 59;
            int result = 1;
            result = result * 59 + this.getTestInt();
            Integer $testInteger = this.getTestInteger();
            result = result * 59 + ($testInteger == null ? 43 : ((Object)$testInteger).hashCode());
            List<String> $testStrList = this.getTestStrList();
            result = result * 59 + ($testStrList == null ? 43 : ((Object)$testStrList).hashCode());
            List<Integer> $testIntList = this.getTestIntList();
            result = result * 59 + ($testIntList == null ? 43 : ((Object)$testIntList).hashCode());
            List<Long> $testLongList = this.getTestLongList();
            result = result * 59 + ($testLongList == null ? 43 : ((Object)$testLongList).hashCode());
            TestSencodObj $testSencodObj = this.getTestSencodObj();
            result = result * 59 + ($testSencodObj == null ? 43 : ((Object)$testSencodObj).hashCode());
            List<TestSencodObj> $testSencodObjList = this.getTestSencodObjList();
            result = result * 59 + ($testSencodObjList == null ? 43 : ((Object)$testSencodObjList).hashCode());
            return result;
        }

        public String toString() {
            return "BaseClient.TestFirstObj(testInt=" + this.getTestInt() + ", testInteger=" + this.getTestInteger() + ", testStrList=" + this.getTestStrList() + ", testIntList=" + this.getTestIntList() + ", testLongList=" + this.getTestLongList() + ", testSencodObj=" + this.getTestSencodObj() + ", testSencodObjList=" + this.getTestSencodObjList() + ")";
        }
    }
}

