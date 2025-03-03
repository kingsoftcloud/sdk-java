package ksyun.client.kce.describemonitorcollectionconfig.v20230306;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribeMonitorCollectionConfigRequest
 * @Description 请求参数
 */
@Data
public class DescribeMonitorCollectionConfigRequest {
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

}