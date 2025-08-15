package ksyun.client.cen.detachcenbandwidthpackage.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DetachCenBandWidthPackageRequest @Description 请求参数
 */
@Data
public class DetachCenBandWidthPackageRequest {
  /** 云企业网带宽包的ID */
  @KsYunField(name = "CenBandWidthPackageId")
  private String CenBandWidthPackageId;

  /** 云企业网的ID */
  @KsYunField(name = "CenId")
  private String CenId;
}
