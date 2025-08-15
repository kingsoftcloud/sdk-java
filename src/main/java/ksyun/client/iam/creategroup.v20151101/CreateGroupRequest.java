package ksyun.client.iam.creategroup.v20151101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname CreateGroupRequest @Description 请求参数
 */
@Data
public class CreateGroupRequest {
  /** 用户组名称 1-64个字符，允许输入大小写英文字母，数字，' . '，' _ ' 或 ' - ' */
  @KsYunField(name = "GroupName")
  private String GroupName;

  /** 用户组描述，1-64字符 */
  @KsYunField(name = "Description")
  private String Description;

  /** 组别名 */
  @KsYunField(name = "GroupRealName")
  private String GroupRealName;
}
