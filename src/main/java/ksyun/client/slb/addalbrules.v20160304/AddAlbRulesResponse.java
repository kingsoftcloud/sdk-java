package ksyun.client.slb.addalbrules.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname AddAlbRulesResponse
* @Description AddAlbRules 返回体
*/
@Data
@ToString
public class AddAlbRulesResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**规则的信息*/
    @JsonProperty("AlbRule")
    private AlbRuleDto AlbRule;

    @Data
    @ToString
    public static class AlbRuleDto {
        /**匹配规则类型(domain|url|method|sourceIp|header|query|cookie)*/
        @JsonProperty("AlbRuleType")
        private String AlbRuleType;

        /**匹配规则的值*/
        @JsonProperty("AlbRuleValue")
        private String AlbRuleValue;

        /**HTTP请求方法*/
        @JsonProperty("MethodValue")
        private List<String> MethodValue;

        /**SourceIp*/
        @JsonProperty("SourceIpValue")
        private List<String> SourceIpValue;

        /**HTTP标头*/
        @JsonProperty("HeaderValue")
        private List<AlbRuleHeaderValueDto> HeaderValue;

        @Data
        @ToString
        public static class AlbRuleHeaderValueDto {
            /**HTTP标头,查询字符串的键值*/
            @JsonProperty("Key")
            private String Key;

            /**HTTP标头,查询字符串,Cookie转发条件的value值*/
            @JsonProperty("Value")
            private List<String> Value;

        }

        /**查询字符串*/
        @JsonProperty("QueryValue")
        private List<AlbRuleQueryValueDto> QueryValue;

        @Data
        @ToString
        public static class AlbRuleQueryValueDto {
            /**HTTP标头,查询字符串的键值*/
            @JsonProperty("Key")
            private String Key;

            /**HTTP标头,查询字符串,Cookie转发条件的value值*/
            @JsonProperty("Value")
            private List<String> Value;

        }

        /**Cookie转发条件*/
        @JsonProperty("CookieValue")
        private List<AlbRuleCookieValueDto> CookieValue;

        @Data
        @ToString
        public static class AlbRuleCookieValueDto {
            /**HTTP标头,查询字符串的键值*/
            @JsonProperty("Key")
            private String Key;

            /**HTTP标头,查询字符串,Cookie转发条件的value值*/
            @JsonProperty("Value")
            private List<String> Value;

        }

    }

}
