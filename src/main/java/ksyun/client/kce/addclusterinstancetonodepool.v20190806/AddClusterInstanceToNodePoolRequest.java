package ksyun.client.kce.addclusterinstancetonodepool.v20190806;

import common.annotation.KsYunField;
import lombok.Data;

import java.util.List;

/**
 * @Classname AddClusterInstanceToNodePoolRequest
 * @Description 请求参数
 */
@Data
public class AddClusterInstanceToNodePoolRequest {
    /**
     * 集群id
     */
    @KsYunField(name = "ClusterId")
    private String ClusterId;

    /**
     * 节点池id
     */
    @KsYunField(name = "NodePoolId")
    private String NodePoolId;

    /**
     * 节点id
     */
    @KsYunField(name = "InstanceIds")
    private List<String> InstanceIdsList;

}