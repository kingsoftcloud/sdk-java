package ksyun.client.tidb.updatesecurityrule.v20210520;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname UpdateSecurityRuleRequest
* @Description 请求参数
*/
@Data
public class UpdateSecurityRuleRequest{
    /**安全组规则ID。可通过DescribeSecurityGroup接口获取。*/
    @KsYunField(name="RuleId")
    private String RuleId;

    /**安全组规则新描述。*/
    @KsYunField(name="Description")
    private String Description;

    /**安全组新规则。*/
    @KsYunField(name="Cidr")
    private String Cidr;

}
