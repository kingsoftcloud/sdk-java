package ksyun.client.dts.describeprecheck.v20180108;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribePrecheckRequest @Description 请求参数
 */
@Data
public class DescribePrecheckRequest {
  /** 预检查任务ID */
  @KsYunField(name = "PrecheckId")
  private String PrecheckId;
}
