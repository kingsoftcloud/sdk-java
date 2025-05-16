package ksyun.client.iam.detachgrouppolicy.v20151101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

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