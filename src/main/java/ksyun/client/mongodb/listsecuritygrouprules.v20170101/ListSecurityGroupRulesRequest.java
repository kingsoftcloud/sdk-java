package ksyun.client.mongodb.listsecuritygrouprules.v20170101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ListSecurityGroupRulesRequest @Description 请求参数
 */
@Data
public class ListSecurityGroupRulesRequest {
  /** 实例ID */
  @KsYunField(name = "InstanceId")
  private String InstanceId;
}
