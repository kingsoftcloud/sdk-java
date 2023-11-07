package ksyun.client.slb.createalblistener.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreateAlbListenerRequest
* @Description 请求参数
*/
@Data
public class CreateAlbListenerRequest{
    /**应用型负载均衡的ID*/
    @KsYunField(name="AlbId")
    private String AlbId;

    /**应用型负载均衡监听器的名称*/
    @KsYunField(name="AlbListenerName")
    private String AlbListenerName;

    /**监听器的转发方式(RoundRobin|LeastConnections)*/
    @KsYunField(name="Method")
    private String Method;

    /**监听器的协议(HTTP|HTTPS)*/
    @KsYunField(name="Protocol")
    private String Protocol;

    /**监听器的协议端口*/
    @KsYunField(name="Port")
    private Integer Port;

    /**证书的ID*/
    @KsYunField(name="CertificateId")
    private String CertificateId;

    /**TLS安全策略*/
    @KsYunField(name="TlsCipherPolicy")
    private String TlsCipherPolicy;

    /**LoadBalancerAcl的ID*/
    @KsYunField(name="AlbListenerAclId")
    private String AlbListenerAclId;

    /**应用型监听器的状态(start|stop)*/
    @KsYunField(name="AlbListenerState")
    private String AlbListenerState;

    /**会话保持的状态(start|stop)*/
    @KsYunField(name="SessionState")
    private String SessionState;

    /**会话保持超时时间*/
    @KsYunField(name="SessionPersistencePeriod")
    private Integer SessionPersistencePeriod;

    /**会话类型*/
    @KsYunField(name="CookieType")
    private String CookieType;

    /**Cookie的名称*/
    @KsYunField(name="CookieName")
    private String CookieName;

    /**是否启用HTTP/2*/
    @KsYunField(name="EnableHttp2")
    private Boolean EnableHttp2;

    /**后端协议版本(HTTP1.0|HTTP1.1)*/
    @KsYunField(name="HttpProtocol")
    private String HttpProtocol;


}