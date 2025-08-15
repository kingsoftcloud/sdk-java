package ksyun.client.vpc.modifynatratelimit.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ModifyNatRateLimitRequest @Description 请求参数
 */
@Data
public class ModifyNatRateLimitRequest {
  /** 网关限速规则ID */
  @KsYunField(name = "NatRateLimitId")
  private String NatRateLimitId;

  /** 出网带宽限速 */
  @KsYunField(name = "BandwidthLimit")
  private Integer BandwidthLimit;

  /** 入网带宽限速 */
  @KsYunField(name = "InBandwidthLimit")
  private Integer InBandwidthLimit;
}
