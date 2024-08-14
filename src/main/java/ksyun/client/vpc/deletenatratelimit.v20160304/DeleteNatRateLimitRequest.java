package ksyun.client.vpc.deletenatratelimit.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DeleteNatRateLimitRequest
* @Description 请求参数
*/
@Data
public class DeleteNatRateLimitRequest{
    /**网关限速规则ID*/
    @KsYunField(name="NatRateLimitId")
    private String NatRateLimitId;


}