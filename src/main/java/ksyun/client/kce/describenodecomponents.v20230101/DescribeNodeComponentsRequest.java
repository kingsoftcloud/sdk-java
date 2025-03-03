package ksyun.client.kce.describenodecomponents.v20230101;

import common.annotation.KsYunField;
import lombok.Data;

import java.util.List;

/**
 * @Classname DescribeNodeComponentsRequest
 * @Description 请求参数
 */
@Data
public class DescribeNodeComponentsRequest {
    /**
     * 集群ID
     */
    @KsYunField(name = "ClusterId")
    private String ClusterId;

    /**
     * 集群名称
     */
    @KsYunField(name = "ClusterName")
    private String ClusterName;

    /**
     * 节点名称
     */
    @KsYunField(name = "NodeNames", type = 2)
    private List<String> NodeNamesList;

    /**
     * 节点ID
     */
    @KsYunField(name = "NodeIds")
    private String NodeIds;

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

}