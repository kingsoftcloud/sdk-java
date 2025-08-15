package ksyun.client.sqlserver.modifydbbackuppolicy.v20190425;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ModifyDBBackupPolicyRequest @Description 请求参数
 */
@Data
public class ModifyDBBackupPolicyRequest {
  /** 实例ID */
  @KsYunField(name = "DBInstanceIdentifier")
  private String DBInstanceIdentifier;

  /** 全量备份时间段区间: [00:00-01:00,23:00-24:00] 间隔一小时的整点时刻 */
  @KsYunField(name = "PreferredBackupTime")
  private String PreferredBackupTime;

  /** 增量备份时间间隔(小时):现在仅支持2,6或者12小时 */
  @KsYunField(name = "IncrementalBackupCycle")
  private String IncrementalBackupCycle;
}
