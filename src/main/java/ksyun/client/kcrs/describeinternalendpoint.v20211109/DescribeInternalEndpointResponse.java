package ksyun.client.kcrs.describeinternalendpoint.v20211109;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname DescribeInternalEndpointResponse @Description DescribeInternalEndpoint 返回体
 */
@Data
@ToString
public class DescribeInternalEndpointResponse extends BaseResponseModel {

  /** 请求id */
  @JsonProperty("RequestId")
  private String requestId;

  // 返回结果，需要按需扩展

}
