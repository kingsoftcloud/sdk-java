package ksyun.client.krds.stopaudit.v20160701;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname StopAuditResponse @Description StopAudit 返回体
 */
@Data
@ToString
public class StopAuditResponse extends BaseResponseModel {

  /** 请求id */
  @JsonProperty("RequestId")
  private String requestId;

  // 返回结果，需要按需扩展

}
