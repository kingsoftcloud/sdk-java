package ksyun.client.pdns.unbindzonevpc.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname UnbindZoneVpcResponse @Description UnbindZoneVpc 返回体
 */
@Data
@ToString
public class UnbindZoneVpcResponse extends BaseResponseModel {

  /** 请求id */
  @JsonProperty("RequestId")
  private String requestId;

  // 返回结果，需要按需扩展

}
