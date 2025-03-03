package ksyun.client.kce2.describenodes.v20230101;

import common.annotation.KsYunField;
import lombok.Data;

import java.util.List;

/**
 * @Classname DescribeNodesRequest
 * @Description 请求参数
 */
@Data
public class DescribeNodesRequest {
    /**
     * 集群名称
     */
    @KsYunField(name = "ClusterName")
    private String ClusterName;

    /**
     * 集群ID
     */
    @KsYunField(name = "ClusterId")
    private String ClusterId;

    /**
     * 节点名称
     */
    @KsYunField(name = "NodeNames", type = 2)
    private List<String> NodeNamesList;

    /**
     * 节点ID
     */
    @KsYunField(name = "NodeIds", type = 2)
    private List<String> NodeIdsList;

    /**
     * 游标起始位置
     */
    @KsYunField(name = "Marker")
    private Integer Marker;

    /**
     * 分页参数，每页最大数
     */
    @KsYunField(name = "MaxResults")
    private Integer MaxResults;

    /**
     * 模糊查询条件
     */
    @KsYunField(name = "Search")
    private String Search;

}