package ksyun.client.vpc.associatehavip.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname AssociateHaVipResponse @Description AssociateHaVip 返回体
 */
@Data
@ToString
public class AssociateHaVipResponse extends BaseResponseModel {

  /** 请求id */
  @JsonProperty("RequestId")
  private String requestId;

  // 返回结果，需要按需扩展

}
