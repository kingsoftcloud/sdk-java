package ksyun.client.tidb.updatebackuprule.v20210520;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname UpdateBackupRuleResponse @Description UpdateBackupRule 返回体
 */
@Data
@ToString
public class UpdateBackupRuleResponse extends BaseResponseModel {

  /** 请求id */
  @JsonProperty("RequestId")
  private String requestId;

  // 返回结果，需要按需扩展

}
