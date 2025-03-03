package ksyun.client.slb.associateloadbalanceracl.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname AssociateLoadBalancerAclRequest
 * @Description 请求参数
 */
@Data
public class AssociateLoadBalancerAclRequest {
    /**
     * LoadBalancerAcl的ID
     */
    @KsYunField(name = "LoadBalancerAclId")
    private String LoadBalancerAclId;

    /**
     * 监听器的ID
     */
    @KsYunField(name = "ListenerId")
    private String ListenerId;

}