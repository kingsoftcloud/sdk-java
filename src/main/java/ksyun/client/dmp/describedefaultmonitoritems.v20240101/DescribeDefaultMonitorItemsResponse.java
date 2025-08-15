package ksyun.client.dmp.describedefaultmonitoritems.v20240101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname DescribeDefaultMonitorItemsResponse @Description DescribeDefaultMonitorItems 返回体
 */
@Data
@ToString
public class DescribeDefaultMonitorItemsResponse extends BaseResponseModel {

  /** 请求id */
  @JsonProperty("RequestId")
  private String requestId;

  // 返回结果，需要按需扩展

}
