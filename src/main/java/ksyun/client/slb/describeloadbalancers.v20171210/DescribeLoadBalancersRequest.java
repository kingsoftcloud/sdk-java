package ksyun.client.slb.describeloadbalancers.v20171210;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeLoadBalancersRequest
* @Description 请求参数
*/
@Data
public class DescribeLoadBalancersRequest{
    /**负载均衡的ID*/
    @KsYunField(name="LoadBalancerId")
    private List<String> LoadBalancerIdList;

    /**负载均衡的状态，已绑定，未绑定*/
    @KsYunField(name="State")
    private String State;

    /**负载均衡所属项目的ID*/
    @KsYunField(name="ProjectId")
    private List<String> ProjectIdList;

    /**vpc-id，VPC的ID*/
    @KsYunField(name="Filter")
    private List<String> FilterList;


}