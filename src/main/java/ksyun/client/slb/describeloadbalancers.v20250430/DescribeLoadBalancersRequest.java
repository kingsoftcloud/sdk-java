package ksyun.client.slb.describeloadbalancers.v20250430;

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
    /**多个负载均衡的ID*/
    @KsYunField(name="LoadBalancerId",type=2)
    private List<String> LoadBalancerIdList;

    /**筛选Filter*/
    @KsYunField(name="Filter",type=2)
    private List<FilterDto> FilterList;

    @Data
    @ToString
    public static class FilterDto {
        /**有效值：
- vpc-id，Vpc的ID
- state，负载均衡的状态*/
        @KsYunField(name="Name")
        private String Name;

        /***/
        @KsYunField(name="Value",type=2)
        private List<String> ValueList;

    }

    /**是否在返回值中包含资源标签信息*/
    @KsYunField(name="IsContainTag")
    private Boolean IsContainTag;

    /**多个标签的键*/
    @KsYunField(name="TagKey",type=2)
    private List<String> TagKeyList;

    /**多个标签的键*/
    @KsYunField(name="TagKV",type=2)
    private List<TagKVDto> TagKVList;

    @Data
    @ToString
    public static class TagKVDto {
        /**标签键*/
        @KsYunField(name="Name")
        private String Name;

        /**标签值*/
        @KsYunField(name="Value")
        private String Value;

    }

    /**项目的ID*/
    @KsYunField(name="ProjectId",type=2)
    private List<String> ProjectIdList;

    /**单次调用可返回的最大条目数量*/
    @KsYunField(name="MaxResults")
    private Integer MaxResults;

    /**获取另一页返回结果的 token.*/
    @KsYunField(name="NextToken")
    private String NextToken;

}
