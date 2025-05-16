package ksyun.client.krds.createsecuritygroup.v20200825;

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
     * 安全组名称	不超过256个字节，仅支持中文、大小写字母、数字、减号和下划线
     */
    @KsYunField(name = "SecurityGroupName")
    private String SecurityGroupName;

    /**
     * 安全组描述	不超过256个字节，仅支持中文、大小写字母、数字、减号和下划线
     */
    @KsYunField(name = "SecurityGroupDescription")
    private String SecurityGroupDescription;

    /**
     * 安全组类型	取值范围：IPV4 / IPV6（默认：IPV4）
     */
    @KsYunField(name = "SecurityGroupType")
    private String SecurityGroupType;

    /**
     * 安全组绑定实例列表	UUID格式，可填写未绑定过安全组的实例ID。查看数据库实例
     */
    @KsYunField(name = "DBInstanceIdentifier")
    private List<String> DBInstanceIdentifierList;

    /**
     * 安全组规则描述	不超过256个字节，仅支持中文、大小写字母、数字、减号和下划线
     */
    @KsYunField(name = "SecurityGroupRule.SecurityGroupRuleName.N")
    private String SecurityGroupRuleSecurityGroupRuleNameN;

    /***/
    @KsYunField(name = "SecurityGroupRule.SecurityGroupRuleCidr.N")
    private String SecurityGroupRuleSecurityGroupRuleCidrN;

}