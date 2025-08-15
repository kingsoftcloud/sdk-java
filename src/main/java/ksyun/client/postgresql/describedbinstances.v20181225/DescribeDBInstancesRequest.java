package ksyun.client.postgresql.describedbinstances.v20181225;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribeDBInstancesRequest @Description 请求参数
 */
@Data
public class DescribeDBInstancesRequest {
  /** 实例id 传入实例ID，获取的是该实例的详情，否则则获取list */
  @KsYunField(name = "DBInstanceIdentifier")
  private String DBInstanceIdentifier;

  /** 实例类型 取值范围: HRDS_PG高可用实例  TRDS_PG临时实例  RR_PG只读实例 */
  @KsYunField(name = "DBInstanceType")
  private String DBInstanceType;

  /** 按单个名称/单个VIP模糊过滤 */
  @KsYunField(name = "Keyword")
  private String Keyword;

  /** 记录开始偏移量 默认0 */
  @KsYunField(name = "Marker")
  private Integer Marker;

  /** 每页结果中包含的最大条数； 默认10 取值10~10000 */
  @KsYunField(name = "MaxRecords")
  private Integer MaxRecords;

  /** 实例分组id */
  @KsYunField(name = "GroupId")
  private String GroupId;

  /** 项目制Id，默认值为所有项目 */
  @KsYunField(name = "ProjectId")
  private String ProjectId;

  /** 实例id列表,中间用逗号隔开 */
  @KsYunField(name = "DBInstanceIdentifierIn")
  private String DBInstanceIdentifierIn;

  /** 实例名称列表,用逗号隔开,支持模糊查询 */
  @KsYunField(name = "DBInstanceNameIn")
  private String DBInstanceNameIn;

  /** vip列表，按IP地址筛选,可多选,中间逗号隔开 */
  @KsYunField(name = "VipIn")
  private String VipIn;

  /** 按照实例过期时间过滤，取值范围>0 */
  @KsYunField(name = "ExpiryDateLessThan")
  private Integer ExpiryDateLessThan;

  /** 排序方式，区分大小写，取值范围：DEFAULT（默认排序方式），GROUP（按复制组排序，会把只读实例排在所属主实例的后面） */
  @KsYunField(name = "Order")
  private String Order;
}
