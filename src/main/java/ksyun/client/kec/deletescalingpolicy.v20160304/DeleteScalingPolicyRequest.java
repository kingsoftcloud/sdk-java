package ksyun.client.kec.deletescalingpolicy.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DeleteScalingPolicyRequest @Description 请求参数
 */
@Data
public class DeleteScalingPolicyRequest {
  /** 伸缩组Id，表示待删除告警策略所在的伸缩组 */
  @KsYunField(name = "ScalingGroupId")
  private String ScalingGroupId;

  /** 告警触发策略Id，待删除的告警触发策略Id */
  @KsYunField(name = "ScalingPolicyId")
  private String ScalingPolicyId;
}
