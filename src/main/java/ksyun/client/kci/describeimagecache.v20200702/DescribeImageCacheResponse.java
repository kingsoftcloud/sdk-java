package ksyun.client.kci.describeimagecache.v20200702;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname DescribeImageCacheResponse @Description DescribeImageCache 返回体
 */
@Data
@ToString
public class DescribeImageCacheResponse extends BaseResponseModel {

  /** 请求id */
  @JsonProperty("RequestId")
  private String requestId;

  // 返回结果，需要按需扩展

}
