package ksyun.client.postgresql.modifydbbackuppolicy.v20181225;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname ModifyDBBackupPolicyResponse @Description ModifyDBBackupPolicy 返回体
 */
@Data
@ToString
public class ModifyDBBackupPolicyResponse extends BaseResponseModel {

  /** 请求id */
  @JsonProperty("RequestId")
  private String requestId;

  // 返回结果，需要按需扩展

}
