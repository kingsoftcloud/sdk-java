package ksyun.client.slb.deleterule.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname DeleteRuleRequest
 * @Description 请求参数
 */
@Data
public class DeleteRuleRequest {
    /**
     * 规则的ID
     */
    @KsYunField(name = "RuleId")
    private String RuleId;

}