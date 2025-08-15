package ksyun.client.kec.attachinstancesiamrole.v20160304;

import common.annotation.KsYunField;
import java.util.List;
import lombok.Data;

/**
 * @Classname AttachInstancesIamRoleRequest @Description 请求参数
 */
@Data
public class AttachInstancesIamRoleRequest {
  /** 待绑定IAM角色实例ID列表，N的范围为1-100 */
  @KsYunField(name = "InstanceId")
  private List<String> InstanceIdList;

  /** 实例待绑定的IAM角色名称 */
  @KsYunField(name = "IamRoleName")
  private String IamRoleName;
}
