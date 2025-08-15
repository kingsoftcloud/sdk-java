package ksyun.client.sqlserver.releasedbinstanceeip.v20190425;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ReleaseDBInstanceEipRequest @Description 请求参数
 */
@Data
public class ReleaseDBInstanceEipRequest {
  /** 实例ID */
  @KsYunField(name = "DBInstanceIdentifier")
  private String DBInstanceIdentifier;
}
