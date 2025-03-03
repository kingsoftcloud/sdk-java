package ksyun.client.slb.createalblistener.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname CreateAlbListenerRequest
 * @Description 请求参数
 */
@Data
public class CreateAlbListenerRequest {
    /**
     * 应用型负载均衡的ID
     */
    @KsYunField(name = "AlbId")
    private String AlbId;

    /**
     * 应用型负载均衡监听器的名称
     */
    @KsYunField(name = "AlbListenerName")
    private String AlbListenerName;

    /**
     * 监听器的转发方式(RoundRobin|LeastConnections)
     */
    @KsYunField(name = "Method")
    private String Method;

    /**
     * 监听器的协议(HTTP|HTTPS)
     */
    @KsYunField(name = "Protocol")
    private String Protocol;

    /**
     * 监听器的协议端口
     */
    @KsYunField(name = "Port")
    private Integer Port;

    /**
     * 证书的ID
     */
    @KsYunField(name = "CertificateId")
    private String CertificateId;

    /**
     * 客户端证书的ID
     */
    @KsYunField(name = "CaCertificateId")
    private String CaCertificateId;

    /**
     * 双向认证是否开启
     */
    @KsYunField(name = "CaEnabled")
    private Boolean CaEnabled;

    /**
     * QUIC监听器的ID
     */
    @KsYunField(name = "QuicListenerId")
    private String QuicListenerId;

    /**
     * 开启QUIC升级
     */
    @KsYunField(name = "EnableQuicUpgrade")
    private Boolean EnableQuicUpgrade;

    /**
     * TLS安全策略
     */
    @KsYunField(name = "TlsCipherPolicy")
    private String TlsCipherPolicy;

    /**
     * LoadBalancerAcl的ID
     */
    @KsYunField(name = "AlbListenerAclId")
    private String AlbListenerAclId;

    /**
     * 应用型监听器的状态(start|stop)
     */
    @KsYunField(name = "AlbListenerState")
    private String AlbListenerState;

    /**
     * 重定向应用型监听器ID
     */
    @KsYunField(name = "RedirectAlbListenerId")
    private String RedirectAlbListenerId;

    /**
     * 重定向状态码
     */
    @KsYunField(name = "RedirectHttpCode")
    private String RedirectHttpCode;

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
     * 是否启用HTTP/2
     */
    @KsYunField(name = "EnableHttp2")
    private Boolean EnableHttp2;

    /**
     * 默认转发策略绑定的服务器组ID,目前仅支持创建转发类型的默认转发策略
     */
    @KsYunField(name = "BackendServerGroupId")
    private String BackendServerGroupId;
}