package ksyun.client.ked.strategyunbound.v20250501;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

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