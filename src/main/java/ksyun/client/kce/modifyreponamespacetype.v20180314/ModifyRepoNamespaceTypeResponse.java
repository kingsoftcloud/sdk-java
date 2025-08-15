package ksyun.client.kce.modifyreponamespacetype.v20180314;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname ModifyRepoNamespaceTypeResponse @Description ModifyRepoNamespaceType 返回体
 */
@Data
@ToString
public class ModifyRepoNamespaceTypeResponse extends BaseResponseModel {

  /** 请求id */
  @JsonProperty("RequestId")
  private String requestId;

  // 返回结果，需要按需扩展

}
