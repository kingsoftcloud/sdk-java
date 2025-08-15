package ksyun.client.pdns.modifypdnszone.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ModifyPdnsZoneRequest @Description 请求参数
 */
@Data
public class ModifyPdnsZoneRequest {
  /** Zone的ID */
  @KsYunField(name = "ZoneId")
  private String ZoneId;

  /** TTL */
  @KsYunField(name = "ZoneTtl")
  private Integer ZoneTtl;
}
