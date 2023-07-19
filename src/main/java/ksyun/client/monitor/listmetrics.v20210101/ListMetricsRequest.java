package ksyun.client.monitor.listmetrics.v20210101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ListMetricsRequest
* @Description 请求参数
*/
@Data
public class ListMetricsRequest{
    /**表示一类云产品，指定命名空间。*/
    @KsYunField(name="Namespace")
    private String Namespace;

    /**监控实例的ID*/
    @KsYunField(name="InstanceID")
    private String InstanceID;

    /**监控项名称，传入该参数将返回对应监控项的详细信息。*/
    @KsYunField(name="MetricName")
    private String MetricName;

    /**返回列表的分页索引*/
    @KsYunField(name="PageIndex")
    private Integer PageIndex;

    /**返回列表显示的对象数量*/
    @KsYunField(name="PageSize")
    private Integer PageSize;


}