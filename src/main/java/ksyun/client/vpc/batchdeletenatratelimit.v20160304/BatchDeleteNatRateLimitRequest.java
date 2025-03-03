package ksyun.client.vpc.batchdeletenatratelimit.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

import java.util.List;

/**
 * @Classname BatchDeleteNatRateLimitRequest
 * @Description 请求参数
 */
@Data
public class BatchDeleteNatRateLimitRequest {
    /**
     * Nat网卡限速规则ID
     */
    @KsYunField(name = "NatRateLimitId")
    private List<String> NatRateLimitIdList;


}