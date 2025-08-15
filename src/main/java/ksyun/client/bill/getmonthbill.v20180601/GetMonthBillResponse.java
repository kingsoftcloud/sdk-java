package ksyun.client.bill.getmonthbill.v20180601;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname GetMonthBillResponse @Description GetMonthBill 返回体
 */
@Data
@ToString
public class GetMonthBillResponse extends BaseResponseModel {

  /** 请求id */
  @JsonProperty("RequestId")
  private String requestId;

  // 返回结果，需要按需扩展

}
