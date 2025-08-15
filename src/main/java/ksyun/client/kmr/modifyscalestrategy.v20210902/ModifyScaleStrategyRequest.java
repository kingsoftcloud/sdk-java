package ksyun.client.kmr.modifyscalestrategy.v20210902;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ModifyScaleStrategyRequest @Description 请求参数
 */
@Data
public class ModifyScaleStrategyRequest {
  /** 集群ID */
  @KsYunField(name = "ClusterId")
  private String ClusterId;
}
