package ksyun.client.kce.updatenodepooldelprotection.v20190806;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname UpdateNodePoolDelProtectionResponse @Description UpdateNodePoolDelProtection 返回体
 */
@Data
@ToString
public class UpdateNodePoolDelProtectionResponse extends BaseResponseModel {

  /** 请求id */
  @JsonProperty("RequestId")
  private String requestId;

  // 返回结果，需要按需扩展

}
