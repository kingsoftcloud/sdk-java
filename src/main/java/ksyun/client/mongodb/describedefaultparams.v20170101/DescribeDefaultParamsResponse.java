package ksyun.client.mongodb.describedefaultparams.v20170101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname DescribeDefaultParamsResponse @Description DescribeDefaultParams 返回体
 */
@Data
@ToString
public class DescribeDefaultParamsResponse extends BaseResponseModel {

  /** 请求id */
  @JsonProperty("RequestId")
  private String requestId;

  // 返回结果，需要按需扩展

}
