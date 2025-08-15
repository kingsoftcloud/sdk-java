package ksyun.client.ked.strategydelete.v20250501;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname StrategydeleteRequest @Description 请求参数
 */
@Data
public class StrategydeleteRequest {
  /** 策略组 id 列表 */
  @KsYunField(name = "id")
  private Integer Id;
}
