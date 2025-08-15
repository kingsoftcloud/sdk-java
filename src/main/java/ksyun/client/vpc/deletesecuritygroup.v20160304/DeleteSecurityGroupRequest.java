package ksyun.client.vpc.deletesecuritygroup.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DeleteSecurityGroupRequest @Description 请求参数
 */
@Data
public class DeleteSecurityGroupRequest {
  /** 安全组的ID */
  @KsYunField(name = "SecurityGroupId")
  private String SecurityGroupId;
}
