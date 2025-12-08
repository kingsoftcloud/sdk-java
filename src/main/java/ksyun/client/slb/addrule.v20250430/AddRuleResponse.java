package ksyun.client.slb.addrule.v20250430;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname AddRuleResponse
* @Description AddRule 返回体
*/
@Data
@ToString
public class AddRuleResponse extends BaseResponseModel {
    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**规则的信息*/
    @JsonProperty("Rule")
    private RuleDto Rule;

    @Data
    @ToString
    public static class RuleDto {
        /**匹配规则类型(domain|url|method|sourceIp|header|query|cookie)*/
        @JsonProperty("RuleType")
        private String RuleType;

        /**匹配规则的值*/
        @JsonProperty("RuleValue")
        private String RuleValue;

        /**HTTP请求方法*/
        @JsonProperty("MethodValue")
        private List<String> MethodValue;

        /**SourceIp*/
        @JsonProperty("SourceIpValue")
        private List<String> SourceIpValue;

        /**HTTP标头*/
        @JsonProperty("HeaderValue")
        private List<HeaderValueDto> HeaderValue;

        @Data
        @ToString
        public static class HeaderValueDto {
            /**HTTP标头,查询字符串的键值*/
            @JsonProperty("Key")
            private String Key;

            /**HTTP标头,查询字符串,Cookie转发条件的value值*/
            @JsonProperty("Value")
            private List<String> Value;

        }

        /**查询字符串*/
        @JsonProperty("QueryValue")
        private List<QueryValueDto> QueryValue;

        @Data
        @ToString
        public static class QueryValueDto {
            /**HTTP标头,查询字符串的键值*/
            @JsonProperty("Key")
            private String Key;

            /**HTTP标头,查询字符串,Cookie转发条件的value值*/
            @JsonProperty("Value")
            private List<String> Value;

        }

        /**Cookie转发条件*/
        @JsonProperty("CookieValue")
        private List<CookieValueDto> CookieValue;

        @Data
        @ToString
        public static class CookieValueDto {
            /**HTTP标头,查询字符串的键值*/
            @JsonProperty("Key")
            private String Key;

            /**HTTP标头,查询字符串,Cookie转发条件的value值*/
            @JsonProperty("Value")
            private List<String> Value;

        }

    }

}
