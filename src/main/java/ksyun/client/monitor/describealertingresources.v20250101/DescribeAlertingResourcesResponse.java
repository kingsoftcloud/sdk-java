package ksyun.client.monitor.describealertingresources.v20250101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname DescribeAlertingResourcesResponse @Description DescribeAlertingResources 返回体
 */
@Data
@ToString
public class DescribeAlertingResourcesResponse extends BaseResponseModel {

  /** 请求id */
  @JsonProperty("RequestId")
  private String requestId;

  // 返回结果，需要按需扩展

}
