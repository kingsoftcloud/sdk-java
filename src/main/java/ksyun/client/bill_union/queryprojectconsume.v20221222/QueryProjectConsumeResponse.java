package ksyun.client.bill_union.queryprojectconsume.v20221222;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname QueryProjectConsumeResponse @Description QueryProjectConsume 返回体
 */
@Data
@ToString
public class QueryProjectConsumeResponse extends BaseResponseModel {

  /** 请求id */
  @JsonProperty("RequestId")
  private String requestId;

  // 返回结果，需要按需扩展

}
