package ksyun.client.iam.setdefaultpolicyversion.v20151101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname SetDefaultPolicyVersionRequest @Description 请求参数
 */
@Data
public class SetDefaultPolicyVersionRequest {
  /** 待设定默认策略版本的策略标识 格式：krn:ksc:iam::account-id:policy/policy-name */
  @KsYunField(name = "PolicyKrn")
  private String PolicyKrn;

  /** 待设定为默认版本的策略版本Id */
  @KsYunField(name = "VersionId")
  private String VersionId;
}
