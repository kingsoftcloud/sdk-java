package ksyun.client.iam.deletepolicyversion.v20151101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DeletePolicyVersionRequest
 * @Description 请求参数
 */
@Data
public class DeletePolicyVersionRequest {
    /**
     * 待删除策略版本的策略的唯一标识
     * 格式：krn:ksc:iam::account-id:policy/policy-name
     */
    @KsYunField(name = "PolicyKrn")
    private String PolicyKrn;

    /**
     * 待删除的策略版本Id
     */
    @KsYunField(name = "VersionId")
    private String VersionId;


}