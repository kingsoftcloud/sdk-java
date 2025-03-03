package ksyun.client.postgresql.modifysecuritygrouprule.v20181225;

import common.annotation.KsYunField;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * @Classname ModifySecurityGroupRuleRequest
 * @Description 请求参数
 */
@Data
public class ModifySecurityGroupRuleRequest {
    /**
     * 安全组ID
     */
    @KsYunField(name = "SecurityGroupId")
    private String SecurityGroupId;

    /**
     * 安全组规则操作
     * <p>
     * ```json
     * 1.取值范围:Attach|Delete|Cover
     * 2.Attach: 将传入的规则列表（SecurityGroupRuleName，SecurityGroupRuleProtocol）追加到安全组规则列表内。所有绑定了此安全组的实例都会发生变化。
     * 3.Delete：从安全组中删除传入的规则列表（SecurityGroupRuleId）。所有绑定了此安全组的实例都会发生变化。
     * 4.Cover：用传入的规则列表（SecurityGroupRuleName，SecurityGroupRuleProtocol）覆盖安全组规则列表。所有绑定了此安全组的实例都会发生变化。
     * ```
     */
    @KsYunField(name = "SecurityGroupRuleAction")
    private String SecurityGroupRuleAction;

    /***/
    @KsYunField(name = "SecurityGroupRule")
    private List<SecurityGroupRuleDto> SecurityGroupRuleList;

    @Data
    @ToString
    public static class SecurityGroupRuleDto {
        /**
         * 安全组规则ID
         * <p>
         * ```json
         * 若安全组规则列表操作项选择Delete,择必传
         * ```
         */
        @KsYunField(name = "SecurityGroupRuleId")
        private String SecurityGroupRuleId;
        /**
         * 规则名称列表
         * <p>
         * ```json
         * 若安全组规则列表操作项选择Attach或Cover,择必传.  不超过256个字节，仅支持中文、大小写字母、数字、减号和下划线
         * ```
         */
        @KsYunField(name = "SecurityGroupRuleName")
        private String SecurityGroupRuleName;
        /**
         * 规则ip列表
         * <p>
         * ```json
         * 若安全组规则列表操作项选择Attach或Cover,择必传
         * ```
         */
        @KsYunField(name = "SecurityGroupRuleProtocol")
        private String SecurityGroupRuleProtocol;
    }


}