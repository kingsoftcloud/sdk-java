package ksyun.client.tidb.clonesecuritygroup.v20210520;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname CloneSecurityGroupRequest @Description 请求参数
 */
@Data
public class CloneSecurityGroupRequest {
  /** 原安全组ID。 */
  @KsYunField(name = "SrcSecurityGroupId")
  private String SrcSecurityGroupId;

  /** 新安全组名称。 */
  @KsYunField(name = "SecurityGroupName")
  private String SecurityGroupName;

  /** 新安全组描述。 */
  @KsYunField(name = "Description")
  private String Description;
}
