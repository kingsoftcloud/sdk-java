package ksyun.client.pdns.createrecorddata.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname CreateRecordDataRequest @Description 请求参数
 */
@Data
public class CreateRecordDataRequest {
  /** Action */
  @KsYunField(name = "Action")
  private String Action;
}
