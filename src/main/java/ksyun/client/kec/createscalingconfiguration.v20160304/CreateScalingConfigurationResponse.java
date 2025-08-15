package ksyun.client.kec.createscalingconfiguration.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname CreateScalingConfigurationResponse @Description CreateScalingConfiguration 返回体
 */
@Data
@ToString
public class CreateScalingConfigurationResponse extends BaseResponseModel {

  /** 请求id */
  @JsonProperty("RequestId")
  private String requestId;

  // 返回结果，需要按需扩展

}
