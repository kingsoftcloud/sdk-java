package ksyun.client.waf.modifyalbdomain.v20200707;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname ModifyAlbDomainResponse @Description ModifyAlbDomain 返回体
 */
@Data
@ToString
public class ModifyAlbDomainResponse extends BaseResponseModel {

  /** 请求id */
  @JsonProperty("RequestId")
  private String requestId;

  // 返回结果，需要按需扩展

}
