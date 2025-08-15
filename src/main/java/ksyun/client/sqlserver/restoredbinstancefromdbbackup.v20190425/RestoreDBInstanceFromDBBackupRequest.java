package ksyun.client.sqlserver.restoredbinstancefromdbbackup.v20190425;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname RestoreDBInstanceFromDBBackupRequest @Description 请求参数
 */
@Data
public class RestoreDBInstanceFromDBBackupRequest {
  /** 数据库实例名称 */
  @KsYunField(name = "DBInstanceName")
  private String DBInstanceName;

  /** 备份ID */
  @KsYunField(name = "DBBackupIdentifier")
  private String DBBackupIdentifier;

  /** 实例类型 */
  @KsYunField(name = "DBInstanceType")
  private String DBInstanceType;

  /** 项目ID */
  @KsYunField(name = "ProjectId")
  private String ProjectId;

  /** 实例可用区 */
  @KsYunField(name = "AvailabilityZone")
  private String AvailabilityZone;

  /** 时长 时长 默认值：1(单位:月) 注：billType=1(包年包月)则必填 */
  @KsYunField(name = "Duration")
  private Integer Duration;

  /** 时长单位 时长单位 默认值：M */
  @KsYunField(name = "DurationUnit")
  private String DurationUnit;

  /** 端口号 支持修改端口号 */
  @KsYunField(name = "Port")
  private Integer Port;

  /**
   * 计费方式：
   *
   * <p>```json YEAR_MONTH(包年包月) DAY(按量付费-按日月结) HourlyInstantSettlement(按量付费-按小时结) 默认值：YEAR_MONTH
   * ```
   */
  @KsYunField(name = "BillType")
  private String BillType;
}
