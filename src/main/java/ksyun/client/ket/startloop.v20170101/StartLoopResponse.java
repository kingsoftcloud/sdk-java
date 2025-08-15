package ksyun.client.ket.startloop.v20170101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname StartLoopResponse @Description StartLoop 返回体
 */
@Data
@ToString
public class StartLoopResponse extends BaseResponseModel {

  /** 请求id */
  @JsonProperty("RequestId")
  private String requestId;

  // 返回结果，需要按需扩展

}
