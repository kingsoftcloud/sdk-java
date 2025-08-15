package ksyun.client.memcached.describeregions.v20180627;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname DescribeRegionsResponse @Description DescribeRegions 返回体
 */
@Data
@ToString
public class DescribeRegionsResponse extends BaseResponseModel {

  /** 请求id */
  @JsonProperty("RequestId")
  private String requestId;

  // 返回结果，需要按需扩展

}
