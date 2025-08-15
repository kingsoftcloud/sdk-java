package ksyun.client.krds.restoretosginstance.v20160701;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname RestoreToSgInstanceResponse @Description RestoreToSgInstance 返回体
 */
@Data
@ToString
public class RestoreToSgInstanceResponse extends BaseResponseModel {

  /** 请求id */
  @JsonProperty("RequestId")
  private String requestId;

  // 返回结果，需要按需扩展

}
