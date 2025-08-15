package ksyun.client.kce.describeeventlogs.v20230101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname DescribeEventLogsResponse @Description DescribeEventLogs 返回体
 */
@Data
@ToString
public class DescribeEventLogsResponse extends BaseResponseModel {

  /** 请求id */
  @JsonProperty("RequestId")
  private String requestId;

  // 返回结果，需要按需扩展

}
