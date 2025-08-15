package ksyun.client.epc.describeimages.v20151101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribeImagesRequest @Description 请求参数
 */
@Data
public class DescribeImagesRequest {
  /** 单次调用可返回的最大条目数量 */
  @KsYunField(name = "MaxResults")
  private Integer MaxResults;

  /** 获取另一页返回结果的 token. */
  @KsYunField(name = "NextToken")
  private String NextToken;
}
