package ksyun.client.slb.deleteloadbalancer.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

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