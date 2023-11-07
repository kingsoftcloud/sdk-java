package ksyun.client.slb.modifylisteners.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ModifyListenersRequest
* @Description 请求参数
*/
@Data
public class ModifyListenersRequest{
    /**监听器的ID*/
    @KsYunField(name="ListenerId")
    private String ListenerId;

    /**监听器的名称*/
    @KsYunField(name="ListenerName")
    private String ListenerName;

    /**监听器的状态(start|stop)*/
    @KsYunField(name="ListenerState")
    private String ListenerState;

    /**监听器的转发方式(RoundRobin|LeastConnections|MasterSlave|QUIC_CID|IPHash)*/
    @KsYunField(name="Method")
    private String Method;

    /**监听器的入带宽限速，单位Mbps，仅内网LB有此字段*/
    @KsYunField(name="BandWidthIn")
    private Integer BandWidthIn;

    /**监听器的出带宽限速，单位Mbps，仅内网LB有此字段*/
    @KsYunField(name="BandWidthOut")
    private Integer BandWidthOut;

    /**后端协议版本(HTTP1.0|HTTP1.1)*/
    @KsYunField(name="HttpProtocol")
    private String HttpProtocol;

    /**TLS安全策略*/
    @KsYunField(name="TlsCipherPolicy")
    private String TlsCipherPolicy;

    /**是否启用HTTP/2，HTTPS监听器需要传此参数*/
    @KsYunField(name="EnableHttp2")
    private Boolean EnableHttp2;

    /**会话保持的状态*/
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

    /**证书的ID*/
    @KsYunField(name="CertificateId")
    private String CertificateId;

    /**重定向监听器ID*/
    @KsYunField(name="RedirectListenerId")
    private String RedirectListenerId;


}