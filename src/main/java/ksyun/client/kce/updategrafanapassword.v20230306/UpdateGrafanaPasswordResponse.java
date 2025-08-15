package ksyun.client.kce.updategrafanapassword.v20230306;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname UpdateGrafanaPasswordResponse @Description UpdateGrafanaPassword 返回体
 */
@Data
@ToString
public class UpdateGrafanaPasswordResponse extends BaseResponseModel {

  /** 请求id */
  @JsonProperty("RequestId")
  private String requestId;

  // 返回结果，需要按需扩展

}
