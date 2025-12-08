package ksyun.client.slb.describerules.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeRulesResponse
* @Description DescribeRules 返回体
*/
@Data
@ToString
public class DescribeRulesResponse extends BaseResponseModel {
    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**获取另一页返回结果的 token.*/
    @JsonProperty("NextToken")
    private String NextToken;

    /**规则的信息*/
    @JsonProperty("RuleSet")
    private List<RuleSetDto> RuleSet;

    @Data
    @ToString
    public static class RuleSetDto {
        /**监听器的转发方式*/
        @JsonProperty("Method")
        private String Method;

        /**后端服务器组的ID*/
        @JsonProperty("BackendServerGroupId")
        private String BackendServerGroupId;

        /**HTTP类型监听器健康检查的链接*/
        @JsonProperty("Path")
        private String Path;

        /**规则ID*/
        @JsonProperty("RuleId")
        private String RuleId;

        /**是否同步监听器的健康检查、会话保持和转发算法*/
        @JsonProperty("ListenerSync")
        private String ListenerSync;

        /**域名的ID*/
        @JsonProperty("HostHeaderId")
        private String HostHeaderId;

        /**创建时间*/
        @JsonProperty("CreateTime")
        private String CreateTime;

        /**健康检查的信息*/
        @JsonProperty("HealthCheck")
        private HealthCheckDto HealthCheck;

        @Data
        @ToString
        public static class HealthCheckDto {
            /**HTTP类型健康检查的域名*/
            @JsonProperty("HostName")
            private String HostName;

            /**健康检查保持的状态*/
            @JsonProperty("HealthCheckState")
            private String HealthCheckState;

            /**健康阈值*/
            @JsonProperty("HealthyThreshold")
            private Integer HealthyThreshold;

            /**健康检查时间间隔*/
            @JsonProperty("Interval")
            private Integer Interval;

            /**健康检查超时时间*/
            @JsonProperty("Timeout")
            private Integer Timeout;

            /**不健康阈值*/
            @JsonProperty("UnhealthyThreshold")
            private Integer UnhealthyThreshold;

            /**HTTP类型监听器健康检查的链接*/
            @JsonProperty("UrlPath")
            private String UrlPath;

        }

        /**会话保持的信息*/
        @JsonProperty("Session")
        private SessionDto Session;

        @Data
        @ToString
        public static class SessionDto {
            /**会话保持的状态*/
            @JsonProperty("SessionState")
            private String SessionState;

            /**会话保持超时时间*/
            @JsonProperty("SessionPersistencePeriod")
            private Integer SessionPersistencePeriod;

            /**会话类型*/
            @JsonProperty("CookieType")
            private String CookieType;

            /**Cookie的名称*/
            @JsonProperty("CookieName")
            private String CookieName;

        }

        /**后端服务的信息*/
        @JsonProperty("BackendServerSet")
        private List<BackendServerSetDto> BackendServerSet;

        @Data
        @ToString
        public static class BackendServerSetDto {
            /**后端服务的IP*/
            @JsonProperty("BackendServerIp")
            private String BackendServerIp;

            /**绑定服务器组的注册ID*/
            @JsonProperty("RegisterId")
            private String RegisterId;

            /**后端服务的端口*/
            @JsonProperty("BackendServerPort")
            private Integer BackendServerPort;

            /**镜像服务器组的真实服务器的状态*/
            @JsonProperty("BackendServerState")
            private String BackendServerState;

        }

    }

}
