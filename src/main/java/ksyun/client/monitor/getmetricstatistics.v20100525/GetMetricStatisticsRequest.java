package ksyun.client.monitor.getmetricstatistics.v20100525;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname GetMetricStatisticsRequest
 * @Description 请求参数
 */
@Data
public class GetMetricStatisticsRequest {
    /**
     * 表示一类云产品，指定命名空间。
     */
    @KsYunField(name = "Namespace")
    private String Namespace;

    /**
     * 监控实例的ID
     * 备注：MongoDB产品，请在相应监控实例ID前添加user前缀
     */
    @KsYunField(name = "InstanceID")
    private String InstanceID;

    /**
     * 监控项名称
     */
    @KsYunField(name = "MetricName")
    private String MetricName;

    /**
     * 本地时间，开始时间戳，如2017-02-28T17:00:00Z
     */
    @KsYunField(name = "StartTime")
    private String StartTime;

    /**
     * 本地时间，结束时间戳，如2017-02-28T18:00:00Z, 数据采集有2分钟左右延迟，EndTime需比当前时间延迟两分钟
     */
    @KsYunField(name = "EndTime")
    private String EndTime;

    /**
     * 数据聚合的方法，Average,Max,Min ，如果和控制台不一致，会导致数据不一致
     */
    @KsYunField(name = "Aggregate")
    private String Aggregate;

    /**
     * 采样周期，60的整数倍，单位为秒，如果和控制台不一致，会导致数据不一致。默认值为空，将不对数据进行降采样，按产品线的推送频率进行展示。
     */
    @KsYunField(name = "Period")
    private String Period;


}