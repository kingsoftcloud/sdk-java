package ksyun.client.krds.temporarycloseswitchover.v20160701;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname TemporaryCloseSwitchoverRequest @Description 请求参数
 */
@Data
public class TemporaryCloseSwitchoverRequest {
  /** 实例ID */
  @KsYunField(name = "DBInstanceIdentifier")
  private String DBInstanceIdentifier;

  /** 是否自动切换(输入的为期望状态)；false时为关闭，必须传时间； */
  @KsYunField(name = "AutoSwitch")
  private Boolean AutoSwitch;

  /** 期望过期时间点 */
  @KsYunField(name = "ExpireTime")
  private String ExpireTime;
}
