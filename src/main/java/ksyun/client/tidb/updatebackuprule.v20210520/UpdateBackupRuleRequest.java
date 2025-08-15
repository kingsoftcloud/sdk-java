package ksyun.client.tidb.updatebackuprule.v20210520;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname UpdateBackupRuleRequest @Description 请求参数
 */
@Data
public class UpdateBackupRuleRequest {
  /** 实例id */
  @KsYunField(name = "InstanceId")
  private String InstanceId;

  /** 备份时段选择： 格式：HH:mm-HH:mm */
  @KsYunField(name = "PreferredBackupTime")
  private String PreferredBackupTime;

  /** 是否开启自动备份 ``` false 未开启； true 开启 ``` */
  @KsYunField(name = "EnableAutobackup")
  private Boolean EnableAutobackup;

  /** 是否开启增量备份 ``` false 未开启； true 开启 ``` */
  @KsYunField(name = "EnableIncremental")
  private Boolean EnableIncremental;
}
