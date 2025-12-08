package ksyun.client.slb.addrule.v20250430;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname AddRuleRequest
* @Description 请求参数
*/
@Data
public class AddRuleRequest{
    /**转发策略的ID*/
    @KsYunField(name="RuleGroupId")
    private String RuleGroupId;

    /**匹配规则类型(domain|url)*/
    @KsYunField(name="RuleType")
    private String RuleType;

    /**匹配规则的值*/
    @KsYunField(name="RuleValue")
    private String RuleValue;

}
