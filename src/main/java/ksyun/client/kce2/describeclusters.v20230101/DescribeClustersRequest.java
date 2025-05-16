package ksyun.client.kce2.describeclusters.v20230101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname DescribeClustersRequest
 * @Description 请求参数
 */
@Data
public class DescribeClustersRequest {
    /**
     * 集群ID
     */
    @KsYunField(name = "ClusterIds", type = 2)
    private List<String> ClusterIdsList;

    /**
     * 值范围0-50
     * 默认值：10
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