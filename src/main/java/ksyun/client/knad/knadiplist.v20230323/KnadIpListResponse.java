package ksyun.client.knad.knadiplist.v20230323;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname KnadIpListResponse @Description KnadIpList 返回体
 */
@Data
@ToString
public class KnadIpListResponse extends BaseResponseModel {

  /** 请求id */
  @JsonProperty("RequestId")
  private String requestId;

  // 返回结果，需要按需扩展

}
