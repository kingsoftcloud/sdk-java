package ksyun.client.postgresql.deletedbinstance.v20181225;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DeleteDBInstanceRequest @Description 请求参数
 */
@Data
public class DeleteDBInstanceRequest {
  /** 实例id */
  @KsYunField(name = "DBInstanceIdentifier")
  private String DBInstanceIdentifier;
}
