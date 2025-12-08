package ksyun.client.slb.deleterulegroup.v20250430;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DeleteRuleGroupRequest
* @Description 请求参数
*/
@Data
public class DeleteRuleGroupRequest{
    /**转发策略的ID*/
    @KsYunField(name="RuleGroupId")
    private String RuleGroupId;

}
