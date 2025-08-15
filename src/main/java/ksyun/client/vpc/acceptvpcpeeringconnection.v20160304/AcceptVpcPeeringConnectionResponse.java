package ksyun.client.vpc.acceptvpcpeeringconnection.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname AcceptVpcPeeringConnectionResponse @Description AcceptVpcPeeringConnection 返回体
 */
@Data
@ToString
public class AcceptVpcPeeringConnectionResponse extends BaseResponseModel {

  /** 请求id */
  @JsonProperty("RequestId")
  private String requestId;

  // 返回结果，需要按需扩展

}
