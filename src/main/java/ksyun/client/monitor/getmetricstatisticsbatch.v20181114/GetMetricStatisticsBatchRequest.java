package ksyun.client.monitor.getmetricstatisticsbatch.v20181114;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname GetMetricStatisticsBatchRequest
* @Description 请求参数
*/
@Data
public class GetMetricStatisticsBatchRequest{
    /**表示一类云产品，指定命名空间。*/
    @KsYunField(name="Namespace")
    private String Namespace;

    /**起始时间。

> **时间格式：** `2023-07-19T16:09:50Z`*/
    @KsYunField(name="StartTime")
    private String StartTime;

    /**结束时间。

> **时间格式：** `2023-07-19T16:09:50Z`

> **注意：** 数据采集可能存在有2分钟左右的延迟，`EndTime`的值应当比当前时间延迟两分钟，如果当前时间为：2023-07-19T16:11:50Z，那么 `EndTime`=2023-07-19T16:09:50Z。*/
    @KsYunField(name="EndTime")
    private String EndTime;

    /**数据聚合的方法。目前支持：

- Average
- Max
- Min*/
    @KsYunField(name="Aggregate",type=2)
    private List<String> AggregateList;

    /**统计粒度，单位为秒。

> 注意：该参数值应为60的整数倍，值的大小可能会导致数据与控制台展示不一致。

> 默认值为空，将不对数据进行降采样，按产品线的推送频率进行展示。*/
    @KsYunField(name="Period")
    private Integer Period;

    /**指标名列表。

*/
    @KsYunField(name="Metrics",type=2)
    private List<MetricsDto> MetricsList;

    @Data
    @ToString
    public static class MetricsDto {
        /**实例ID。*/
        private String InstanceID;
        /**监控项。

*/
        private String MetricName;
    }


}