package ksyun.client.mongodb.allocateeip.v20170101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname AllocateEipResponse @Description AllocateEip 返回体
 */
@Data
@ToString
public class AllocateEipResponse extends BaseResponseModel {

  /** 请求id */
  @JsonProperty("RequestId")
  private String requestId;

  // 返回结果，需要按需扩展

}
