package ksyun.client.slb.deletehostheader.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname DeleteHostHeaderResponse @Description DeleteHostHeader 返回体
 */
@Data
@ToString
public class DeleteHostHeaderResponse extends BaseResponseModel {

  /** 请求id */
  @JsonProperty("RequestId")
  private String requestId;

  // 返回结果，需要按需扩展

}
