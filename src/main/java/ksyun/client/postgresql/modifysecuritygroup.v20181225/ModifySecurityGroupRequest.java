package ksyun.client.postgresql.modifysecuritygroup.v20181225;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ModifySecurityGroupRequest @Description 请求参数
 */
@Data
public class ModifySecurityGroupRequest {
  /** 安全组ID */
  @KsYunField(name = "SecurityGroupId")
  private String SecurityGroupId;

  /** 安全组名称 ```json 不超过256个字符，中文，字母，数字，中划线，下划线 ``` */
  @KsYunField(name = "SecurityGroupName")
  private String SecurityGroupName;

  /** 安全组描述 ```json 不超过256个字符，中文，字母，数字，中划线，下划线 ``` */
  @KsYunField(name = "SecurityGroupDescription")
  private String SecurityGroupDescription;
}
