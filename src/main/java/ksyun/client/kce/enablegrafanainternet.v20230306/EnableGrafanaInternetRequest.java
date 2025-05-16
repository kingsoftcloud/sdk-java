package ksyun.client.kce.enablegrafanainternet.v20230306;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname EnableGrafanaInternetRequest
 * @Description 请求参数
 */
@Data
public class EnableGrafanaInternetRequest {
    /**
     * Grafana所关联的Prometheus的实例id
     */
    @KsYunField(name = "InstanceId")
    private String InstanceId;

    /**
     * 开启或关闭公网访问，true为开启，false 为不开启
     */
    @KsYunField(name = "EnableInternet")
    private Boolean EnableInternet;

}