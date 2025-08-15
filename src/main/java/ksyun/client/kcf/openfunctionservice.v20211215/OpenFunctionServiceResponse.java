package ksyun.client.kcf.openfunctionservice.v20211215;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname OpenFunctionServiceResponse @Description OpenFunctionService 返回体
 */
@Data
@ToString
public class OpenFunctionServiceResponse extends BaseResponseModel {

  /** 请求id */
  @JsonProperty("RequestId")
  private String requestId;

  // 返回结果，需要按需扩展

}
