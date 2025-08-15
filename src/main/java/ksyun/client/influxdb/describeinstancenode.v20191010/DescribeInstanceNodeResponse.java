package ksyun.client.influxdb.describeinstancenode.v20191010;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname DescribeInstanceNodeResponse @Description DescribeInstanceNode 返回体
 */
@Data
@ToString
public class DescribeInstanceNodeResponse extends BaseResponseModel {

  /** 请求id */
  @JsonProperty("RequestId")
  private String requestId;

  // 返回结果，需要按需扩展

}
