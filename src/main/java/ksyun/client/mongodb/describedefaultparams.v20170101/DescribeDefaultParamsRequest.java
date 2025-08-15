package ksyun.client.mongodb.describedefaultparams.v20170101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribeDefaultParamsRequest @Description 请求参数
 */
@Data
public class DescribeDefaultParamsRequest {
  /** 实例版本 */
  @KsYunField(name = "DbVersion")
  private String DbVersion;
}
