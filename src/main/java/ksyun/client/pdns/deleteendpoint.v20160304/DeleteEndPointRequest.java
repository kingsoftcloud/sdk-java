package ksyun.client.pdns.deleteendpoint.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DeleteEndPointRequest @Description 请求参数
 */
@Data
public class DeleteEndPointRequest {
  /** EndPointId的ID */
  @KsYunField(name = "EndPointId")
  private String EndPointId;
}
