package ksyun.client.kce.enablemetrics.v20230306;

import common.annotation.KsYunField;
import lombok.Data;

import java.util.List;

/**
 * @Classname EnableMetricsRequest
 * @Description 请求参数
 */
@Data
public class EnableMetricsRequest {
    /**
     * 实例id
     */
    @KsYunField(name = "InstanceId")
    private String InstanceId;

    /**
     * 集群id
     */
    @KsYunField(name = "ClusterId")
    private String ClusterId;

    /**
     * 监控采集配置名称
     */
    @KsYunField(name = "MonitorName")
    private String MonitorName;

    /**
     * 监控采集配置类型，有效值：
     * RawJob
     * PodMonitor
     * ServiceMonitor
     */
    @KsYunField(name = "Type")
    private String Type;

    /**
     * 指标名称
     */
    @KsYunField(name = "MetricsName")
    private List<String> MetricsNameList;

}