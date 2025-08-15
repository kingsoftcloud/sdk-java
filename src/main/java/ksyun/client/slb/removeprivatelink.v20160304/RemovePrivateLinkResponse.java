package ksyun.client.slb.removeprivatelink.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname RemovePrivateLinkResponse @Description RemovePrivateLink 返回体
 */
@Data
@ToString
public class RemovePrivateLinkResponse extends BaseResponseModel {

  /** 请求id */
  @JsonProperty("RequestId")
  private String requestId;

  // 返回结果，需要按需扩展

}
