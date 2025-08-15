package ksyun.client.influxdb.deleteaccount.v20191010;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DeleteAccountRequest @Description 请求参数
 */
@Data
public class DeleteAccountRequest {
  /***/
  @KsYunField(name = "InstanceId")
  private String InstanceId;

  /***/
  @KsYunField(name = "AccountName")
  private String AccountName;
}
