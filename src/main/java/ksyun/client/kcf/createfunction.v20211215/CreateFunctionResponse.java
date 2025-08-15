package ksyun.client.kcf.createfunction.v20211215;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname CreateFunctionResponse @Description CreateFunction 返回体
 */
@Data
@ToString
public class CreateFunctionResponse extends BaseResponseModel {

  /** 请求id */
  @JsonProperty("RequestId")
  private String requestId;

  // 返回结果，需要按需扩展

}
