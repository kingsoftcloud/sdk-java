package ksyun.client.kce.describereleasedetail.v20190806;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname DescribeReleaseDetailResponse @Description DescribeReleaseDetail 返回体
 */
@Data
@ToString
public class DescribeReleaseDetailResponse extends BaseResponseModel {

  /** 请求id */
  @JsonProperty("RequestId")
  private String requestId;

  // 返回结果，需要按需扩展

}
