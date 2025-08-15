package ksyun.client.milvus.listsecuritygroup.v20231010;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname ListSecurityGroupResponse @Description ListSecurityGroup 返回体
 */
@Data
@ToString
public class ListSecurityGroupResponse extends BaseResponseModel {

  /** 请求id */
  @JsonProperty("RequestId")
  private String requestId;

  // 返回结果，需要按需扩展

}
