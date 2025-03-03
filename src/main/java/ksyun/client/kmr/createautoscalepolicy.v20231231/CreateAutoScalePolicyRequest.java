package ksyun.client.kmr.createautoscalepolicy.v20231231;

import common.annotation.KsYunField;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname CreateAutoScalePolicyRequest
 * @Description 请求参数
 */
@Data
public class CreateAutoScalePolicyRequest {
    /**
     * 实例ID，用于唯一标识一个实例
     */
    @KsYunField(name = "InstanceId")
    private String InstanceId;

    /**
     * 策略名称
     */
    @KsYunField(name = "PolicyName")
    private String PolicyName;

    /**
     * 支持 Minutely (按量付费) 和 Daily (按量付费（按日月结）)
     */
    @KsYunField(name = "ChargeType")
    private String ChargeType;

    /**
     * 支持如下参数：
     * <p>
     * - Daily 每天执行
     * - Weekly 每周特定天数
     * - Monthly 每月特定天数
     * - Once 仅执行一次
     */
    @KsYunField(name = "ExecuteCycle")
    private String ExecuteCycle;

    /**
     * 参数根据 ExecuteCycle 的不同而有所不同。请根据实际的执行周期传入对应的规则。
     */
    @KsYunField(name = "ExecuteRules")

    private ExecuteRulesDto ExecuteRulesList;

    @Data
    @ToString
    public static class ExecuteRulesDto {
        /**
         * 节点类型
         * 默认为 Cn，目前仅支持 Cn
         */
        @KsYunField(name = "NodeType")
        private String NodeType;
    }
}