package ksyun.client.ked.deletelabel.v20250501;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname DeleteLabelResponse @Description DeleteLabel 返回体
 */
@Data
@ToString
public class DeleteLabelResponse extends BaseResponseModel {

  /** 请求id */
  @JsonProperty("RequestId")
  private String requestId;

  // 返回结果，需要按需扩展

}
