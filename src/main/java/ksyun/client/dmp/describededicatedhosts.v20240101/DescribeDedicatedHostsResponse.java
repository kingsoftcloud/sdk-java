package ksyun.client.dmp.describededicatedhosts.v20240101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname DescribeDedicatedHostsResponse @Description DescribeDedicatedHosts 返回体
 */
@Data
@ToString
public class DescribeDedicatedHostsResponse extends BaseResponseModel {

  /** 请求id */
  @JsonProperty("RequestId")
  private String requestId;

  // 返回结果，需要按需扩展

}
