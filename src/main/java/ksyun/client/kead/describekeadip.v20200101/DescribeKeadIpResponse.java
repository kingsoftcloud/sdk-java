package ksyun.client.kead.describekeadip.v20200101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname DescribeKeadIpResponse @Description DescribeKeadIp 返回体
 */
@Data
@ToString
public class DescribeKeadIpResponse extends BaseResponseModel {

  /** 请求id */
  @JsonProperty("RequestId")
  private String requestId;

  // 返回结果，需要按需扩展

}
