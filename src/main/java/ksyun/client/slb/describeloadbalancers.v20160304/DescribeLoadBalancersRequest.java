package ksyun.client.slb.describeloadbalancers.v20160304;

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
    /**项目的ID*/
    @KsYunField(name="ProjectId")
    private List<String> ProjectIdList;

    /**多个负载均衡的ID*/
    @KsYunField(name="LoadBalancerId")
    private List<String> LoadBalancerIdList;

    /**筛选Filter*/
    @KsYunField(name="Filter")
    private List<FilterDto> FilterList;

    @Data
    @ToString
    public static class FilterDto {
        /**有效值： 
- vpc-id，Vpc的ID
- load-balancer-name，负载均衡名称
- load-balancer-type，负载均衡类型
- public-ip，IP地址
- load-balancer-ipversion，IP版本
- not-vpc-id，不属于的Vpc的ID*/
        @KsYunField(name="Name")
        private String Name;
        /***/
        @KsYunField(name="Value")
        private List<String> ValueList;
    }

    /**单次调用可返回的最大条目数量*/
    @KsYunField(name="MaxResults")
    private Integer MaxResults;

    /**获取另一页返回结果的 token.*/
    @KsYunField(name="NextToken")
    private String NextToken;

    /**负载均衡的状态，已绑定(associate)，未绑定(disassociate)*/
    @KsYunField(name="State")
    private String State;


}