package ksyun.client.resourcemanager.updateaccount.v20210320;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname UpdateAccountResponse @Description UpdateAccount 返回体
 */
@Data
@ToString
public class UpdateAccountResponse extends BaseResponseModel {

  /** 请求id */
  @JsonProperty("RequestId")
  private String requestId;

  // 返回结果，需要按需扩展

}
