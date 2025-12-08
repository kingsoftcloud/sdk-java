package ksyun.client.slb.createlistener.v20250430;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateListenerResponse
* @Description CreateListener 返回体
*/
@Data
@ToString
public class CreateListenerResponse extends BaseResponseModel {
    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**监听器的信息*/
    @JsonProperty("Listener")
    private ListenerDto Listener;

    @Data
    @ToString
    public static class ListenerDto {
        /**负载均衡监听器的ID*/
        @JsonProperty("ListenerId")
        private String ListenerId;

        /**负载均衡的ID*/
        @JsonProperty("LoadBalancerId")
        private String LoadBalancerId;

        /**创建时间*/
        @JsonProperty("CreateTime")
        private String CreateTime;

        /**负载均衡监听器的名称*/
        @JsonProperty("ListenerName")
        private String ListenerName;

        /**监听器的协议*/
        @JsonProperty("Protocol")
        private String Protocol;

        /**监听器的协议端口*/
        @JsonProperty("Port")
        private Integer Port;

        /**证书的ID*/
        @JsonProperty("CertificateId")
        private String CertificateId;

        /**TLS安全策略*/
        @JsonProperty("TlsCipherPolicy")
        private String TlsCipherPolicy;

        /**默认服务器组的ID*/
        @JsonProperty("DefaultBackendServerGroupId")
        private String DefaultBackendServerGroupId;

        /**LoadBalancerAcl的ID*/
        @JsonProperty("ListenerAclId")
        private String ListenerAclId;

        /**监听器的状态*/
        @JsonProperty("ListenerState")
        private String ListenerState;

        /**重定向监听器ID*/
        @JsonProperty("RedirectListenerId")
        private String RedirectListenerId;

        /**重定向监听器名称*/
        @JsonProperty("RedirectListenerName")
        private String RedirectListenerName;

        /**后端协议版本*/
        @JsonProperty("HttpProtocol")
        private String HttpProtocol;

        /**是否启用HTTP/2*/
        @JsonProperty("EnableHttp2")
        private Boolean EnableHttp2;

        /**客户端证书*/
        @JsonProperty("CaCertificateId")
        private String CaCertificateId;

        /**客户端证书开启状态*/
        @JsonProperty("CaEnabled")
        private Boolean CaEnabled;

        /**是否开启QUIC*/
        @JsonProperty("EnableQuicUpgrade")
        private Boolean EnableQuicUpgrade;

        /**QUIC监听器id*/
        @JsonProperty("QuicListenerId")
        private String QuicListenerId;

        /**空闲超时时间(s)*/
        @JsonProperty("IdleTimeout")
        private Integer IdleTimeout;

        /**服务器组 ID*/
        @JsonProperty("ServerGroupId")
        private String ServerGroupId;

    }

}
