package ksyun.client.monitor.getprometheustoken.v20250101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname GetPrometheusTokenRequest
* @Description 请求参数
*/
@Data
public class GetPrometheusTokenRequest{
    /**控制ID（*即：当前Prometheus实例ID*）。

> 值可通过 ListPrometheusInstances 接口获取。*/
    @KsYunField(name="ControllerID")
    private String ControllerID;

}
