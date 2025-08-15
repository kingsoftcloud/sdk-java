package ksyun.client.cen.deletecen.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DeleteCenRequest @Description 请求参数
 */
@Data
public class DeleteCenRequest {
  /** 云企业网的ID */
  @KsYunField(name = "CenId")
  private String CenId;
}
