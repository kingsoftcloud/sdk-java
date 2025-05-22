package ksyun.client.vpc.createnetworkaclentry.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname CreateNetworkAclEntryRequest
 * @Description 请求参数
 */
@Data
public class CreateNetworkAclEntryRequest {
    /**
     * ACL的ID
     */
    @KsYunField(name = "NetworkAclId")
    private String NetworkAclId;

    /**
     * ACL规则方向，in为入站规则，out为出站规则
     */
    @KsYunField(name="Direction")
    private String Direction;

    /**
     * ACL规则优先级，数字越小优先级越高，不可重复
     */
    @KsYunField(name="RuleNumber")
    private Integer RuleNumber;

    /**协议(udp|tcp|ip|icmp)，IP代表所有协议*/
    @KsYunField(name= "Protocol")
    private String Protocol;

    /**ICMP协议，ICMP类型，只有协议为ICMP类型，才必填*/
    @KsYunField(name="IcmpType")
    private Integer IcmpType;

    /**ICMP协议，ICMP代码，只有协议为ICMP类型，才必填*/
    @KsYunField(name="IcmpCode")
    private Integer IcmpCode;

    /**ACL规则行为，allow为允许，deny为拒绝*/
    @KsYunField(name="RuleAction")
    private String RuleAction;

    /**TCP或UDP协议的端口规则起始端口*/
    @KsYunField(name="PortRangeFrom")
    private Integer PortRangeFrom;

    /**TCP或UDP协议的端口规则结束端口*/
    @KsYunField(name="PortRangeTo")
    private Integer PortRangeTo;

    /**ACL规则的网段*/
    @KsYunField(name="CidrBlock")
    private String CidrBlock;

    /**ACL的描述*/
    @KsYunField(name="Description")
    private String Description;

}