package ksyun.client.dmp.testinstanceconnection.v20240101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname TestInstanceConnectionResponse @Description TestInstanceConnection 返回体
 */
@Data
@ToString
public class TestInstanceConnectionResponse extends BaseResponseModel {

  /** 请求id */
  @JsonProperty("RequestId")
  private String requestId;

  // 返回结果，需要按需扩展

}
