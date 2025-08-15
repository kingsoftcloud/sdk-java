package ksyun.client.klog.createlogpool.v20200731;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname CreateLogPoolResponse @Description CreateLogPool 返回体
 */
@Data
@ToString
public class CreateLogPoolResponse extends BaseResponseModel {

  /** 请求id */
  @JsonProperty("RequestId")
  private String requestId;

  // 返回结果，需要按需扩展

}
