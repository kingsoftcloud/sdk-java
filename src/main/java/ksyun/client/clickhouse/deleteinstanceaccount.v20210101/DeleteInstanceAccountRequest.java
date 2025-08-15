package ksyun.client.clickhouse.deleteinstanceaccount.v20210101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DeleteInstanceAccountRequest @Description 请求参数
 */
@Data
public class DeleteInstanceAccountRequest {
  /** 实例ID */
  @KsYunField(name = "InstanceId")
  private String InstanceId;

  /** 账号名称 */
  @KsYunField(name = "InstanceAccountName")
  private String InstanceAccountName;
}
