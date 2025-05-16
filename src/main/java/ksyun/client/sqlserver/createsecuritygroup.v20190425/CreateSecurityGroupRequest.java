package ksyun.client.sqlserver.createsecuritygroup.v20190425;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname CreateSecurityGroupRequest
 * @Description 请求参数
 */
@Data
public class CreateSecurityGroupRequest {
    /**
     * SecurityGroupName
     */
    @KsYunField(name = "SecurityGroupName")
    private String SecurityGroupName;

    /**
     * 安全组描述
     */
    @KsYunField(name = "SecurityGroupDescription")
    private String SecurityGroupDescription;

    /**
     * 安全组绑定实例列表
     * <p>
     * ```json
     * 以英文逗号隔开。注意：需指定为绑定安全组的实例id
     * ```
     */
    @KsYunField(name = "DBInstanceIdentifier")
    private String DBInstanceIdentifier;

    /***/
    @KsYunField(name = "SecurityGroupRule")
    private List<SecurityGroupRuleDto> SecurityGroupRuleList;

    @Data
    @ToString
    public static class SecurityGroupRuleDto {
        /**
         * 安全组规则CIDR
         * <p>
         * <p>
         * ```json
         * 0.0.0.0/32格式
         * ```
         */
        @KsYunField(name = "SecurityGroupRuleProtocol")
        private String SecurityGroupRuleProtocol;
        /**
         * SecurityGroupRuleName
         * <p>
         * ```json
         * 不超过256个字节，仅支持中文、大小写字母、数字、减号和下划线
         * ```
         */
        @KsYunField(name = "SecurityGroupRuleName")
        private String SecurityGroupRuleName;
    }

}