package ksyun.client.kcf.deletefunction.v20211215;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname DeleteFunctionResponse @Description DeleteFunction 返回体
 */
@Data
@ToString
public class DeleteFunctionResponse extends BaseResponseModel {

  /** 请求id */
  @JsonProperty("RequestId")
  private String requestId;

  // 返回结果，需要按需扩展

}
