package ksyun.client.kec.disablescalinggroup.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DisableScalingGroupRequest @Description 请求参数
 */
@Data
public class DisableScalingGroupRequest {
  /** 需要停用得伸缩组ID */
  @KsYunField(name = "ScalingGroupId")
  private String ScalingGroupId;
}
