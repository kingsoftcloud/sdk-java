package ksyun.client.eip.modifyaddress.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname ModifyAddressResponse @Description ModifyAddress 返回体
 */
@Data
@ToString
public class ModifyAddressResponse extends BaseResponseModel {

  /** 请求id */
  @JsonProperty("RequestId")
  private String requestId;

  // 返回结果，需要按需扩展

}
