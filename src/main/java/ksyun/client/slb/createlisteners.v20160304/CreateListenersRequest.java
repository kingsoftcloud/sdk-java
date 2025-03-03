package ksyun.client.slb.createlisteners.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname CreateListenersRequest
 * @Description 请求参数
 */
@Data
public class CreateListenersRequest {
    /**
     * 负载均衡的ID
     */
    @KsYunField(name = "LoadBalancerId")
    private String LoadBalancerId;

    /**
     * 监听器的名称
     */
    @KsYunField(name = "ListenerName")
    private String ListenerName;

    /**
     * 监听器的状态(start|stop)
     */
    @KsYunField(name = "ListenerState")
    private String ListenerState;

    /**
     * 监听器的协议(TCP|HTTP|HTTPS|UDP)
     */
    @KsYunField(name = "ListenerProtocol")
    private String ListenerProtocol;

    /**
     * 监听器支持的挂载类型(RealServer|BackendServerGroup)
     */
    @KsYunField(name = "BindType")
    private String BindType;

    /**
     * 监听器的协议端口
     */
    @KsYunField(name = "ListenerPort")
    private Integer ListenerPort;

    /**
     * 监听器的转发方式(RoundRobin|LeastConnections|MasterSlave|QUIC_CID|IPHash)
     */
    @KsYunField(name = "Method")
    private String Method;

    /**
     * 监听器的入带宽限速，单位Mbps，仅内网LB有此字段
     */
    @KsYunField(name = "BandWidthIn")
    private Integer BandWidthIn;

    /**
     * 监听器的出带宽限速，单位Mbps，仅内网LB有此字段
     */
    @KsYunField(name = "BandWidthOut")
    private Integer BandWidthOut;

    /**
     * LoadBalancerAcl的ID
     */
    @KsYunField(name = "LoadBalancerAclId")
    private String LoadBalancerAclId;

    /**
     * 后端协议版本(HTTP1.0|HTTP1.1)
     */
    @KsYunField(name = "HttpProtocol")
    private String HttpProtocol;

    /**
     * TLS安全策略
     */
    @KsYunField(name = "TlsCipherPolicy")
    private String TlsCipherPolicy;

    /**
     * 是否启用HTTP/2，HTTPS监听器需要传此参数
     */
    @KsYunField(name = "EnableHttp2")
    private Boolean EnableHttp2;

    /**
     * 重定向监听器ID
     */
    @KsYunField(name = "RedirectListenerId")
    private String RedirectListenerId;

    /**
     * 会话保持的状态(start|stop)
     */
    @KsYunField(name = "SessionState")
    private String SessionState;

    /**
     * 会话保持超时时间
     */
    @KsYunField(name = "SessionPersistencePeriod")
    private Integer SessionPersistencePeriod;

    /**
     * 会话类型
     */
    @KsYunField(name = "CookieType")
    private String CookieType;

    /**
     * Cookie的名称
     */
    @KsYunField(name = "CookieName")
    private String CookieName;

    /**
     * 证书的ID
     */
    @KsYunField(name = "CertificateId")
    private String CertificateId;

    /**
     * 客户端证书，CaEnabled = true，必填
     */
    @KsYunField(name = "CaCertificateId")
    private String CaCertificateId;

    /**
     * 是否开启双向认证
     */
    @KsYunField(name = "CaEnabled")
    private Boolean CaEnabled;


}