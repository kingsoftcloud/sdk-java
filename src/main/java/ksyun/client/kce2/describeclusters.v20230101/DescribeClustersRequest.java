package ksyun.client.kce2.describeclusters.v20230101;

import common.annotation.KsYunField;
import lombok.Data;

import java.util.List;

/**
 * @Classname DescribeClustersRequest
 * @Description 请求参数
 */
@Data
public class DescribeClustersRequest {
    /**
     * 集群名称
     */
    @KsYunField(name = "ClusterNames", type = 2)
    private List<String> ClusterNamesList;

    /**
     * 集群ID
     */
    @KsYunField(name = "ClusterIds", type = 2)
    private List<String> ClusterIdsList;

    /**
     * 分页参数，每页最大数
     */
    @KsYunField(name = "MaxResults")
    private Integer MaxResults;

    /**
     * 分页参数
     * 游标起始位置，每次查询返回
     */
    @KsYunField(name = "Marker")
    private Integer Marker;

}