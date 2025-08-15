package ksyun.client.kci.deleteimagecache.v20200702;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname DeleteImageCacheResponse @Description DeleteImageCache 返回体
 */
@Data
@ToString
public class DeleteImageCacheResponse extends BaseResponseModel {

  /** 请求id */
  @JsonProperty("RequestId")
  private String requestId;

  // 返回结果，需要按需扩展

}
