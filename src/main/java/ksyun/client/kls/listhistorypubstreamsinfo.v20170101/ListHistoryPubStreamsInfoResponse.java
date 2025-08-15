package ksyun.client.kls.listhistorypubstreamsinfo.v20170101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname ListHistoryPubStreamsInfoResponse @Description ListHistoryPubStreamsInfo 返回体
 */
@Data
@ToString
public class ListHistoryPubStreamsInfoResponse extends BaseResponseModel {

  /** 请求id */
  @JsonProperty("RequestId")
  private String requestId;

  // 返回结果，需要按需扩展

}
