package ksyun.client.aicp.getapidetail.v20251114;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname GetApiDetailResponse
* @Description GetApiDetail 返回体
*/
@Data
@ToString
public class GetApiDetailResponse extends BaseResponseModel {

    /**请求唯一标识*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**API详情*/
    @JsonProperty("ApiDetail")
    private ApiDetailDto ApiDetail;

    @Data
    @ToString
    public static class ApiDetailDto {
        /**服务名称*/
        @JsonProperty("ApiService")
        private String ApiService;

        /**API名称*/
        @JsonProperty("ApiName")
        private String ApiName;

        /**版本号*/
        @JsonProperty("ApiVersion")
        private String ApiVersion;

        /**API中文名称*/
        @JsonProperty("ApiNameCn")
        private String ApiNameCn;

        /**API描述*/
        @JsonProperty("ApiDescription")
        private String ApiDescription;

        /**API说明*/
        @JsonProperty("ApiInstructions")
        private String ApiInstructions;

        /**API参数列表*/
        @JsonProperty("ApiParams")
        private ApiDetailApiParamsDto ApiParams;

        @Data
        @ToString
        public static class ApiDetailApiParamsDto {
            /**类型，默认object*/
            @JsonProperty("type")
            private String Type;

            /**描述*/
            @JsonProperty("description")
            private String Description;

            /**属性定义*/
            @JsonProperty("properties")
            private ApiDetailApiParamsPropertiesDto Properties;

            @Data
            @ToString
            public static class ApiDetailApiParamsPropertiesDto {
                /**参数类型：string / integer / number / boolean / array / object*/
                @JsonProperty("type")
                private String Type;

                /**格式*/
                @JsonProperty("format")
                private String Format;

                /**参数描述*/
                @JsonProperty("description")
                private String Description;

                /**字符串最大长度*/
                @JsonProperty("maxLength")
                private Integer MaxLength;

                /**字符串最小长度*/
                @JsonProperty("minLength")
                private Integer MinLength;

                /**数组最小长度*/
                @JsonProperty("minItems")
                private Integer MinItems;

                /**数组最大长度*/
                @JsonProperty("maxItems")
                private Integer MaxItems;

                /**嵌套属性定义*/
                @JsonProperty("properties")
                private ApiDetailApiParamsPropertiesPropertiesDto Properties;

                @Data
                @ToString
                public static class ApiDetailApiParamsPropertiesPropertiesDto {
                }

                /**数组元素定义*/
                @JsonProperty("items")
                private ApiDetailApiParamsPropertiesItemsDto Items;

                @Data
                @ToString
                public static class ApiDetailApiParamsPropertiesItemsDto {
                }

                /**嵌套层的必填参数列表*/
                @JsonProperty("required")
                private List<String> Required;

                /**是否允许额外属性*/
                @JsonProperty("additionalProperties")
                private Boolean AdditionalProperties;

            }

            /**必填参数列表*/
            @JsonProperty("required")
            private List<String> Required;

            /**是否允许额外属性，默认false*/
            @JsonProperty("additionalProperties")
            private Boolean AdditionalProperties;

        }

        /**HTTP方法*/
        @JsonProperty("HttpMethod")
        private String HttpMethod;

        /**内容类型*/
        @JsonProperty("ContentType")
        private String ContentType;

        /**API分组*/
        @JsonProperty("ApiGroup")
        private String ApiGroup;

        /**API Explorer链接*/
        @JsonProperty("ApiExplorerUrl")
        private String ApiExplorerUrl;

        /**操作类型：Create / Update / Read / Delete等*/
        @JsonProperty("OperationType")
        private String OperationType;

    }

}
