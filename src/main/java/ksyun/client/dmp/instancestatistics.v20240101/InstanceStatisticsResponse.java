package ksyun.client.dmp.instancestatistics.v20240101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname InstanceStatisticsResponse @Description InstanceStatistics 返回体
 */
@Data
@ToString
public class InstanceStatisticsResponse extends BaseResponseModel {

  /** 请求id */
  @JsonProperty("RequestId")
  private String requestId;

  // 返回结果，需要按需扩展

}
