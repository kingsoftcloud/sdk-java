package ksyun.client.kcf.describetriggers.v20211215;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribeTriggersRequest @Description 请求参数
 */
@Data
public class DescribeTriggersRequest {
  /** 函数Id */
  @KsYunField(name = "FunctionId")
  private String FunctionId;
}
