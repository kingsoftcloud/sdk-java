package ksyun.client.krds.upgradedbinstanceengineversion.v20160701;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname UpgradeDBInstanceEngineVersionRequest @Description 请求参数
 */
@Data
public class UpgradeDBInstanceEngineVersionRequest {
  /** 实例ID */
  @KsYunField(name = "DBInstanceIdentifier")
  private String DBInstanceIdentifier;

  /** 实例中数据库引擎的名称 区分大小写、取值范围：mysql、percona */
  @KsYunField(name = "Engine")
  private String Engine;

  /**
   * 实例中数据库引擎的版本 取值范围：5.5、5.6、5.7<br>
   * mysql暂时不支持由5.7升级到8.0
   */
  @KsYunField(name = "EngineVersion")
  private String EngineVersion;
}
