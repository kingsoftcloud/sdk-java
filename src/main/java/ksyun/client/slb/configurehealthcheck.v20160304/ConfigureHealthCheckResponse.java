package ksyun.client.slb.configurehealthcheck.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ConfigureHealthCheckResponse
* @Description ConfigureHealthCheck 返回体
*/
@Data
@ToString
public class ConfigureHealthCheckResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**健康检查保持的状态*/
    @JsonProperty("HealthCheckState")
    private String HealthCheckState;

    /**健康检查端口*/
    @JsonProperty("HealthCheckConnectPort")
    private Integer HealthCheckConnectPort;

    /**健康检查的ID*/
    @JsonProperty("HealthCheckId")
    private String HealthCheckId;

    /**健康阈值*/
    @JsonProperty("HealthyThreshold")
    private Integer HealthyThreshold;

    /**健康检查时间间隔*/
    @JsonProperty("Interval")
    private Integer Interval;

    /**健康检查超时时间*/
    @JsonProperty("Timeout")
    private Integer Timeout;

    /**不健康阈值*/
    @JsonProperty("UnhealthyThreshold")
    private Integer UnhealthyThreshold;

    /**HTTP类型监听器健康检查的链接*/
    @JsonProperty("UrlPath")
    private String UrlPath;

    /**HTTP类型健康检查的域名*/
    @JsonProperty("HostName")
    private String HostName;

    /**UDP监听健康检查的请求串*/
    @JsonProperty("HealthCheckReq")
    private String HealthCheckReq;

    /**UDP监听健康检查的响应串*/
    @JsonProperty("HealthCheckExp")
    private String HealthCheckExp;

    /**HTTP请求方式*/
    @JsonProperty("HttpMethod")
    private String HttpMethod;

}
