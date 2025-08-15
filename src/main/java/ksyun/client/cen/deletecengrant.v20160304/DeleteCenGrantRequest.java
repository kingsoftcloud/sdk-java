package ksyun.client.cen.deletecengrant.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DeleteCenGrantRequest @Description 请求参数
 */
@Data
public class DeleteCenGrantRequest {
  /** 云企业网授权的ID */
  @KsYunField(name = "CenGrantId")
  private String CenGrantId;
}
