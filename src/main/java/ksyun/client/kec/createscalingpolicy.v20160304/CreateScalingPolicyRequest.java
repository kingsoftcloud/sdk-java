package ksyun.client.kec.createscalingpolicy.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreateScalingPolicyRequest
* @Description 请求参数
*/
@Data
public class CreateScalingPolicyRequest{
    /**要创建告警触发策略的伸缩组Id*/
    @KsYunField(name="ScalingGroupId")
    private String ScalingGroupId;

    /**用户自定义的告警策略名称*/
    @KsYunField(name="ScalingPolicyName")
    private String ScalingPolicyName;

    /**metric参数规定了具体的伸缩策略，格式为json格式。<br/>{"dimensionName":"cpu_usage","comparisonOperator":"Greater","threshold":50,"repeatTimes":2,"function":"avg","period":120}<br/>cpu使用率大于50%,且在接下来的2个周期(5分钟为1周期)都符合此规则，则促发伸缩行为，增加或减少对应的云主机*/
    @KsYunField(name="Metric")
    private String Metric;

    /**伸缩规则的调整方式。只有3种取值：<br/>TotalCapacity： 将当前伸缩组的实例数量调整到指定数量。<br/>QuantityChangeInCapacity：增加或减少指定数量的实例。<br/>PercentChangeInCapacity：增加或减少指定比例的实例(百分比)。*/
    @KsYunField(name="AdjustmentType")
    private String AdjustmentType;

    /**伸缩规则的调整值，若为负号表示减小实例。 adjustmentType的3种取值范围分别如下：<br/>TotalCapacity：0至10<br/>QuantityChangeInCapacity : -10至10 <br/>PercentChangeInCapacity:-100至100。*/
    @KsYunField(name="AdjustmentValue")
    private Integer AdjustmentValue;

    /**冷却时间，单位为秒，表示在同一伸缩组内，一个伸缩活动执行完成后的一段锁定时间。在这段时间内，该伸缩组不能执行其他伸缩活动*/
    @KsYunField(name="CoolDown")
    private Integer CoolDown;

}