package ksyun.client.slb.setloadbalancername.v20250430;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname SetLoadBalancerNameRequest
* @Description 请求参数
*/
@Data
public class SetLoadBalancerNameRequest{
    /**负载均衡的ID*/
    @KsYunField(name="LoadBalancerId")
    private String LoadBalancerId;

    /**负载均衡的名称*/
    @KsYunField(name="LoadBalancerName")
    private String LoadBalancerName;

}
