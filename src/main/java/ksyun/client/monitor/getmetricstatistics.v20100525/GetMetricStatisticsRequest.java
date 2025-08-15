package ksyun.client.monitor.getmetricstatistics.v20100525;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname GetMetricStatisticsRequest @Description 请求参数
 */
@Data
public class GetMetricStatisticsRequest {
  /** 表示一类云产品，指定命名空间。 */
  @KsYunField(name = "Namespace")
  private String Namespace;

  /**
   * 监控实例的ID。
   *
   * <p>> **特别注意：** 需要额外关注部分产品线实例ID，具体如下： > - KS3: 实例ID为 BucketName，并非 BucketID； > -
   * MongoDB：实例ID前添加`user` 前缀；
   */
  @KsYunField(name = "InstanceID")
  private String InstanceID;

  /** 监控项名称 */
  @KsYunField(name = "MetricName")
  private String MetricName;

  /**
   * 起始时间。
   *
   * <p>> **时间格式：** `2023-07-19T16:00:50Z`
   */
  @KsYunField(name = "StartTime")
  private String StartTime;

  /**
   * 结束时间。
   *
   * <p>> **时间格式：** `2023-07-19T16:09:50Z`
   *
   * <p>> **特别注意：** 数据采集可能存在有2分钟左右的延迟，EndTime的值应当比当前时间延迟两分钟， > > 假设当前时间为：2023-07-19T16:11:50Z，那么
   * EndTime=2023-07-19T16:09:50Z。
   */
  @KsYunField(name = "EndTime")
  private String EndTime;

  /**
   * 数据聚合的方法。目前支持：
   *
   * <p>- Average - Max - Min
   *
   * <p>> **注意：** 如果查询的数据与控制台监控视图不一致，可能是由于该参数导致。
   */
  @KsYunField(name = "Aggregate")
  private String Aggregate;

  /**
   * 统计粒度，单位为秒。
   *
   * <p>> **注意：** 该参数值应为60的整数倍，值的大小可能会导致数据与控制台展示不一致。 > > 默认值为空时，将不对数据进行降采样，按产品线的推送频率进行展示。
   */
  @KsYunField(name = "Period")
  private String Period;
}
