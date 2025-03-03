package ksyun.client.vpc.createnatratelimit.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname CreateNatRateLimitRequest
 * @Description 请求参数
 */
@Data
public class CreateNatRateLimitRequest {
    /**
     * 网卡ID
     */
    @KsYunField(name = "NetworkInterfaceId")
    private String NetworkInterfaceId;

    /**
     * 出网带宽限速
     */
    @KsYunField(name = "BandwidthLimit")
    private Integer BandwidthLimit;

    /**
     * 入网带宽限速
     */
    @KsYunField(name = "inBandwidthLimit")
    private Integer InBandwidthLimit;

}