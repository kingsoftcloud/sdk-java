package ksyun.client.krds.modifysecuritygrouprulename.v20200825;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname ModifySecurityGroupRuleNameResponse @Description ModifySecurityGroupRuleName 返回体
 */
@Data
@ToString
public class ModifySecurityGroupRuleNameResponse extends BaseResponseModel {

  /** 请求id */
  @JsonProperty("RequestId")
  private String requestId;

  // 返回结果，需要按需扩展

}
