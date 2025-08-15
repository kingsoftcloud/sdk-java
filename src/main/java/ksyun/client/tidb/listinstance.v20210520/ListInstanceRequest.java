package ksyun.client.tidb.listinstance.v20210520;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ListInstanceRequest @Description 请求参数
 */
@Data
public class ListInstanceRequest {
  /** 项目ID列表，多个项目ID以逗号分隔。不填表示全部项目。 */
  @KsYunField(name = "ProjectIds")
  private String ProjectIds;

  /** 实例状态。查询多种实例状态时，用逗号分隔。如：running,error */
  @KsYunField(name = "InstanceStatus")
  private String InstanceStatus;

  /** 模糊查找。支持：实例ID、实例名称、项目名称、VIP、实例状态。 */
  @KsYunField(name = "FuzzySearch")
  private String FuzzySearch;

  /** 查找第几页数据，从0开始。 */
  @KsYunField(name = "Offset")
  private Integer Offset;

  /** 每页最大记录数。默认：10。 */
  @KsYunField(name = "Limit")
  private Integer Limit;

  /** 排序字段。 */
  @KsYunField(name = "OrderBy")
  private String OrderBy;

  /** 商品类型，默认：577 */
  @KsYunField(name = "ProductType")
  private Integer ProductType;
}
