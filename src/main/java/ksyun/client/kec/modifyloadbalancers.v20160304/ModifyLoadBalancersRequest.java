package ksyun.client.kec.modifyloadbalancers.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ModifyLoadBalancersRequest
* @Description 请求参数
*/
@Data
public class ModifyLoadBalancersRequest{
    /**待修改负载均衡的伸缩组ID*/
    @KsYunField(name="ScalingGroupId")
    private String ScalingGroupId;

}
