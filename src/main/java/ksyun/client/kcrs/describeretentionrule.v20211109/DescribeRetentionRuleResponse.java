package ksyun.client.kcrs.describeretentionrule.v20211109;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname DescribeRetentionRuleResponse @Description DescribeRetentionRule 返回体
 */
@Data
@ToString
public class DescribeRetentionRuleResponse extends BaseResponseModel {

  /** 请求id */
  @JsonProperty("RequestId")
  private String requestId;

  // 返回结果，需要按需扩展

}
