package ksyun.client.kce.associatecluster.v20230306;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname AssociateClusterResponse @Description AssociateCluster 返回体
 */
@Data
@ToString
public class AssociateClusterResponse extends BaseResponseModel {

  /** 请求id */
  @JsonProperty("RequestId")
  private String requestId;

  // 返回结果，需要按需扩展

}
