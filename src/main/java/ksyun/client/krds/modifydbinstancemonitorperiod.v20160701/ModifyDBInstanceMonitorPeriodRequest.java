package ksyun.client.krds.modifydbinstancemonitorperiod.v20160701;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ModifyDBInstanceMonitorPeriodRequest @Description 请求参数
 */
@Data
public class ModifyDBInstanceMonitorPeriodRequest {
  /** 实例ID */
  @KsYunField(name = "DBInstanceIdentifier")
  private String DBInstanceIdentifier;

  /** 监控周期 。可选：5/15/30/60 */
  @KsYunField(name = "Period")
  private String Period;
}
