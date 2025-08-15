package ksyun.client.vpc.batchdeletenatratelimit.v20160304;

import common.annotation.KsYunField;
import java.util.List;
import lombok.Data;

/**
 * @Classname BatchDeleteNatRateLimitRequest @Description 请求参数
 */
@Data
public class BatchDeleteNatRateLimitRequest {
  /** Nat网卡限速规则ID */
  @KsYunField(name = "NatRateLimitId")
  private List<String> NatRateLimitIdList;
}
