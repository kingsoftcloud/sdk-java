package ksyun.client.iam.attachrolepolicy.v20151101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname AttachRolePolicyRequest
* @Description 请求参数
*/
@Data
public class AttachRolePolicyRequest{
    /**角色名称*/
    @KsYunField(name="RoleName")
    private String RoleName;

    /**需要附加给角色的策略的krn*/
    @KsYunField(name="PolicyKrn")
    private String PolicyKrn;


}