package ksyun.client.slb.createrulegroup.v20250430;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreateRuleGroupRequest
* @Description 请求参数
*/
@Data
public class CreateRuleGroupRequest{
    /**转发策略的名称*/
    @KsYunField(name="RuleGroupName")
    private String RuleGroupName;

    /**负载均衡监听器的ID*/
    @KsYunField(name="ListenerId")
    private String ListenerId;

    /**后端服务器组的ID*/
    @KsYunField(name="BackendServerGroupId")
    private String BackendServerGroupId;

    /**转发动作类型*/
    @KsYunField(name="Type")
    private String Type;

    /**规则的信息*/
    @KsYunField(name="RuleSet",type=2)
    private List<RuleSetDto> RuleSetList;

    @Data
    @ToString
    public static class RuleSetDto {
        /**匹配规则类型(domain|url|method|sourceIp|header|query|cookie)*/
        @KsYunField(name="RuleType")
        private String RuleType;

        /**匹配规则的值*/
        @KsYunField(name="RuleValue")
        private String RuleValue;

        /**HTTP请求方法*/
        @KsYunField(name="MethodValue",type=2)
        private List<String> MethodValueList;

        /**SourceIp*/
        @KsYunField(name="SourceIpValue",type=2)
        private List<String> SourceIpValueList;

        /**HTTP标头*/
        @KsYunField(name="HeaderValue",type=2)
        private List<HeaderValueDto> HeaderValueList;

        @Data
        @ToString
        public static class HeaderValueDto {
            /**HTTP标头,查询字符串的键值*/
            @KsYunField(name="Key")
            private String Key;

            /**HTTP标头,查询字符串,Cookie转发条件的value值*/
            @KsYunField(name="Value",type=2)
            private List<String> ValueList;

        }

        /**查询字符串*/
        @KsYunField(name="QueryValue",type=2)
        private List<QueryValueDto> QueryValueList;

        @Data
        @ToString
        public static class QueryValueDto {
            /**HTTP标头,查询字符串的键值*/
            @KsYunField(name="Key")
            private String Key;

            /**HTTP标头,查询字符串,Cookie转发条件的value值*/
            @KsYunField(name="Value",type=2)
            private List<String> ValueList;

        }

        /**Cookie转发条件*/
        @KsYunField(name="CookieValue",type=2)
        private List<CookieValueDto> CookieValueList;

        @Data
        @ToString
        public static class CookieValueDto {
            /**HTTP标头,查询字符串的键值*/
            @KsYunField(name="Key")
            private String Key;

            /**HTTP标头,查询字符串,Cookie转发条件的value值*/
            @KsYunField(name="Value",type=2)
            private List<String> ValueList;

        }

    }

    /**重定向监听器ID*/
    @KsYunField(name="RedirectListenerId")
    private String RedirectListenerId;

    /**重定向状态码,301|302|307*/
    @KsYunField(name="RedirectHttpCode")
    private String RedirectHttpCode;

    /**返回固定响应信息*/
    private FixedResponseConfigDto FixedResponseConfigList;

    @Data
    @ToString
    public static class FixedResponseConfigDto {
        /**响应正文长度不能超过1000个字符，不支持中文字符*/
        @KsYunField(name="Content")
        private String Content;

        /**响应正文类型,text/plain|text/css|text/html|application/javascript|application/json*/
        @KsYunField(name="ContentType")
        private String ContentType;

        /**响应状态码,仅支持2xx、4xx、5xx数字型字符串，x为任意数字*/
        @KsYunField(name="HttpCode")
        private String HttpCode;

    }

    /**重写*/
    private RewriteConfigDto RewriteConfigList;

    @Data
    @ToString
    public static class RewriteConfigDto {
        /**重写的域名*/
        @KsYunField(name="HttpHost")
        private String HttpHost;

        /**重写的路经*/
        @KsYunField(name="Url")
        private String Url;

        /**重写的查询字符串*/
        @KsYunField(name="QueryString")
        private String QueryString;

    }

}
