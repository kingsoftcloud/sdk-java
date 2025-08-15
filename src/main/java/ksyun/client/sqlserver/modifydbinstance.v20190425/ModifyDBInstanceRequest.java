package ksyun.client.sqlserver.modifydbinstance.v20190425;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ModifyDBInstanceRequest @Description 请求参数
 */
@Data
public class ModifyDBInstanceRequest {
  /** 实例ID */
  @KsYunField(name = "DBInstanceIdentifier")
  private String DBInstanceIdentifier;

  /** 实例名称 */
  @KsYunField(name = "DBInstanceName")
  private String DBInstanceName;
}
