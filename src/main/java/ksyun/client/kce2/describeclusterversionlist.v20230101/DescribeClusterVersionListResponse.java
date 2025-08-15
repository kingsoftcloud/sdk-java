package ksyun.client.kce2.describeclusterversionlist.v20230101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname DescribeClusterVersionListResponse @Description DescribeClusterVersionList 返回体
 */
@Data
@ToString
public class DescribeClusterVersionListResponse extends BaseResponseModel {

  /** 请求id */
  @JsonProperty("RequestId")
  private String requestId;

  // 返回结果，需要按需扩展

}
