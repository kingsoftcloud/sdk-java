package ksyun.client.slb.describerulegroups.v20250430;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeRuleGroupsResponse
* @Description DescribeRuleGroups 返回体
*/
@Data
@ToString
public class DescribeRuleGroupsResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**获取另一页返回结果的 token.*/
    @JsonProperty("NextToken")
    private String NextToken;

    /**转发策略的信息*/
    @JsonProperty("RuleGroupSet")
    private List<RuleGroupSetDto> RuleGroupSet;

    @Data
    @ToString
    public static class RuleGroupSetDto {
        /**转发策略的ID*/
        @JsonProperty("RuleGroupId")
        private String RuleGroupId;

        /**负载均衡监听器的ID*/
        @JsonProperty("ListenerId")
        private String ListenerId;

        /**转发策略的名称*/
        @JsonProperty("RuleGroupName")
        private String RuleGroupName;

        /**后端服务器组的ID*/
        @JsonProperty("BackendServerGroupId")
        private String BackendServerGroupId;

        /**规则的信息*/
        @JsonProperty("RuleSet")
        private List<RuleGroupSetRuleSetDto> RuleSet;

        @Data
        @ToString
        public static class RuleGroupSetRuleSetDto {
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
            private List<RuleGroupSetRuleSetHeaderValueDto> HeaderValue;

            @Data
            @ToString
            public static class RuleGroupSetRuleSetHeaderValueDto {
                /**HTTP标头,查询字符串的键值*/
                @JsonProperty("Key")
                private String Key;

                /**HTTP标头,查询字符串,Cookie转发条件的value值*/
                @JsonProperty("Value")
                private List<String> Value;

            }

            /**查询字符串*/
            @JsonProperty("QueryValue")
            private List<RuleGroupSetRuleSetQueryValueDto> QueryValue;

            @Data
            @ToString
            public static class RuleGroupSetRuleSetQueryValueDto {
                /**HTTP标头,查询字符串的键值*/
                @JsonProperty("Key")
                private String Key;

                /**HTTP标头,查询字符串,Cookie转发条件的value值*/
                @JsonProperty("Value")
                private List<String> Value;

            }

            /**Cookie转发条件*/
            @JsonProperty("CookieValue")
            private List<RuleGroupSetRuleSetCookieValueDto> CookieValue;

            @Data
            @ToString
            public static class RuleGroupSetRuleSetCookieValueDto {
                /**HTTP标头,查询字符串的键值*/
                @JsonProperty("Key")
                private String Key;

                /**HTTP标头,查询字符串,Cookie转发条件的value值*/
                @JsonProperty("Value")
                private List<String> Value;

            }

        }

        /**重定向监听器ID*/
        @JsonProperty("RedirectListenerId")
        private String RedirectListenerId;

        /**重定向状态码,301|302|307*/
        @JsonProperty("RedirectHttpCode")
        private String RedirectHttpCode;

        /**重写*/
        @JsonProperty("RewriteConfig")
        private RuleGroupSetRewriteConfigDto RewriteConfig;

        @Data
        @ToString
        public static class RuleGroupSetRewriteConfigDto {
            /**重写的域名*/
            @JsonProperty("HttpHost")
            private String HttpHost;

            /**重写的路经*/
            @JsonProperty("Url")
            private String Url;

            /**重写的查询字符串*/
            @JsonProperty("QueryString")
            private String QueryString;

        }

        /**返回固定响应信息*/
        @JsonProperty("FixedResponseConfig")
        private RuleGroupSetFixedResponseConfigDto FixedResponseConfig;

        @Data
        @ToString
        public static class RuleGroupSetFixedResponseConfigDto {
            /**响应正文长度不能超过1000个字符，不支持中文字符*/
            @JsonProperty("Content")
            private String Content;

            /**响应正文类型,text/plain|text/css|text/html|application/javascript|application/json*/
            @JsonProperty("ContentType")
            private String ContentType;

            /**响应状态码,仅支持2xx、4xx、5xx数字型字符串，x为任意数字*/
            @JsonProperty("HttpCode")
            private String HttpCode;

        }

    }

}
