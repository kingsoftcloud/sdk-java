package ksyun.client.slb.modifyloadbalanceracl.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ModifyLoadBalancerAclRequest
 * @Description 请求参数
 */
@Data
public class ModifyLoadBalancerAclRequest {
    /**
     * LoadBalancerAcl的ID
     */
    @KsYunField(name = "LoadBalancerAclId")
    private String LoadBalancerAclId;

    /**
     * LoadBalancerAcl的名称
     */
    @KsYunField(name = "LoadBalancerAclName")
    private String LoadBalancerAclName;


}