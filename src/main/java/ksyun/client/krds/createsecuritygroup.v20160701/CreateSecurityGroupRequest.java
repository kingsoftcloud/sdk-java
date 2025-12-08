package ksyun.client.krds.createsecuritygroup.v20160701;

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
public class CreateSecurityGroupRequest{
    /**安全组名称*/
    @KsYunField(name="SecurityGroupName")
    private String SecurityGroupName;

    /**安全组规则，支持以英文逗号隔开的传值形式，或者List<String>传值形式*/
    @KsYunField(name="SecurityGroupRule",type=2)
    private List<SecurityGroupRuleDto1> SecurityGroupRuleList;

    @Data
    @ToString
    public static class SecurityGroupRuleDto1 {
        /**cidr规则*/
        @KsYunField(name="SecurityGroupRuleProtocol")
        private String SecurityGroupRuleProtocol;

        /**规则名称*/
        @KsYunField(name="SecurityGroupRuleName")
        private String SecurityGroupRuleName;

    }

    /**实例id*/
    @KsYunField(name="DBInstanceIdentifier")
    private String DBInstanceIdentifier;

    /**安全组描述*/
    @KsYunField(name="SecurityGroupDescription")
    private String SecurityGroupDescription;

}
