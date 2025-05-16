package ksyun.client.slb.modifyloadbalanceraclentry.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname ModifyLoadBalancerAclEntryRequest
 * @Description 请求参数
 */
@Data
public class ModifyLoadBalancerAclEntryRequest {
    /**
     * ACL规则ID
     */
    @KsYunField(name = "LoadBalancerAclEntryId")
    private String LoadBalancerAclEntryId;

    /**
     * LoadBalancerAcl规则优先级，1-32766，数字越小优先级越高
     */
    @KsYunField(name = "RuleNumber")
    private Integer RuleNumber;

    /**
     * LoadBalancerAcl规则行为，接受(allow)，拒绝(deny)
     */
    @KsYunField(name = "RuleAction")
    private String RuleAction;

    /**
     * 描述
     */
    @KsYunField(name = "Description")
    private String Description;

}