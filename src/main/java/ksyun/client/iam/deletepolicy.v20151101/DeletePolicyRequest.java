package ksyun.client.iam.deletepolicy.v20151101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DeletePolicyRequest @Description 请求参数
 */
@Data
public class DeletePolicyRequest {
  /** 待删除策略的唯一标识 格式：krn:ksc:iam::account-id:policy/policy-name */
  @KsYunField(name = "PolicyKrn")
  private String PolicyKrn;
}
