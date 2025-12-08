package ksyun.client.kce.describemonitormetricslist.v20230306;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeMonitorMetricsListRequest
* @Description 请求参数
*/
@Data
public class DescribeMonitorMetricsListRequest{
    /**实例id*/
    @KsYunField(name="InstanceId")
    private String InstanceId;

    /**集群id*/
    @KsYunField(name="ClusterId")
    private String ClusterId;

    /**监控采集配置名称*/
    @KsYunField(name="MonitorName")
    private String MonitorName;

    /**监控采集配置类型，有效值： 
RawJob
PodMonitor
ServiceMonitor*/
    @KsYunField(name="Type")
    private String Type;

    /**监控指标是否开启采集,有效值： 
true：已开启指标
false：废弃指标*/
    @KsYunField(name="IsCollect")
    private Boolean IsCollect;

    /**分页标识*/
    @KsYunField(name="Marker")
    private Integer Marker;

    /**单次调用所返回的最大指标数目，默认20，最大100*/
    @KsYunField(name="MaxResults")
    private Integer MaxResults;

}
