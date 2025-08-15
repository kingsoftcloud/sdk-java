package ksyun.client.kead.describeblockip.v20200101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname DescribeBlockIpResponse @Description DescribeBlockIp 返回体
 */
@Data
@ToString
public class DescribeBlockIpResponse extends BaseResponseModel {

  /** 请求id */
  @JsonProperty("RequestId")
  private String requestId;

  // 返回结果，需要按需扩展

}
