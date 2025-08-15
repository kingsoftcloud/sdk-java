package ksyun.client.bill.getproductcode.v20180601;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname GetProductCodeResponse @Description GetProductCode 返回体
 */
@Data
@ToString
public class GetProductCodeResponse extends BaseResponseModel {

  /** 请求id */
  @JsonProperty("RequestId")
  private String requestId;

  // 返回结果，需要按需扩展

}
