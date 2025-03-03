package ksyun.client.slb.deleteloadbalanceracl.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DeleteLoadBalancerAclRequest
 * @Description 请求参数
 */
@Data
public class DeleteLoadBalancerAclRequest {
    /**
     * LoadBalancerAcl的ID
     */
    @KsYunField(name = "LoadBalancerAclId")
    private String LoadBalancerAclId;


}