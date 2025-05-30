package ksyun.client.ked.strategybound.v20250501;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname StrategyboundRequest
 * @Description 请求参数
 */
@Data
public class StrategyboundRequest {
    /**
     * 策略组 id
     */
    @KsYunField(name = "securityGroupId")
    private String SecurityGroupId;

    /**
     * 云电脑 id
     */
    @KsYunField(name = "instanceId")
    private String InstanceId;

}