package ksyun.client.memcached.createcachecluster.v20180627;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname CreateCacheClusterResponse @Description CreateCacheCluster 返回体
 */
@Data
@ToString
public class CreateCacheClusterResponse extends BaseResponseModel {

  /** 请求id */
  @JsonProperty("RequestId")
  private String requestId;

  // 返回结果，需要按需扩展

}
