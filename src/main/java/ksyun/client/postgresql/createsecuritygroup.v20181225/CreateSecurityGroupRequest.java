package ksyun.client.postgresql.createsecuritygroup.v20181225;

import common.annotation.KsYunField;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * @Classname CreateSecurityGroupRequest
 * @Description 请求参数
 */
@Data
public class CreateSecurityGroupRequest {
    /**
     * 安全组名称
     * ```json
     * 不超过256字符，中文，字母，数字，中划线，下划线
     * ```
     */
    @KsYunField(name = "SecurityGroupName")
    private String SecurityGroupName;

    /**
     * 安全组描述
     * ```json
     * 不超过256字符，中文，字母，数字，中划线，下划线
     * ```
     */
    @KsYunField(name = "SecurityGroupDescription")
    private String SecurityGroupDescription;

    /**
     * 安全组绑定的实例列表
     * <p>
     * ```json
     * UUID格式，可填写未绑定过安全组的实例ID
     * ```
     */
    @KsYunField(name = "DBInstanceIdentifier")
    private List<String> DBInstanceIdentifierList;

    /**
     * 安全组规则
     */
    @KsYunField(name = "SecurityGroupRule")
    private List<SecurityGroupRuleDto> SecurityGroupRuleList;

    @Data
    @ToString
    public static class SecurityGroupRuleDto {
        /**
         * 安全组规则名称
         * <p>
         * ```json
         * 不超过256个字节，仅支持中文、大小写字母、数字、减号和下划线,必须与安全组规则ip列表一同填写才生效
         * ```
         */
        @KsYunField(name = "SecurityGroupRuleName")
        private String SecurityGroupRuleName;
        /**
         * 安全组规则ip列表
         * <p>
         * ```json
         * 0.0.0.0/32格式,必须与安全组规则对应的名称一同填写才生效
         * ```
         */
        @KsYunField(name = "SecurityGroupRuleProtocol")
        private String SecurityGroupRuleProtocol;
    }

}