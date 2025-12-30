package ksyun.client.slb.modifyalbrulegroup.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ModifyAlbRuleGroupResponse
* @Description ModifyAlbRuleGroup 返回体
*/
@Data
@ToString
public class ModifyAlbRuleGroupResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**转发策略的信息*/
    @JsonProperty("AlbRuleGroup")
    private AlbRuleGroupDto AlbRuleGroup;

    @Data
    @ToString
    public static class AlbRuleGroupDto {
        /**转发策略的ID*/
        @JsonProperty("AlbRuleGroupId")
        private String AlbRuleGroupId;

        /**应用型负载均衡监听器的ID*/
        @JsonProperty("AlbListenerId")
        private String AlbListenerId;

        /**转发策略的名称*/
        @JsonProperty("AlbRuleGroupName")
        private String AlbRuleGroupName;

        /**后端服务器组的ID*/
        @JsonProperty("BackendServerGroupId")
        private String BackendServerGroupId;

        /**规则的信息*/
        @JsonProperty("AlbRuleSet")
        private List<AlbRuleGroupAlbRuleSetDto> AlbRuleSet;

        @Data
        @ToString
        public static class AlbRuleGroupAlbRuleSetDto {
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
            private List<AlbRuleGroupAlbRuleSetHeaderValueDto> HeaderValue;

            @Data
            @ToString
            public static class AlbRuleGroupAlbRuleSetHeaderValueDto {
                /**HTTP标头,查询字符串的键值*/
                @JsonProperty("Key")
                private String Key;

                /**HTTP标头,查询字符串,Cookie转发条件的value值*/
                @JsonProperty("Value")
                private List<String> Value;

            }

            /**查询字符串*/
            @JsonProperty("QueryValue")
            private List<AlbRuleGroupAlbRuleSetQueryValueDto> QueryValue;

            @Data
            @ToString
            public static class AlbRuleGroupAlbRuleSetQueryValueDto {
                /**HTTP标头,查询字符串的键值*/
                @JsonProperty("Key")
                private String Key;

                /**HTTP标头,查询字符串,Cookie转发条件的value值*/
                @JsonProperty("Value")
                private List<String> Value;

            }

            /**Cookie转发条件*/
            @JsonProperty("CookieValue")
            private List<AlbRuleGroupAlbRuleSetCookieValueDto> CookieValue;

            @Data
            @ToString
            public static class AlbRuleGroupAlbRuleSetCookieValueDto {
                /**HTTP标头,查询字符串的键值*/
                @JsonProperty("Key")
                private String Key;

                /**HTTP标头,查询字符串,Cookie转发条件的value值*/
                @JsonProperty("Value")
                private List<String> Value;

            }

        }

        /**重写*/
        @JsonProperty("RewriteConfig")
        private AlbRuleGroupRewriteConfigDto RewriteConfig;

        @Data
        @ToString
        public static class AlbRuleGroupRewriteConfigDto {
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
        private AlbRuleGroupFixedResponseConfigDto FixedResponseConfig;

        @Data
        @ToString
        public static class AlbRuleGroupFixedResponseConfigDto {
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
