package ksyun.client.kce.upgraderelease.v20190806;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname UpgradeReleaseResponse @Description UpgradeRelease 返回体
 */
@Data
@ToString
public class UpgradeReleaseResponse extends BaseResponseModel {

  /** 请求id */
  @JsonProperty("RequestId")
  private String requestId;

  // 返回结果，需要按需扩展

}
