package ksyun.client.kce.describecluster.v20231115;

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
    /***/
    @KsYunField(name="ClusterId")
    private String ClusterId;

    /**分页标识，单次调用未返回全部实例时，标记下次调用的返回值的起点，默认值为0*/
    @KsYunField(name="Marker")
    private Integer Marker;

    /**值范围0-20*/
    @KsYunField(name="MaxResults")
    private Integer MaxResults;

    /**集群名称模糊匹配*/
    @KsYunField(name="Search")
    private String Search;

    /***/
    @KsYunField(name="Filter",type=1)
    private List<FilterDto> FilterList;

    @Data
    @ToString
    public static class FilterDto {
        /**当前只支持 cluster-manage-mode*/
        @KsYunField(name="Name")
        private String Name;

        /**
- ExternalCluster 纳管集群
- ManagedCluster 托管集群
- DedicatedCluster 独立部署集群
- ServerlessCluster serverless集群*/
        @KsYunField(name="Value",type=2)
        private List<String> ValueList;

    }

}
