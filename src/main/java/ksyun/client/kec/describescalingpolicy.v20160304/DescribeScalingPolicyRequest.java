package ksyun.client.kec.describescalingpolicy.v20160304;

import common.annotation.KsYunField;
import java.util.List;
import lombok.Data;

/**
 * @Classname DescribeScalingPolicyRequest @Description 请求参数
 */
@Data
public class DescribeScalingPolicyRequest {
  /** 伸缩组ID，表示待查询告警触发策略所在的伸缩组ID */
  @KsYunField(name = "ScalingGroupId")
  private String ScalingGroupId;

  /** 待查询的告警触发策略ID数组，数组下标从0开始 */
  @KsYunField(name = "ScalingPolicyId")
  private List<String> ScalingPolicyIdList;

  /** 待查询的告警触发策略名称 */
  @KsYunField(name = "ScalingPolicyName")
  private String ScalingPolicyName;

  /** 偏移量，默认为0 */
  @KsYunField(name = "Marker")
  private Integer Marker;

  /** 一次最多显示的CVM实例数量，默认为10,最小为5 */
  @KsYunField(name = "MaxResults")
  private Integer MaxResults;
}
