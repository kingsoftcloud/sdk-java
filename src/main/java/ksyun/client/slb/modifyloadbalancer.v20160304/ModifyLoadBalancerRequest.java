package ksyun.client.slb.modifyloadbalancer.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ModifyLoadBalancerRequest
* @Description 请求参数
*/
@Data
public class ModifyLoadBalancerRequest{
    /**负载均衡的ID*/
    @KsYunField(name="LoadBalancerId")
    private String LoadBalancerId;

    /**负载均衡的名称*/
    @KsYunField(name="LoadBalancerName")
    private String LoadBalancerName;

    /**负载均衡的开启状态(start|stop)*/
    @KsYunField(name="LoadBalancerState")
    private String LoadBalancerState;

}