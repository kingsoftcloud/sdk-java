package ksyun.client.slb.deleteloadbalancer.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DeleteLoadBalancerRequest
 * @Description 请求参数
 */
@Data
public class DeleteLoadBalancerRequest {
    /**
     * 负载均衡的ID
     */
    @KsYunField(name = "LoadBalancerId")
    private String LoadBalancerId;

}