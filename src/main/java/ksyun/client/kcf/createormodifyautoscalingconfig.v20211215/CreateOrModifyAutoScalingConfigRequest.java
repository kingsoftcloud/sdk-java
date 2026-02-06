package ksyun.client.kcf.createormodifyautoscalingconfig.v20211215;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreateOrModifyAutoScalingConfigRequest
* @Description 请求参数
*/
@Data
public class CreateOrModifyAutoScalingConfigRequest{
    /***/
    @KsYunField(name="FunctionId")
    private String FunctionId;

    /**预留实例数。保持常驻的实例数量*/
    @KsYunField(name="IdleReplicaCount")
    private Integer IdleReplicaCount;

    /**最大实例数*/
    @KsYunField(name="MaxReplicaCount")
    private Integer MaxReplicaCount;

    /**最小实例数*/
    @KsYunField(name="MinReplicaCount")
    private Integer MinReplicaCount;

    /**冷却时间。无弹性伸缩策略命中时，等待指令冷却时间后，实例数缩减为预留实例数*/
    @KsYunField(name="CooldownPeriod")
    private Integer CooldownPeriod;

    /**缩容稳定窗口期。在执行弹性伸缩动作后，指定窗口时间内不会再进行缩容操作*/
    @KsYunField(name="StabilizationWindowSeconds")
    private Integer StabilizationWindowSeconds;

}
