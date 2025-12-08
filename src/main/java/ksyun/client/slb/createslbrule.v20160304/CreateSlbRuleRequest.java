package ksyun.client.slb.createslbrule.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreateSlbRuleRequest
* @Description 请求参数
*/
@Data
public class CreateSlbRuleRequest{
    /**Url路径*/
    @KsYunField(name="Path")
    private String Path;

    /**域名的ID*/
    @KsYunField(name="HostHeaderId")
    private String HostHeaderId;

    /**后端服务器组的ID*/
    @KsYunField(name="BackendServerGroupId")
    private String BackendServerGroupId;

    /**是否同步监听器的健康检查、会话保持和转发算法*/
    @KsYunField(name="ListenerSync")
    private String ListenerSync;

    /**监听器的转发方式(RoundRobin|LeastConnections|MasterSlave|QUIC_CID|IPHash)*/
    @KsYunField(name="Method")
    private String Method;

    /**会话保持的状态，在ListenerSync为off时有效*/
    @KsYunField(name="SessionState")
    private String SessionState;

    /**会话保持超时时间*/
    @KsYunField(name="SessionPersistencePeriod")
    private Integer SessionPersistencePeriod;

    /**会话类型(ImplantCookie|RewriteCookie)*/
    @KsYunField(name="cookieType")
    private String CookieType;

    /**cookie名字*/
    @KsYunField(name="CookieName")
    private String CookieName;

    /**健康检查保持的状态(start|stop)，在ListenerSync为off时有效*/
    @KsYunField(name="HealthCheckState")
    private String HealthCheckState;

    /**健康阈值*/
    @KsYunField(name="HealthyThreshold")
    private String HealthyThreshold;

    /**健康检查时间间隔*/
    @KsYunField(name="Interval")
    private Integer Interval;

    /**健康检查超时时间*/
    @KsYunField(name="Timeout")
    private Integer Timeout;

    /**不健康阈值*/
    @KsYunField(name="UnhealthyThreshold")
    private Integer UnhealthyThreshold;

    /**HTTP类型监听器健康检查的链接*/
    @KsYunField(name="UrlPath")
    private String UrlPath;

    /**HTTP类型健康检查的域名*/
    @KsYunField(name="HostName")
    private String HostName;

}
