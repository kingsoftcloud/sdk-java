package ksyun.client.slb.setloadbalancerstatus.v20250430;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname SetLoadBalancerStatusRequest
* @Description 请求参数
*/
@Data
public class SetLoadBalancerStatusRequest{
    /**负载均衡的ID*/
    @KsYunField(name="LoadBalancerId")
    private String LoadBalancerId;

    /**负载均衡的开启状态(start|stop)*/
    @KsYunField(name="State")
    private String State;

}
