package ksyun.client.slb.createloadbalanceraclentry.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreateLoadBalancerAclEntryRequest
* @Description 请求参数
*/
@Data
public class CreateLoadBalancerAclEntryRequest{
    /**ACL的ID*/
    @KsYunField(name="LoadBalancerAclId")
    private String LoadBalancerAclId;

    /**LoadBalancerAcl规则的网段*/
    @KsYunField(name="CidrBlock")
    private String CidrBlock;

    /**LoadBalancerAcl规则优先级，1-32766，数字越小优先级越高，不可重复*/
    @KsYunField(name="RuleNumber")
    private Integer RuleNumber;

    /**LoadBalancerAcl规则行为，接受(allow)，拒绝(deny)*/
    @KsYunField(name="RuleAction")
    private String RuleAction;

    /**协议，IP代表所有协议(ip)*/
    @KsYunField(name="Protocol")
    private String Protocol;

    /**描述*/
    @KsYunField(name="Description")
    private String Description;

}