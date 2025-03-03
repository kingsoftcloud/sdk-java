package ksyun.client.slb.createloadbalanceracl.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname CreateLoadBalancerAclRequest
 * @Description 请求参数
 */
@Data
public class CreateLoadBalancerAclRequest {
    /**
     * LoadBalancerAcl的名称
     */
    @KsYunField(name = "LoadBalancerAclName")
    private String LoadBalancerAclName;

    /**
     * Ip版本(ipv6|ipv4)
     */
    @KsYunField(name = "IpVersion")
    private String IpVersion;


}