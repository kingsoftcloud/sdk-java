package ksyun.client.kce.describeclusterinstance.v20190806;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeClusterInstanceRequest
* @Description 请求参数
*/
@Data
public class DescribeClusterInstanceRequest{
    /**集群id*/
    @KsYunField(name="ClusterId")
    private String ClusterId;

    /**单次调用所返回的最大实例数目，默认10,最大50。*/
    @KsYunField(name="MaxResults")
    private Integer MaxResults;

    /**分页标识，单次调用未返回全部实例时，标记下次调用的返回值的起点，默认值是0。*/
    @KsYunField(name="Marker")
    private Integer Marker;

    /***/
    @KsYunField(name="Filter")
    private List<FilterDto> FilterList;

    @Data
    @ToString
    public static class FilterDto {
        /**一个或者多个过滤器，有效值：
节点角色：instance-role
节点id：instance-id
节点类型：type
节点状态：instance-status*/
        @KsYunField(name="Name")
        private String Name;
        /***/
        @KsYunField(name="Value")
        private List<String> ValueList;
    }

    /**模糊匹配，可以匹配如下字段：<br>主网卡私有IP（PrivateIpAddress）。*/
    @KsYunField(name="Search")
    private String Search;


}