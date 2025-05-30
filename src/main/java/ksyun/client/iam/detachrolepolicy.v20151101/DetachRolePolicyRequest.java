package ksyun.client.iam.detachrolepolicy.v20151101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname DetachRolePolicyRequest
 * @Description 请求参数
 */
@Data
public class DetachRolePolicyRequest {
    /**
     * 角色名称
     */
    @KsYunField(name = "RoleName")
    private String RoleName;

    /**
     * 待分离的策略krn标识
     */
    @KsYunField(name = "PolicyKrn")
    private String PolicyKrn;

}