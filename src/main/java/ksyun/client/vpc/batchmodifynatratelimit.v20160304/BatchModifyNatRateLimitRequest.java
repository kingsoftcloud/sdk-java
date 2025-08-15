package ksyun.client.vpc.batchmodifynatratelimit.v20160304;

import common.annotation.KsYunField;
import java.util.List;
import lombok.Data;

/**
 * @Classname BatchModifyNatRateLimitRequest @Description 请求参数
 */
@Data
public class BatchModifyNatRateLimitRequest {
  /** 出向带宽限速 */
  @KsYunField(name = "BandwidthLimit")
  private String BandwidthLimit;

  /** 入向带宽限速 */
  @KsYunField(name = "InBandwidthLimit")
  private Integer InBandwidthLimit;

  /** Nat网卡限速规则ID */
  @KsYunField(name = "NatRateLimitId")
  private List<String> NatRateLimitIdList;
}
