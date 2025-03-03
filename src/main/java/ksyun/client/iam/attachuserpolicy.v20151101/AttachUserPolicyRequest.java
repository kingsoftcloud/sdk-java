package ksyun.client.iam.attachuserpolicy.v20151101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname AttachUserPolicyRequest
 * @Description 请求参数
 */
@Data
public class AttachUserPolicyRequest {
    /**
     * 待附加的策略标识
     * 格式：krn:ksc:iam::account-id:policy/policy-name
     */
    @KsYunField(name = "PolicyKrn")
    private String PolicyKrn;

    /**
     * 策略的附加目标用户名
     */
    @KsYunField(name = "UserName")
    private String UserName;

}