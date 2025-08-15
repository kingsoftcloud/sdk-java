package ksyun.client.kce.describemonitormetricslist.v20230306;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname DescribeMonitorMetricsListResponse @Description DescribeMonitorMetricsList 返回体
 */
@Data
@ToString
public class DescribeMonitorMetricsListResponse extends BaseResponseModel {

  /** 请求id */
  @JsonProperty("RequestId")
  private String requestId;

  // 返回结果，需要按需扩展

}
