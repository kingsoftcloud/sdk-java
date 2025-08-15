package ksyun.client.mongodb.describeslowlogstatistics.v20170101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribeSlowLogStatisticsRequest @Description 请求参数
 */
@Data
public class DescribeSlowLogStatisticsRequest {
  /** 实例ID。 */
  @KsYunField(name = "InstanceId")
  private String InstanceId;

  /** 节点ID。选填节点ID则查询该节点下的慢SQL统计数据 */
  @KsYunField(name = "NodeId")
  private String NodeId;

  /** 节点的类型 ：HighIO（副本集）、Cluster（分片集群） */
  @KsYunField(name = "InstanceType")
  private String InstanceType;

  /** 开始查询时间。yyyy-MM-dd HH:mm:ss 格式。 */
  @KsYunField(name = "StartTime")
  private String StartTime;

  /** 结束时间。yyyy-MM-dd HH:mm:ss 格式。 */
  @KsYunField(name = "EndTime")
  private String EndTime;

  /** 起始页, 默认0页。 */
  @KsYunField(name = "Marker")
  private Integer Marker;

  /** 展示条数 , 默认10条。 */
  @KsYunField(name = "MaxRecords")
  private Integer MaxRecords;
}
