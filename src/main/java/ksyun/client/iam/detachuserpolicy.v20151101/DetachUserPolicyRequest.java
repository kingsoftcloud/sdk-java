package ksyun.client.iam.detachuserpolicy.v20151101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname DetachUserPolicyRequest
 * @Description 请求参数
 */
@Data
public class DetachUserPolicyRequest {
    /**
     * 需要解绑的策略的krn标识
     * 格式：krn:ksc:iam::account-id:policy/policy-name
     */
    @KsYunField(name = "PolicyKrn")
    private String PolicyKrn;

    /**
     * 需要解绑的策略的目标用户名
     */
    @KsYunField(name = "UserName")
    private String UserName;

}