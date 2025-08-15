package ksyun.client.kmr.listscalestrategy.v20210902;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ListScaleStrategyRequest @Description 请求参数
 */
@Data
public class ListScaleStrategyRequest {
  /** 集群ID */
  @KsYunField(name = "ClusterId")
  private String ClusterId;
}
