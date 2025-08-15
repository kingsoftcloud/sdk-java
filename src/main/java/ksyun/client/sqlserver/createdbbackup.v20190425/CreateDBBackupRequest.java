package ksyun.client.sqlserver.createdbbackup.v20190425;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname CreateDBBackupRequest @Description 请求参数
 */
@Data
public class CreateDBBackupRequest {
  /** 实例ID */
  @KsYunField(name = "DBInstanceIdentifier")
  private String DBInstanceIdentifier;

  /**
   * 数据库备份名称
   *
   * <p>```json 2-64个字符   ```
   */
  @KsYunField(name = "DBBackupName")
  private String DBBackupName;

  /**
   * 备份描述
   *
   * <p>```json 2-128个字符 ```
   */
  @KsYunField(name = "Description")
  private String Description;
}
