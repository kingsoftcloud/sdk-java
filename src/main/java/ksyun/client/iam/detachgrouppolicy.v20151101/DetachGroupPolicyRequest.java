package ksyun.client.iam.detachgrouppolicy.v20151101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DetachGroupPolicyRequest
 * @Description 请求参数
 */
@Data
public class DetachGroupPolicyRequest {
    /**
     * 用户组名
     */
    @KsYunField(name = "GroupName")
    private String GroupName;

    /**
     * 要分离的策略krn
     */
    @KsYunField(name = "PolicyKrn")
    private String PolicyKrn;

}