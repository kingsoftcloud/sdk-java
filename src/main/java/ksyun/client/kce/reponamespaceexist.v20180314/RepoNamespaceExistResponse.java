package ksyun.client.kce.reponamespaceexist.v20180314;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname RepoNamespaceExistResponse @Description RepoNamespaceExist 返回体
 */
@Data
@ToString
public class RepoNamespaceExistResponse extends BaseResponseModel {

  /** 请求id */
  @JsonProperty("RequestId")
  private String requestId;

  // 返回结果，需要按需扩展

}
