package ksyun.client.mongodb.describeparamgroupinfo.v20170101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribeParamGroupInfoRequest @Description 请求参数
 */
@Data
public class DescribeParamGroupInfoRequest {
  /** 参数组Id */
  @KsYunField(name = "ParamGroupId")
  private String ParamGroupId;
}
