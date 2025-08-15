package ksyun.client.iam.getpolicy.v20151101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname GetPolicyRequest @Description 请求参数
 */
@Data
public class GetPolicyRequest {
  /***/
  @KsYunField(name = "PolicyKrn")
  private String PolicyKrn;
}
