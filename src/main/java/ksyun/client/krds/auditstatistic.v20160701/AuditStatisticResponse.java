package ksyun.client.krds.auditstatistic.v20160701;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname AuditStatisticResponse @Description AuditStatistic 返回体
 */
@Data
@ToString
public class AuditStatisticResponse extends BaseResponseModel {

  /** 请求id */
  @JsonProperty("RequestId")
  private String requestId;

  // 返回结果，需要按需扩展

}
