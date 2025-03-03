package ksyun.client.kce.describemonitorlist.v20230306;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribeMonitorListRequest
 * @Description 请求参数
 */
@Data
public class DescribeMonitorListRequest {
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
     * 监控采集配置来源，有效值：
     * Basic
     * Custom
     */
    @KsYunField(name = "MonitorSource")
    private String MonitorSource;

    /**
     * 分页标识，单次调用未返回监控项时，标记下次调用的返回值的起点，默认值是0
     */
    @KsYunField(name = "Marker")
    private Integer Marker;

    /**
     * 单次调用所返回的最大监控数目，默认20，最大100
     */
    @KsYunField(name = "MaxResults")
    private Integer MaxResults;

}