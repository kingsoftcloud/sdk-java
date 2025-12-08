package ksyun.client.slb.modifyhealthcheck.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ModifyHealthCheckRequest
* @Description 请求参数
*/
@Data
public class ModifyHealthCheckRequest{
    /**健康检查的ID*/
    @KsYunField(name="HealthCheckId")
    private String HealthCheckId;

    /**健康检查保持的状态(start|stop)*/
    @KsYunField(name="HealthCheckState")
    private String HealthCheckState;

    /**健康端口*/
    @KsYunField(name="HealthCheckConnectPort")
    private Integer HealthCheckConnectPort;

    /**健康阈值*/
    @KsYunField(name="HealthyThreshold")
    private Integer HealthyThreshold;

    /**健康检查时间间隔*/
    @KsYunField(name="Interval")
    private Integer Interval;

    /**健康检查超时时间*/
    @KsYunField(name="Timeout")
    private Integer Timeout;

    /**不健康阈值*/
    @KsYunField(name="UnhealthyThreshold")
    private Integer UnhealthyThreshold;

    /**健康检查协议 ,仅HTTP/HTTPS协议的监听器支持修改该值(TCP|HTTP)*/
    @KsYunField(name="HealthProtocol")
    private String HealthProtocol;

    /**HTTP请求方式 (GET|HEAD)*/
    @KsYunField(name="HttpMethod")
    private String HttpMethod;

    /**HTTP类型监听器健康检查的链接*/
    @KsYunField(name="UrlPath")
    private String UrlPath;

    /**HTTP类型健康检查的域名*/
    @KsYunField(name="HostName")
    private String HostName;

    /**UDP监听健康检查的请求串*/
    @KsYunField(name="HealthCheckReq")
    private String HealthCheckReq;

    /**UDP监听健康检查的响应串*/
    @KsYunField(name="HealthCheckExp")
    private String HealthCheckExp;

}
