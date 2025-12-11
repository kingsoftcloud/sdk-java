package ksyun.client.slb.createlistener.v20250430;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreateListenerRequest
* @Description 请求参数
*/
@Data
public class CreateListenerRequest{
    /**负载均衡的ID*/
    @KsYunField(name="LoadBalancerId")
    private String LoadBalancerId;

    /**负载均衡监听器的名称*/
    @KsYunField(name="ListenerName")
    private String ListenerName;

    /**监听器的协议(TCP|UDP|TCPSSL|HTTP|HTTPS|QUIC)*/
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
    @KsYunField(name="ListenerAclId")
    private String ListenerAclId;

    /**监听器的状态(start|stop)*/
    @KsYunField(name="ListenerState")
    private String ListenerState;

    /**重定向监听器ID*/
    @KsYunField(name="RedirectListenerId")
    private String RedirectListenerId;

    /**重定向状态码*/
    @KsYunField(name="RedirectHttpCode")
    private String RedirectHttpCode;

    /**是否启用HTTP/2*/
    @KsYunField(name="EnableHttp2")
    private Boolean EnableHttp2;

    /**默认转发策略绑定的服务器组ID,目前仅支持创建转发类型的默认转发策略*/
    @KsYunField(name="BackendServerGroupId")
    private String BackendServerGroupId;

    /**返回固定响应信息*/
    @KsYunField(name="FixedResponseConfig")
    private FixedResponseConfigDto FixedResponseConfig;

    @Data
    @ToString
    public static class FixedResponseConfigDto {
        /**响应正文长度不能超过1000个字符，不支持中文字符*/
        @KsYunField(name="Content")
        private String Content;

        /**响应正文类型,text/plain|text/css|text/html|application/javascript|application/json*/
        @KsYunField(name="ContentType")
        private String ContentType;

        /**响应状态码,仅支持2xx、4xx、5xx数字型字符串，x为任意数字*/
        @KsYunField(name="HttpCode")
        private String HttpCode;

    }

    /**返回固定响应信息*/
    @KsYunField(name="RewriteConfig")
    private RewriteConfigDto RewriteConfig;

    @Data
    @ToString
    public static class RewriteConfigDto {
        /**重写的域名*/
        @KsYunField(name="HttpHost")
        private String HttpHost;

        /**重写的路经*/
        @KsYunField(name="Url")
        private String Url;

        /**重写的查询字符串*/
        @KsYunField(name="QueryString")
        private String QueryString;

    }

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
