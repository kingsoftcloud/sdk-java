package ksyun.client.vpc.deletenatratelimit.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DeleteNatRateLimitRequest
 * @Description 请求参数
 */
@Data
public class DeleteNatRateLimitRequest {
    /**
     * 网关限速规则ID
     */
    @KsYunField(name = "NatRateLimitId")
    private String NatRateLimitId;


}