package ksyun.client.vpc.authorizesecuritygroupentry.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname AuthorizeSecurityGroupEntryRequest
 * @Description 请求参数
 */
@Data
public class AuthorizeSecurityGroupEntryRequest {
    /**
     * 安全组规则的描述
     */
    @KsYunField(name = "Description")
    private String Description;

    /**
     * 安全组的ID
     */
    @KsYunField(name = "SecurityGroupId")
    private String SecurityGroupId;

    /**
     * 安全组规则的网段
     */
    @KsYunField(name = "CidrBlock")
    private String CidrBlock;

    /**
     * 安全组规则方向，in为入站规则，out为出站规则
     */
    @KsYunField(name = "Direction")
    private String Direction;

    /**
     * 协议，IP代表所有协议
     */
    @KsYunField(name = "Protocol")
    private String Protocol;

    /**
     * ICMP协议，ICMP类型，只有协议为ICMP类型，才必填
     */
    @KsYunField(name = "IcmpType")
    private Integer IcmpType;

    /**
     * ICMP协议，ICMP代码，只有协议为ICMP类型，才必填
     */
    @KsYunField(name = "IcmpCode")
    private Integer IcmpCode;

    /**
     * TCP或UDP协议的端口规则起始端口
     */
    @KsYunField(name = "PortRangeFrom")
    private Integer PortRangeFrom;

    /**
     * TCP或UDP协议的端口规则结束端口
     */
    @KsYunField(name="PortRangeTo")
    private Integer PortRangeTo;

    /**安全组规则标签*/
    @KsYunField(name = "RuleTag")
    private String RuleTag;

    /**优先级*/
    @KsYunField(name="Priority")
    private Integer Priority;

    /**访问权限*/
    @KsYunField(name="Policy")
    private String Policy;

}