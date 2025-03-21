package ksyun.client.slb.modifyalbrulegroup.v20160304;

import common.annotation.KsYunField;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * @Classname ModifyAlbRuleGroupRequest
 * @Description 请求参数
 */
@Data
public class ModifyAlbRuleGroupRequest {
    /**
     * 转发策略的ID
     */
    @KsYunField(name = "AlbRuleGroupId")
    private String AlbRuleGroupId;

    /**
     * 转发策略的名称
     */
    @KsYunField(name = "AlbRuleGroupName")
    private String AlbRuleGroupName;

    /**
     * 后端服务器组的ID
     */
    @KsYunField(name = "BackendServerGroupId")
    private String BackendServerGroupId;

    /**
     * 是否同步监听器的健康检查、会话保持和转发算法(on | off)
     */
    @KsYunField(name = "ListenerSync")
    private String ListenerSync;

    /**
     * 监听器的转发方式(RoundRobin|LeastConnections)
     */
    @KsYunField(name = "Method")
    private String Method;

    /**
     * 转发动作类型
     */
    @KsYunField(name = "Type")
    private String Type;

    /**
     * 会话保持的状态，在ListenerSync为off时有效
     */
    @KsYunField(name = "SessionState")
    private String SessionState;

    /**
     * 会话保持超时时间
     */
    @KsYunField(name = "SessionPersistencePeriod")
    private Integer SessionPersistencePeriod;

    /**
     * 会话类型(ImplantCookie|RewriteCookie)
     */
    @KsYunField(name = "CookieType")
    private String CookieType;

    /**
     * Cookie的名称
     */
    @KsYunField(name = "CookieName")
    private String CookieName;

    /**
     * 健康检查保持的状态(start|stop)，在ListenerSync为off时有效
     */
    @KsYunField(name = "HealthCheckState")
    private String HealthCheckState;

    /**
     * 健康检查超时时间
     */
    @KsYunField(name = "Timeout")
    private Integer Timeout;

    /**
     * 健康检查时间间隔
     */
    @KsYunField(name = "Interval")
    private Integer Interval;

    /**
     * 健康阈值
     */
    @KsYunField(name = "HealthyThreshold")
    private Integer HealthyThreshold;

    /**
     * 不健康阈值
     */
    @KsYunField(name = "UnhealthyThreshold")
    private Integer UnhealthyThreshold;

    /**
     * HTTP类型监听器健康检查的链接
     */
    @KsYunField(name = "UrlPath")
    private String UrlPath;

    /**
     * HTTP类型健康检查的域名
     */
    @KsYunField(name = "HostName")
    private String HostName;

    /**
     * 规则的信息
     */
    @KsYunField(name = "AlbRuleSet", type = 2)
    private List<AlbRuleSetDto> AlbRuleSetList;
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
}