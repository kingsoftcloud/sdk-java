package ksyun.client.slb.associateloadbalanceracl.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname AssociateLoadBalancerAclRequest
* @Description 请求参数
*/
@Data
public class AssociateLoadBalancerAclRequest{
    /**LoadBalancerAcl的ID*/
    @KsYunField(name="LoadBalancerAclId")
    private String LoadBalancerAclId;

    /**监听器的ID*/
    @KsYunField(name="ListenerId")
    private String ListenerId;

}
