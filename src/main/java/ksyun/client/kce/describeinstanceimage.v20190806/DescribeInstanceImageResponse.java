package ksyun.client.kce.describeinstanceimage.v20190806;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname DescribeInstanceImageResponse @Description DescribeInstanceImage 返回体
 */
@Data
@ToString
public class DescribeInstanceImageResponse extends BaseResponseModel {

  /** 请求id */
  @JsonProperty("RequestId")
  private String requestId;

  // 返回结果，需要按需扩展

}
