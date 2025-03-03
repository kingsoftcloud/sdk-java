package ksyun.client.iam.attachgrouppolicy.v20151101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname AttachGroupPolicyRequest
 * @Description 请求参数
 */
@Data
public class AttachGroupPolicyRequest {
    /**
     * 用户组名称
     */
    @KsYunField(name = "GroupName")
    private String GroupName;

    /**
     * 要附加的策略krn
     */
    @KsYunField(name = "PolicyKrn")
    private String PolicyKrn;


}