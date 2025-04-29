package ksyun.client.monitor.listmetrics.v20100525;

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

    /**实例ID。*/
    @KsYunField(name="InstanceID")
    private String InstanceID;

    /**监控项。*/
    @KsYunField(name="MetricName")
    private String MetricName;

    /**页号，起始值：1*/
    @KsYunField(name="PageIndex")
    private Integer PageIndex;

    /**分页时每页显示的数据行数。

> 默认值：获取实例下所有监控项*/
    @KsYunField(name="PageSize")
    private Integer PageSize;

}