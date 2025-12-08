package ksyun.client.iam.getpolicyversion.v20151101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname GetPolicyVersionRequest
* @Description 请求参数
*/
@Data
public class GetPolicyVersionRequest{
    /**待查询的策略的唯一标识
格式：krn:ksc:iam::account-id:policy/policy-name*/
    @KsYunField(name="PolicyKrn")
    private String PolicyKrn;

    /**待查询的策略版本Id*/
    @KsYunField(name="VersionId")
    private String VersionId;

}
