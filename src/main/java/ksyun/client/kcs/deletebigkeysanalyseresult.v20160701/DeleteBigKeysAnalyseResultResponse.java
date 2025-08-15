package ksyun.client.kcs.deletebigkeysanalyseresult.v20160701;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname DeleteBigKeysAnalyseResultResponse @Description DeleteBigKeysAnalyseResult 返回体
 */
@Data
@ToString
public class DeleteBigKeysAnalyseResultResponse extends BaseResponseModel {

  /** 请求id */
  @JsonProperty("RequestId")
  private String requestId;

  // 返回结果，需要按需扩展

}
