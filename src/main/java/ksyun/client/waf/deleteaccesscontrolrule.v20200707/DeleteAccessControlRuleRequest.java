package ksyun.client.waf.deleteaccesscontrolrule.v20200707;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DeleteAccessControlRuleRequest
* @Description 请求参数
*/
@Data
public class DeleteAccessControlRuleRequest{
    /**描述：防护规则ID*/
    @KsYunField(name="RuleId")
    private String RuleId;

}
