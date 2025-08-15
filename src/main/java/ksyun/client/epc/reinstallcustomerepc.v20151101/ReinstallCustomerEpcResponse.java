package ksyun.client.epc.reinstallcustomerepc.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname ReinstallCustomerEpcResponse @Description ReinstallCustomerEpc 返回体
 */
@Data
@ToString
public class ReinstallCustomerEpcResponse extends BaseResponseModel {

  /** 请求id */
  @JsonProperty("RequestId")
  private String requestId;

  // 返回结果，需要按需扩展

}
