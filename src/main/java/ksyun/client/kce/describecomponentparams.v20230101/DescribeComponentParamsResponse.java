package ksyun.client.kce.describecomponentparams.v20230101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname DescribeComponentParamsResponse @Description DescribeComponentParams 返回体
 */
@Data
@ToString
public class DescribeComponentParamsResponse extends BaseResponseModel {

  /** 请求id */
  @JsonProperty("RequestId")
  private String requestId;

  // 返回结果，需要按需扩展

}
