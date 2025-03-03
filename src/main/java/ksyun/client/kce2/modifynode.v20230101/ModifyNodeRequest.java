package ksyun.client.kce2.modifynode.v20230101;

import common.annotation.KsYunField;
import lombok.Data;

import java.util.List;

/**
 * @Classname ModifyNodeRequest
 * @Description 请求参数
 */
@Data
public class ModifyNodeRequest {
    /**
     * 集群ID
     */
    @KsYunField(name = "ClusteId")
    private String ClusteId;

    /**
     * 集群名称
     */
    @KsYunField(name = "ClusterName")
    private String ClusterName;

    /**
     * 节点ID
     */
    @KsYunField(name = "NodeId")
    private String NodeId;

    /**
     * 节点名称
     */
    @KsYunField(name = "NodeName")
    private String NodeName;

    /**
     * 组件列表
     */
    @KsYunField(name = "Components", type = 2)
    private List<String> ComponentsList;

}