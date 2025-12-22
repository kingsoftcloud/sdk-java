package ksyun.client.ked.queryruledetail.v1;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname QueryRuledetailRequest
* @Description 请求参数
*/
@Data
public class QueryRuledetailRequest{
    /**策略组 id*/
    @KsYunField(name="securityGroupId")
    private String SecurityGroupId;

}
