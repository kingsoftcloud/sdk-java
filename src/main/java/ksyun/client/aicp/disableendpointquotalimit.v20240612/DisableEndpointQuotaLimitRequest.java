package ksyun.client.aicp.disableendpointquotalimit.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DisableEndpointQuotaLimitRequest
* @Description 请求参数
*/
@Data
public class DisableEndpointQuotaLimitRequest{
    /**接入点ID*/
    @KsYunField(name="EndpointId")
    private String EndpointId;

    /**限额周期：
daily, weekly, monthly, custom*/
    @KsYunField(name="QuotaLimitCycle")
    private String QuotaLimitCycle;

    /**自定义周期，QuotaLimitCycle为custom时必填*/
    @KsYunField(name="CustomCycle")
    private String CustomCycle;

    /**限额数量*/
    @KsYunField(name="QuotaLimitAmount")
    private String QuotaLimitAmount;

}
