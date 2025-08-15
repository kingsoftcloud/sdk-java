package ksyun.client.kce2.describeeventlogs.v20230101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribeEventLogsRequest @Description 请求参数
 */
@Data
public class DescribeEventLogsRequest {
  /** 集群ID */
  @KsYunField(name = "ClusterId")
  private String ClusterId;

  /** 集群名称 */
  @KsYunField(name = "ClusterName")
  private String ClusterName;

  /** 节点ID */
  @KsYunField(name = "NodeId")
  private String NodeId;

  /** 节点名称 */
  @KsYunField(name = "NodeName")
  private String NodeName;

  /** 是否查询内部事件 */
  @KsYunField(name = "Inner")
  private Boolean Inner;

  /** 分页参数 游标起始位置， 每次查询返回 */
  @KsYunField(name = "Marker")
  private Integer Marker;

  /** 分页参数，每页最大数 */
  @KsYunField(name = "MaxResults")
  private Integer MaxResults;
}
