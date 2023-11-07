package ksyun.client.slb.cloneloadbalancer.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CloneLoadBalancerRequest
* @Description 请求参数
*/
@Data
public class CloneLoadBalancerRequest{
    /**Vpc的ID*/
    @KsYunField(name="VpcId")
    private String VpcId;

    /**负载均衡的名称*/
    @KsYunField(name="LoadBalancerName")
    private String LoadBalancerName;

    /**负载均衡的类型，public 为公网负载均衡，internal 为内网负载均衡*/
    @KsYunField(name="Type")
    private String Type;


}