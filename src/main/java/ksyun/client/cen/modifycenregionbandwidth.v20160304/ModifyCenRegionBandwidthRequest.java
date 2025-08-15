package ksyun.client.cen.modifycenregionbandwidth.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ModifyCenRegionBandwidthRequest @Description 请求参数
 */
@Data
public class ModifyCenRegionBandwidthRequest {
  /** 跨地域带宽的ID */
  @KsYunField(name = "CenRegionBandwidthId")
  private String CenRegionBandwidthId;

  /** 跨地域间分配的带宽 */
  @KsYunField(name = "InterBandWidth")
  private String InterBandWidth;
}
