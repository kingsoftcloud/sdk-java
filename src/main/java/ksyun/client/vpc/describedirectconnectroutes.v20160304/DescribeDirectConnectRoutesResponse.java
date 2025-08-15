package ksyun.client.vpc.describedirectconnectroutes.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname DescribeDirectConnectRoutesResponse @Description DescribeDirectConnectRoutes 返回体
 */
@Data
@ToString
public class DescribeDirectConnectRoutesResponse extends BaseResponseModel {

  /** 请求id */
  @JsonProperty("RequestId")
  private String requestId;

  // 返回结果，需要按需扩展

}
