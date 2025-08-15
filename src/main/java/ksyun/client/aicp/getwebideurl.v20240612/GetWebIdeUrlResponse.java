package ksyun.client.aicp.getwebideurl.v20240612;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname GetWebIdeUrlResponse @Description GetWebIdeUrl 返回体
 */
@Data
@ToString
public class GetWebIdeUrlResponse extends BaseResponseModel {

  /** 请求id */
  @JsonProperty("RequestId")
  private String requestId;

  // 返回结果，需要按需扩展

}
