package ksyun.client.slb.modifylistener.v20250430;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ModifyListenerRequest
* @Description 请求参数
*/
@Data
public class ModifyListenerRequest{
    /**监听器的ID*/
    @KsYunField(name="ListenerId")
    private String ListenerId;

    /**负载均衡监听器的名称*/
    @KsYunField(name="ListenerName")
    private String ListenerName;

    /**监听器的状态*/
    @KsYunField(name="ListenerState")
    private String ListenerState;

    /**证书的ID*/
    @KsYunField(name="CertificateId")
    private String CertificateId;

    /**TLS安全策略*/
    @KsYunField(name="TlsCipherPolicy")
    private String TlsCipherPolicy;

    /**LoadBalancerAcl的ID*/
    @KsYunField(name="ListenerAclId")
    private String ListenerAclId;

    /**后端协议版本(HTTP1.0|HTTP1.1)*/
    @KsYunField(name="HttpProtocol")
    private String HttpProtocol;

    /**是否启用HTTP/2*/
    @KsYunField(name="EnableHttp2")
    private Boolean EnableHttp2;

    /**是否开启双向认证*/
    @KsYunField(name="CaEnabled")
    private Boolean CaEnabled;

    /**客户端证书*/
    @KsYunField(name="CaCertificateId")
    private String CaCertificateId;

    /**是否开启QUIC*/
    @KsYunField(name="EnableQuicUpgrade")
    private Boolean EnableQuicUpgrade;

    /**QUIC监听器id*/
    @KsYunField(name="QuicListenerId")
    private String QuicListenerId;

    /**空闲超时时间(s)*/
    @KsYunField(name="IdleTimeout")
    private Integer IdleTimeout;

    /**服务器组 ID*/
    @KsYunField(name="ServerGroupId")
    private String ServerGroupId;

}
