package ksyun.client.ked.clouddesklist.v20250501;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname CloudDesklistResponse @Description CloudDesklist 返回体
 */
@Data
@ToString
public class CloudDesklistResponse extends BaseResponseModel {

  /** 请求id */
  @JsonProperty("RequestId")
  private String requestId;

  // 返回结果，需要按需扩展

}
