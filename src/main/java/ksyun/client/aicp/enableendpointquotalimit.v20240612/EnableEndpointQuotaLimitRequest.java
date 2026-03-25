package ksyun.client.aicp.enableendpointquotalimit.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname EnableEndpointQuotaLimitRequest
* @Description 请求参数
*/
@Data
public class EnableEndpointQuotaLimitRequest{
    /**接入点ID*/
    @KsYunField(name="EndpointId")
    private String EndpointId;

    /**限额周期：
daily, weekly, monthly, custom*/
    @KsYunField(name="QuotaLimitCycle")
    private String QuotaLimitCycle;

    /**自定义周期，当QuotaLimitCycle为custom时必传*/
    @KsYunField(name="CustomCycle")
    private Integer CustomCycle;

    /**限额数量*/
    @KsYunField(name="QuotaLimitAmount")
    private Long QuotaLimitAmount;

}
