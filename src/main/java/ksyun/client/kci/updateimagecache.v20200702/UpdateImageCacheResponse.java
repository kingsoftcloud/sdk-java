package ksyun.client.kci.updateimagecache.v20200702;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname UpdateImageCacheResponse @Description UpdateImageCache 返回体
 */
@Data
@ToString
public class UpdateImageCacheResponse extends BaseResponseModel {

  /** 请求id */
  @JsonProperty("RequestId")
  private String requestId;

  // 返回结果，需要按需扩展

}
