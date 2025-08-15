package ksyun.client.pdns.deleterecorddata.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DeleteRecordDataRequest @Description 请求参数
 */
@Data
public class DeleteRecordDataRequest {
  /** Action */
  @KsYunField(name = "Action")
  private String Action;
}
