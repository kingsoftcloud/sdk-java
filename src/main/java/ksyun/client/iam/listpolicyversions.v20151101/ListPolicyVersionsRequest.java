package ksyun.client.iam.listpolicyversions.v20151101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname ListPolicyVersionsRequest
 * @Description 请求参数
 */
@Data
public class ListPolicyVersionsRequest {
    /**
     * 待查询策略版本列表的策略的唯一标识
     * <p>
     * 格式：krn:ksc:iam::account-id:policy/policy-name
     */
    @KsYunField(name = "PolicyKrn")
    private String PolicyKrn;

}