package ksyun.client.slb.modifylisteners.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ModifyListenersResponse
* @Description ModifyListeners 返回体
*/
@Data
@ToString
public class ModifyListenersResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**负载均衡的ID*/
    @JsonProperty("LoadBalancerId")
    private String LoadBalancerId;

    /**创建时间*/
    @JsonProperty("CreateTime")
    private String CreateTime;

    /**监听器的名称*/
    @JsonProperty("ListenerName")
    private String ListenerName;

    /**监听器的ID*/
    @JsonProperty("ListenerId")
    private String ListenerId;

    /**监听器的状态*/
    @JsonProperty("ListenerState")
    private String ListenerState;

    /**监听器的协议*/
    @JsonProperty("ListenerProtocol")
    private String ListenerProtocol;

    /**监听器的协议端口*/
    @JsonProperty("ListenerPort")
    private Integer ListenerPort;

    /**监听器的转发方式*/
    @JsonProperty("Method")
    private String Method;

    /**监听器的入带宽限速，单位Mbps，仅内网LB有此字段*/
    @JsonProperty("BandWidthIn")
    private Integer BandWidthIn;

    /**监听器的出带宽限速，单位Mbps，仅内网LB有此字段*/
    @JsonProperty("BandWidthOut")
    private Integer BandWidthOut;

    /**LoadBalancerAcl的ID*/
    @JsonProperty("LoadBalancerAclId")
    private String LoadBalancerAclId;

    /**后端协议版本*/
    @JsonProperty("HttpProtocol")
    private String HttpProtocol;

    /**TLS安全策略*/
    @JsonProperty("TlsCipherPolicy")
    private String TlsCipherPolicy;

    /**是否启用HTTP/2*/
    @JsonProperty("EnableHttp2")
    private Boolean EnableHttp2;

    /**重定向监听器ID*/
    @JsonProperty("RedirectListenerId")
    private String RedirectListenerId;

    /**健康检查的信息*/
    @JsonProperty("HealthCheck")
    private HealthCheckDto HealthCheck;

    @Data
    @ToString
    public static class HealthCheckDto {
        /**监听器的ID*/
        @JsonProperty("ListenerId")
        private String ListenerId;

        /**健康检查保持的状态*/
        @JsonProperty("HealthCheckState")
        private String HealthCheckState;

        /**健康检查的ID*/
        @JsonProperty("HealthCheckId")
        private String HealthCheckId;

        /**健康检查方法*/
        @JsonProperty("HttpMethod")
        private String HttpMethod;

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

        /**HTTP类型健康检查的域名*/
        @JsonProperty("HostName")
        private String HostName;

        /**UDP监听健康检查的请求串*/
        @JsonProperty("HealthCheckReq")
        private String HealthCheckReq;

        /**UDP监听健康检查的响应串*/
        @JsonProperty("HealthCheckExp")
        private String HealthCheckExp;

        /**健康检查端口*/
        @JsonProperty("HealthCheckConnectPort")
        private Integer HealthCheckConnectPort;

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

    /**真实服务器的信息*/
    @JsonProperty("RealServer")
    private List<RealServerDto> RealServer;

    @Data
    @ToString
    public static class RealServerDto {
        /**绑定服务器组的注册ID*/
        @JsonProperty("RegisterId")
        private String RegisterId;

        /**真实服务器的状态，健康，不健康，检查未完成，检查未开启*/
        @JsonProperty("RealServerState")
        private String RealServerState;

        /**后端服务器的类型*/
        @JsonProperty("RealServerType")
        private String RealServerType;

        /**监听器的ID*/
        @JsonProperty("ListenerId")
        private String ListenerId;

        /**实例的权重*/
        @JsonProperty("Weight")
        private Integer Weight;

        /**真实服务的IP*/
        @JsonProperty("RealServerIp")
        private String RealServerIp;

        /**后端服务的端口*/
        @JsonProperty("RealServerPort")
        private Integer RealServerPort;

        /**- 实例ID
- host类型，填写云主机或者云物理主机的ID*/
        @JsonProperty("InstanceId")
        private String InstanceId;

        /**标签*/
        @JsonProperty("Tag")
        private String Tag;

        /**RealServer的主备类型，仅MasterSlave监听器有此参数*/
        @JsonProperty("MasterSlaveType")
        private String MasterSlaveType;

        /**弹性网卡的ID*/
        @JsonProperty("NetworkInterfaceId")
        private String NetworkInterfaceId;

    }

    /**证书id*/
    @JsonProperty("CertificateId")
    private String CertificateId;

    /**开启后端长连接*/
    @JsonProperty("UpstreamKeepalive")
    private String UpstreamKeepalive;

}
