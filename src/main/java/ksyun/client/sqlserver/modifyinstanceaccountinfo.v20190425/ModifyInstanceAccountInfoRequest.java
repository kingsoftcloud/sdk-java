package ksyun.client.sqlserver.modifyinstanceaccountinfo.v20190425;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ModifyInstanceAccountInfoRequest @Description 请求参数
 */
@Data
public class ModifyInstanceAccountInfoRequest {
  /** 实例ID */
  @KsYunField(name = "DBInstanceIdentifier")
  private String DBInstanceIdentifier;

  /** 账号名称 */
  @KsYunField(name = "InstanceAccountName")
  private String InstanceAccountName;

  /** 账号描述 */
  @KsYunField(name = "InstanceAccountDescription")
  private String InstanceAccountDescription;

  /** 账号密码 */
  @KsYunField(name = "InstanceAccountPassword")
  private String InstanceAccountPassword;
}
