package ksyun.client.kad.createforwardconf.v20161122;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname CreateForwardConfResponse @Description CreateForwardConf 返回体
 */
@Data
@ToString
public class CreateForwardConfResponse extends BaseResponseModel {

  /** 请求id */
  @JsonProperty("RequestId")
  private String requestId;

  // 返回结果，需要按需扩展

}
