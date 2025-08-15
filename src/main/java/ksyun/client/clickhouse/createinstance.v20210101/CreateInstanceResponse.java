package ksyun.client.clickhouse.createinstance.v20210101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname CreateInstanceResponse @Description CreateInstance 返回体
 */
@Data
@ToString
public class CreateInstanceResponse extends BaseResponseModel {

  /** 请求id */
  @JsonProperty("RequestId")
  private String requestId;

  // 返回结果，需要按需扩展

}
