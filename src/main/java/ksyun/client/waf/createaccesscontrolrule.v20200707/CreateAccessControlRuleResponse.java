package ksyun.client.waf.createaccesscontrolrule.v20200707;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname CreateAccessControlRuleResponse @Description CreateAccessControlRule 返回体
 */
@Data
@ToString
public class CreateAccessControlRuleResponse extends BaseResponseModel {

  /** 请求id */
  @JsonProperty("RequestId")
  private String requestId;

  // 返回结果，需要按需扩展

}
