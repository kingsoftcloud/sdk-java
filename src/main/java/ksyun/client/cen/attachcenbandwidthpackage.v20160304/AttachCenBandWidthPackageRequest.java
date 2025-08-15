package ksyun.client.cen.attachcenbandwidthpackage.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname AttachCenBandWidthPackageRequest @Description 请求参数
 */
@Data
public class AttachCenBandWidthPackageRequest {
  /** 云企业网带宽包的ID */
  @KsYunField(name = "CenBandWidthPackageId")
  private String CenBandWidthPackageId;

  /** 云企业网的ID */
  @KsYunField(name = "CenId")
  private String CenId;
}
