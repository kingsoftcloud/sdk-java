package ksyun.client.kcrs.createinternalendpointdns.v20211109;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname CreateInternalEndpointDnsResponse @Description CreateInternalEndpointDns 返回体
 */
@Data
@ToString
public class CreateInternalEndpointDnsResponse extends BaseResponseModel {

  /** 请求id */
  @JsonProperty("RequestId")
  private String requestId;

  // 返回结果，需要按需扩展

}
