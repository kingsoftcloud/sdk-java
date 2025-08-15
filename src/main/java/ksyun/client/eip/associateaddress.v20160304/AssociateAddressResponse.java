package ksyun.client.eip.associateaddress.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname AssociateAddressResponse @Description AssociateAddress 返回体
 */
@Data
@ToString
public class AssociateAddressResponse extends BaseResponseModel {

  /** 请求id */
  @JsonProperty("RequestId")
  private String requestId;

  // 返回结果，需要按需扩展

}
