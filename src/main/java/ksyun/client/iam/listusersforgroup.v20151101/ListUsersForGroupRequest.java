package ksyun.client.iam.listusersforgroup.v20151101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ListUsersForGroupRequest @Description 请求参数
 */
@Data
public class ListUsersForGroupRequest {
  /** 组名 */
  @KsYunField(name = "GroupName")
  private String GroupName;

  /** 默认500条，最大1000条 */
  @KsYunField(name = "MaxItems")
  private Integer MaxItems;

  /** 页码 */
  @KsYunField(name = "Page")
  private Integer Page;
}
