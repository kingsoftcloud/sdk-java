package ksyun.client.cen.describecenroutes.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname DescribeCenRoutesResponse @Description DescribeCenRoutes 返回体
 */
@Data
@ToString
public class DescribeCenRoutesResponse extends BaseResponseModel {

  /** 请求id */
  @JsonProperty("RequestId")
  private String requestId;

  // 返回结果，需要按需扩展

}
