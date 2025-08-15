package ksyun.client.dts.describetask.v20180108;

import common.annotation.KsYunField;
import java.util.List;
import lombok.Data;

/**
 * @Classname DescribeTaskRequest @Description 请求参数
 */
@Data
public class DescribeTaskRequest {
  /** 主任务ID */
  @KsYunField(name = "TaskId")
  private String TaskId;

  /** 目标端数据库类型。范围：Krds Kcs ClusterKcs Kmgo Kpg */
  @KsYunField(name = "TargetType")
  private String TargetType;

  /**
   * 任务类型。默认Transmission，若为数据迁移任务，可不传此参数，其他类型必传。范围： 数据迁移Transmission 数据同步Synchronous数据订阅Subscription
   */
  @KsYunField(name = "TaskType")
  private String TaskType;

  /** 不传默认查询所有状态，范围：UNSTARTED RUNNING RELOADING PAUSED PAUSING STOPED FINISHED ERROR */
  @KsYunField(name = "TaskStatus")
  private List<String> TaskStatusList;

  /** 任务名称 */
  @KsYunField(name = "TaskName")
  private String TaskName;

  /** 目标库实例ID。通过目标库实例ID筛选符合条件的任务 */
  @KsYunField(name = "TargetInstanceId")
  private String TargetInstanceId;

  /** 源库实例ID。通过源库实例ID筛选符合条件的任务。 */
  @KsYunField(name = "SourceInstanceId")
  private String SourceInstanceId;

  /** 根据任务创建时间排序。默认DESC */
  @KsYunField(name = "OrderByType")
  private String OrderByType;

  /** 当前查询开始行数。默认0。 */
  @KsYunField(name = "Marker")
  private Integer Marker;

  /** 当前页最大行数。 默认10。 */
  @KsYunField(name = "MaxRecords")
  private Integer MaxRecords;
}
