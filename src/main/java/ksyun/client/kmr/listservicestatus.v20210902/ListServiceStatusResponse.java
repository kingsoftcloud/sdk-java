package ksyun.client.kmr.listservicestatus.v20210902;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname ListServiceStatusResponse @Description ListServiceStatus 返回体
 */
@Data
@ToString
public class ListServiceStatusResponse extends BaseResponseModel {

  /** 请求id */
  @JsonProperty("RequestId")
  private String requestId;

  // 返回结果，需要按需扩展

}
