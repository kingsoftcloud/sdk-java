package ksyun.client.kce.describecluster.v20190806;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeClusterRequest
* @Description 请求参数
*/
@Data
public class DescribeClusterRequest{
    /**集群id，如不输入，则默认查询该地域下的所有集群。*/
    @KsYunField(name="ClusterId")
    private String ClusterId;

    /**分页标识，单次调用未返回全部实例时，标记下次调用的返回值的起点，默认值是0。*/
    @KsYunField(name="Marker")
    private Integer Marker;

    /**单次调用所返回的最大实例数目，默认10， 范围(0-20]。*/
    @KsYunField(name="MaxResults")
    private String MaxResults;

    /**模糊匹配，可匹配如下字段：<br>集群名称(ClusterName)。*/
    @KsYunField(name="Search")
    private String Search;

    /***/
    @KsYunField(name="Filter")
    private List<FilterDto> FilterList;

    @Data
    @ToString
    public static class FilterDto {
        /**一个或者多个过滤器，有效值：
集群master管理类型：cluster-manage-mode
cluster-manage-mode枚举值：

- ManagedCluster 托管集群
- DedicatedCluster 独立部署集群
- ExternalCluster 纳管集群
- ServerlessCluster Serverless集群
*/
        @KsYunField(name="Name")
        private String Name;
        /***/
        @KsYunField(name="Value")
        private List<String> ValueList;
    }


}