package ksyun.client.kce.describeexistedinstances.v20190806;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeExistedInstancesRequest
* @Description 请求参数
*/
@Data
public class DescribeExistedInstancesRequest{
    /**集群id*/
    @KsYunField(name="ClusterId")
    private String ClusterId;

    /**云服务器id*/
    @KsYunField(name = "InstanceId", type = 1)
    private List<String> InstanceIdList;

    /**分页标识，单次调用未返回全部实例时，标记下次调用的返回值的起点，默认值是0。*/
    @KsYunField(name="Marker")
    private Integer Marker;

    /**单次调用所返回的最大实例数目，默认10， 范围(0-50]。*/
    @KsYunField(name="MaxResults")
    private String MaxResults;

    /***/
    @KsYunField(name = "Filter", type = 1)
    private List<FilterDto> FilterList;

    @Data
    @ToString
    public static class FilterDto {
        /**一个或者多个过滤器，有效值：
vpc id：vpc-id
子网id：subnet-id
可用区：availability-zone.name
实例状态：instance-state.name*/
        @KsYunField(name="Name")
        private String Name;

        /***/
        @KsYunField(name = "Value", type = 1)
        private List<String> ValueList;

    }

    /**模糊匹配，可匹配如下字段：<br>服务器名称(InstanceName)、主网卡私有IP（PrivateIpAddress）。*/
    @KsYunField(name="Search")
    private String Search;

}
