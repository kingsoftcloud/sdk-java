package ksyun.client.aicp.describeresourcepools.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeResourcePoolsRequest
* @Description 请求参数
*/
@Data
public class DescribeResourcePoolsRequest{
    /**排序方式：默认倒序
- DESC 倒序
- ASC 正序*/
    @KsYunField(name="Sort")
    private String Sort;

    /**页码*/
    @KsYunField(name="Page")
    private Integer Page;

    /**单次调用所返回的最大实例数目，默认1000， 范围[5-1000]。*/
    @KsYunField(name="PageSize")
    private Integer PageSize;

    /**资源池名称，可模糊匹配*/
    @KsYunField(name="ResourcePoolName")
    private String ResourcePoolName;

    /**组件名称:
- spark
- ray*/
    @KsYunField(name="Component")
    private String Component;

    /**资源组ID*/
    @KsYunField(name="ResourcePoolId",type=1)
    private List<String> ResourcePoolIdList;

    /**一个或者多个过滤器*/
    @KsYunField(name="Filter",type=1)
    private List<FilterDto> FilterList;

    @Data
    @ToString
    public static class FilterDto {
        /**过滤关键字：
- resource-pool-status 资源组状态
- resource-pool-type 资源组类型
- cluster-id KCE集群ID*/
        @KsYunField(name="Name")
        private String Name;

        /**过滤值*/
        @KsYunField(name="Value",type=1)
        private List<String> ValueList;

    }

}
