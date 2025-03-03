package ksyun.client.slb.configurehealthcheck.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ConfigureHealthCheckRequest
 * @Description 请求参数
 */
@Data
public class ConfigureHealthCheckRequest {
    /**
     * 监听器的ID
     */
    @KsYunField(name = "ListenerId")
    private String ListenerId;

    /**
     * 健康检查保持的状态(start|stop)
     */
    @KsYunField(name = "HealthCheckState")
    private String HealthCheckState;

    /**
     * 健康检查端口
     */
    @KsYunField(name = "HealthCheckConnectPort")
    private Integer HealthCheckConnectPort;

    /**
     * 健康阈值
     */
    @KsYunField(name = "HealthyThreshold")
    private Integer HealthyThreshold;

    /**
     * 健康检查时间间隔
     */
    @KsYunField(name = "Interval")
    private Integer Interval;

    /**
     * 健康检查超时时间
     */
    @KsYunField(name = "Timeout")
    private Integer Timeout;

    /**
     * 不健康阈值
     */
    @KsYunField(name = "UnhealthyThreshold")
    private Integer UnhealthyThreshold;

    /**
     * 健康检查协议 (TCP|ICMP|UDP|HTTP), 当监听器为HTTP/HTTPS类型时可选值为UDP|HTTP ， 当监听器为UDP类型时可选值为UDP|ICMP
     */
    @KsYunField(name = "HealthProtocol")
    private String HealthProtocol;

    /**
     * HTTP请求方式 (GET|HEAD)
     */
    @KsYunField(name = "HttpMethod")
    private String HttpMethod;

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
     * UDP监听健康检查的请求串
     */
    @KsYunField(name = "HealthCheckReq")
    private String HealthCheckReq;

    /**
     * UDP监听健康检查的响应串
     */
    @KsYunField(name = "HealthCheckExp")
    private String HealthCheckExp;


}