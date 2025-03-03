package ksyun.client.kce2.deletenode.v20230101;

import common.annotation.KsYunField;
import lombok.Data;

import java.util.List;

/**
 * @Classname DeleteNodeRequest
 * @Description 请求参数
 */
@Data
public class DeleteNodeRequest {
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

    /***/
    @KsYunField(name = "NodeIds", type = 2)
    private List<String> NodeIdsList;

    /**
     * 节点名称
     */
    @KsYunField(name = "NodeNames")
    private String NodeNames;

    /**
     * 是否删除主机实例
     */
    @KsYunField(name = "InstanceDelete")
    private Boolean InstanceDelete;

}