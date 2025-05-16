package ksyun.client.slb.modifyalbbackendservergroup.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname ModifyAlbBackendServerGroupRequest
 * @Description 请求参数
 */
@Data
public class ModifyAlbBackendServerGroupRequest {
    /**
     * ALB服务器组id
     */
    @KsYunField(name = "BackendServerGroupId")
    private String BackendServerGroupId;

    /**
     * ALB负载均衡的名称
     */
    @KsYunField(name = "Name")
    private String Name;

    /**
     * 后端长连接类型
     */
    @KsYunField(name = "UpstreamKeepalive")
    private String UpstreamKeepalive;

    /**
     * 转发方式
     */
    @KsYunField(name = "Method")
    private String Method;

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
     * 健康检查保持的状态(start|stop)
     */
    @KsYunField(name = "HealthCheckState")
    private String HealthCheckState;

    /**
     * 健康检查超时时间
     */
    @KsYunField(name = "Timeout")
    private Integer Timeout;

    /**
     * 健康检查时间间隔
     */
    @KsYunField(name = "Interval")
    private Integer Interval;

    /**
     * 健康阈值
     */
    @KsYunField(name = "HealthyThreshold")
    private Integer HealthyThreshold;

    /**
     * 不健康阈值
     */
    @KsYunField(name = "UnhealthyThreshold")
    private Integer UnhealthyThreshold;

    /**
     * HTTP类型监听器健康检查的链接
     */
    @KsYunField(name = "UrlPath")
    private String UrlPath;

    /**
     * HTTP类型健康检查的域名
     */
    @KsYunField(name = "HostName")
    private String HostName;

    /**
     * 健康检查端口
     */
    @KsYunField(name = "HealthCheckConnectPort")
    private Integer HealthCheckConnectPort;

    /**
     * 健康检查协议 (TCP|HTTP)
     */
    @KsYunField(name = "HealthProtocol")
    private String HealthProtocol;

    /**
     * HTTP请求方式 (GET|HEAD)
     */
    @KsYunField(name = "HttpMethod")
    private String HttpMethod;

    /**
     * 健康状态返回码
     */
    @KsYunField(name = "HealthCode")
    private String HealthCode;

}