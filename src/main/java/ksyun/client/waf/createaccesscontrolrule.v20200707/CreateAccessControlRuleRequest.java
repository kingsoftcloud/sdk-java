package ksyun.client.waf.createaccesscontrolrule.v20200707;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname CreateAccessControlRuleRequest
 * @Description 请求参数
 */
@Data
public class CreateAccessControlRuleRequest {
    /**
     * 描述：域名记录ID
     */
    @KsYunField(name = "ResourceRecordId")
    private String ResourceRecordId;

    /**
     * 描述：防护规则名称
     */
    @KsYunField(name = "RuleName")
    private String RuleName;

    /**
     * 描述：规则匹配字段
     */
    @KsYunField(name = "RuleType")
    private String RuleType;

    /**
     * 描述：参数名
     */
    @KsYunField(name = "ArgName")
    private String ArgName;

    /**
     * 描述：防护规则数据
     */
    @KsYunField(name = "RuleData")
    private String RuleData;

    /**
     * 描述：匹配条件
     */
    @KsYunField(name = "MatchRule")
    private Integer MatchRule;

    /**
     * 描述：风险等级
     */
    @KsYunField(name = "Level")
    private Integer Level;

    /**
     * 描述：防护动作
     */
    @KsYunField(name = "RuleAction")
    private Integer RuleAction;

    /**
     * 描述：规则开启状态
     */
    @KsYunField(name = "Status")
    private Boolean Status;

}