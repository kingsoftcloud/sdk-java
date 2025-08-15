package ksyun.client.pdns.deletepdnszone.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DeletePdnsZoneRequest @Description 请求参数
 */
@Data
public class DeletePdnsZoneRequest {
  /** Zone的ID */
  @KsYunField(name = "ZoneId")
  private String ZoneId;
}
