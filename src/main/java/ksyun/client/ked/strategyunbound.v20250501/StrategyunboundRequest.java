package ksyun.client.ked.strategyunbound.v20250501;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname StrategyunboundRequest
 * @Description 请求参数
 */
@Data
public class StrategyunboundRequest {
    /**
     * 策略组id
     */
    @KsYunField(name = "securityGroupId")
    private String SecurityGroupId;

    /**
     * 云电脑id
     */
    @KsYunField(name = "instanceId")
    private String InstanceId;

}