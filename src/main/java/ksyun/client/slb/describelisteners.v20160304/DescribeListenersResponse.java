package ksyun.client.slb.describelisteners.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeListenersResponse
* @Description DescribeListeners 返回体
*/
@Data
@ToString
public class DescribeListenersResponse extends BaseResponseModel {
    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**获取另一页返回结果的 token.*/
    @JsonProperty("NextToken")
    private String NextToken;

    /**监听器的信息*/
    @JsonProperty("ListenerSet")
    private List<ListenerSetDto> ListenerSet;

    @Data
    @ToString
    public static class ListenerSetDto {
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

        /**证书的ID*/
        @JsonProperty("CertificateId")
        private String CertificateId;

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

        /**IP版本*/
        @JsonProperty("IpVersion")
        private String IpVersion;

        /**是否作为PrivateLinkServer使用*/
        @JsonProperty("AsPrivateLinkServer")
        private Boolean AsPrivateLinkServer;

        /**是否为创建privatelink自动生成的监听器*/
        @JsonProperty("AsPrivateLink")
        private Boolean AsPrivateLink;

        /**监听器是否健康*/
        @JsonProperty("HealthStatus")
        private Boolean HealthStatus;

        /**监听器支持的挂载类型*/
        @JsonProperty("BindType")
        private String BindType;

        /**后端服务器组的信息*/
        @JsonProperty("BackendServerGroupIdSet")
        private List<ListenerSetDtoBackendServerGroupIdSetDto> BackendServerGroupIdSet;

        @Data
        @ToString
        public static class ListenerSetDtoBackendServerGroupIdSetDto {
            /**后端服务器组的ID*/
            @JsonProperty("BackendServerGroupId")
            private String BackendServerGroupId;

        }

        /**真实服务器的信息*/
        @JsonProperty("RealServer")
        private List<ListenerSetDtoRealServerDto> RealServer;

        @Data
        @ToString
        public static class ListenerSetDtoRealServerDto {
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

        /**后端服务器的信息*/
        @JsonProperty("BackendServerSet")
        private List<ListenerSetDtoBackendServerSetDto> BackendServerSet;

        @Data
        @ToString
        public static class ListenerSetDtoBackendServerSetDto {
            /**所属后端服务组的ID*/
            @JsonProperty("BackendServerGroupId")
            private String BackendServerGroupId;

            /**后端服务的IP*/
            @JsonProperty("BackendServerIp")
            private String BackendServerIp;

            /**服务器的ID*/
            @JsonProperty("InstanceId")
            private String InstanceId;

            /**绑定服务器组的注册ID*/
            @JsonProperty("RegisterId")
            private String RegisterId;

            /**后端服务的端口*/
            @JsonProperty("BackendServerPort")
            private Integer BackendServerPort;

            /**边界网关的ID*/
            @JsonProperty("DirectConnectGatewayId")
            private String DirectConnectGatewayId;

            /**实例的权重*/
            @JsonProperty("Weight")
            private Integer Weight;

            /**镜像服务器组的真实服务器的状态*/
            @JsonProperty("BackendServerState")
            private String BackendServerState;

        }

        /**客户端证书*/
        @JsonProperty("CaCertificateId")
        private String CaCertificateId;

        /**客户端证书开启状态*/
        @JsonProperty("CaEnabled")
        private Boolean CaEnabled;

        /**开启后端长连接*/
        @JsonProperty("UpstreamKeepalive")
        private String UpstreamKeepalive;

    }

}
