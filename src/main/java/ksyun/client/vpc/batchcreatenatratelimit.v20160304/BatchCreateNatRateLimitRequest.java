package ksyun.client.vpc.batchcreatenatratelimit.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname BatchCreateNatRateLimitRequest
* @Description 请求参数
*/
@Data
public class BatchCreateNatRateLimitRequest{
    /**出带宽限速*/
    @KsYunField(name="BandwidthLimit")
    private Integer BandwidthLimit;

    /**入带宽限速*/
    @KsYunField(name="InBandwidthLimit")
    private Integer InBandwidthLimit;

    /**弹性网卡ID*/
    @KsYunField(name = "NetworkInterfaceId", type = 1)
    private List<String> NetworkInterfaceIdList;

}
