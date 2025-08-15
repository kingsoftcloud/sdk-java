package ksyun.client.postgresql.updatedbinstanceversion.v20181225;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname UpdateDBInstanceVersionRequest @Description 请求参数
 */
@Data
public class UpdateDBInstanceVersionRequest {
  /** 实例ID */
  @KsYunField(name = "DBInstanceIdentifier")
  private String DBInstanceIdentifier;

  /** 实例引擎，默认：'postgresql',可不填 */
  @KsYunField(name = "Engine")
  private String Engine;

  /**
   * 实例版本，需要指定当前实例具体的大版本。 若不指定则默认：'9.6'
   *
   * <p>```json 现支持如下版本： 9.6|10|11|12.5|13|1
   *
   * <p>注意： 9.6仅做维护，已不支持售卖，请您务必指定实例版本 ```
   */
  @KsYunField(name = "EngineVersion")
  private String EngineVersion;
}
