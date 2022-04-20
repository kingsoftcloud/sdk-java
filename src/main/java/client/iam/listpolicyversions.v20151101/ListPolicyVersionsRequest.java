package client.iam.listpolicyversions.v20151101;
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
public class ListPolicyVersionsRequest{
    /**待查询的策略的krn标识
格式：krn:ksc:iam::account-id:policy/policy-name*/
    @KsYunField(name="PolicyKrn")
    private String PolicyKrn;


}