package ksyun.client.waf.createaccesscontrolrule.v20200707;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreateAccessControlRuleRequest
* @Description 请求参数
*/
@Data
public class CreateAccessControlRuleRequest{
    /**描述：域名记录ID*/
    @KsYunField(name="ResourceRecordId")
    private String ResourceRecordId;

    /**描述：防护规则名称*/
    @KsYunField(name="RuleName")
    private String RuleName;

    /**描述：风险等级*/
    @KsYunField(name="Level")
    private Integer Level;

    /**描述：防护动作*/
    @KsYunField(name="RuleAction")
    private Integer RuleAction;

    /**描述：规则开启状态*/
    @KsYunField(name="Status")
    private Boolean Status;

    /**规则条件 示例：[{"RuleType":"REQUEST_HEADERS","MatchRule":0,"RuleData":"json","ArgName":"Content-Type"},{"RuleType":"IP","MatchRule":0,"RuleData":"1.1.1.1"}]*/
    @KsYunField(name="MatchRuleInfo")
    private String MatchRuleInfo;

    /**优先级：可取值 1-100*/
    @KsYunField(name="Priority")
    private Integer Priority;

}
