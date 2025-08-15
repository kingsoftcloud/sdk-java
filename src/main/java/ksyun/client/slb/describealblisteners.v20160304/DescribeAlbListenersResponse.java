package ksyun.client.slb.describealblisteners.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname DescribeAlbListenersResponse @Description DescribeAlbListeners 返回体
 */
@Data
@ToString
public class DescribeAlbListenersResponse extends BaseResponseModel {

  /** 请求id */
  @JsonProperty("RequestId")
  private String requestId;

  // 返回结果，需要按需扩展

}
