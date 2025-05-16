package ksyun.client.slb.createalbrulegroup.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname CreateAlbRuleGroupRequest
 * @Description 请求参数
 */
@Data
public class CreateAlbRuleGroupRequest {
    /**
     * 转发策略的名称
     */
    @KsYunField(name = "AlbRuleGroupName")
    private String AlbRuleGroupName;

    /**
     * 应用型负载均衡监听器的ID
     */
    @KsYunField(name = "AlbListenerId")
    private String AlbListenerId;

    /**
     * 后端服务器组的ID
     */
    @KsYunField(name = "BackendServerGroupId")
    private String BackendServerGroupId;

    /**
     * 转发动作类型
     */
    @KsYunField(name = "Type")
    private String Type;

    /**
     * 规则的信息
     */
    @KsYunField(name = "AlbRuleSet", type = 2)
    private List<AlbRuleSetDto> AlbRuleSetList;

    @Data
    @ToString
    public static class AlbRuleSetDto {
        /**
         * 匹配规则类型(domain|url|method|sourceIp|header|query|cookie)
         */
        private String AlbRuleType;
        /**
         * 匹配规则的值
         */
        private String AlbRuleValue;
        /**
         * HTTP请求方法
         */
        @KsYunField(name = "MethodValue", type = 2)
        private List<String> MethodValueList;
        /**
         * SourceIp
         */
        @KsYunField(name = "SourceIpValue", type = 2)
        private List<String> SourceIpValueList;
        /**
         * HTTP标头
         */
        @KsYunField(name = "HeaderValue", type = 2)
        private List<Object> HeaderValueList;
        /**
         * 查询字符串
         */
        @KsYunField(name = "QueryValue", type = 2)
        private List<Object> QueryValueList;
        /**
         * Cookie转发条件
         */
        @KsYunField(name = "CookieValue", type = 2)
        private List<Object> CookieValueList;
    }

    /**
     * 重定向应用型监听器ID
     */
    @KsYunField(name = "RedirectAlbListenerId")
    private String RedirectAlbListenerId;

    /**
     * 重定向状态码,301|302|307
     */
    @KsYunField(name = "RedirectHttpCode")
    private String RedirectHttpCode;

    /**
     * 返回固定响应信息
     */
    @KsYunField(name = "FixedResponseConfig")

    private FixedResponseConfigDto FixedResponseConfigList;

    @Data
    @ToString
    public static class FixedResponseConfigDto {
        /**
         * 响应正文长度不能超过1000个字符，不支持中文字符
         */
        @KsYunField(name = "Content")
        private String Content;
        /**
         * 响应正文类型,text/plain|text/css|text/html|application/javascript|application/json
         */
        @KsYunField(name = "ContentType")
        private String ContentType;
        /**
         * 响应状态码,仅支持2xx、4xx、5xx数字型字符串，x为任意数字
         */
        @KsYunField(name = "HttpCode")
        private String HttpCode;
    }

    /**
     * 重写
     */
    @KsYunField(name = "RewriteConfig")

    private RewriteConfigDto RewriteConfigList;

    @Data
    @ToString
    public static class RewriteConfigDto {
        /**
         * 重写的域名
         */
        @KsYunField(name = "HttpHost")
        private String HttpHost;
        /**
         * 重写的路经
         */
        @KsYunField(name = "Url")
        private String Url;
        /**
         * 重写的查询字符串
         */
        @KsYunField(name = "QueryString")
        private String QueryString;
    }
}