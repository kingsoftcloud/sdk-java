package ksyun.client.kce2.addnodes.v20230101;

import common.annotation.KsYunField;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * @Classname AddNodesRequest
 * @Description 请求参数
 */
@Data
public class AddNodesRequest {
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
     * 节点信息
     */
    @KsYunField(name = "NodeInstanceSet", type = 2)
    private List<NodeInstanceSetDto> NodeInstanceSetList;

    @Data
    @ToString
    public static class NodeInstanceSetDto {
        /**节点基础配置*/
        /**节点高级配置*/
        /**
         * 组件信息
         */
        @KsYunField(name = "Components", type = 2)
        private List<Object> ComponentsList;
    }

}