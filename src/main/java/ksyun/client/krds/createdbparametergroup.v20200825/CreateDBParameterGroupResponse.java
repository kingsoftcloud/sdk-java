package ksyun.client.krds.createdbparametergroup.v20200825;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname CreateDBParameterGroupResponse @Description CreateDBParameterGroup 返回体
 */
@Data
@ToString
public class CreateDBParameterGroupResponse extends BaseResponseModel {

  /** 请求id */
  @JsonProperty("RequestId")
  private String requestId;

  // 返回结果，需要按需扩展

}
