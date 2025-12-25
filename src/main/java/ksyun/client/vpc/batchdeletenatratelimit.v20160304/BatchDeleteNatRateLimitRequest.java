package ksyun.client.vpc.batchdeletenatratelimit.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname BatchDeleteNatRateLimitRequest
* @Description 请求参数
*/
@Data
public class BatchDeleteNatRateLimitRequest{
    /**Nat网卡限速规则ID*/
    @KsYunField(name = "NatRateLimitId", type = 1)
    private List<String> NatRateLimitIdList;

}
