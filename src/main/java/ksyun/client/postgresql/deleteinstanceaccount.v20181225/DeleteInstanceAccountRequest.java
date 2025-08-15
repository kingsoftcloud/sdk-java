package ksyun.client.postgresql.deleteinstanceaccount.v20181225;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DeleteInstanceAccountRequest @Description 请求参数
 */
@Data
public class DeleteInstanceAccountRequest {
  /** 实例ID */
  @KsYunField(name = "DBInstanceIdentifier")
  private String DBInstanceIdentifier;

  /** 账号名称 */
  @KsYunField(name = "AccountName")
  private String AccountName;
}
