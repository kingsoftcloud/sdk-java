package ksyun.client.kcs.deletesecuritygroup.v20160701;

import common.annotation.KsYunField;
import java.util.List;
import lombok.Data;

/**
 * @Classname DeleteSecurityGroupRequest @Description 请求参数
 */
@Data
public class DeleteSecurityGroupRequest {
  /** 可用区 默认：对应机房的a区 */
  @KsYunField(name = "AvailableZone")
  private String AvailableZone;

  /** 安全组ID N：代表数字，示例(SecurityGroupId.1=xxxx&SecurityGroupId.2=yyyyy) */
  @KsYunField(name = "SecurityGroupId")
  private List<String> SecurityGroupIdList;
}
