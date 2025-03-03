package ksyun.client.kce.deletenodepool.v20190806;

import common.annotation.KsYunField;
import lombok.Data;

import java.util.List;

/**
 * @Classname DeleteNodePoolRequest
 * @Description 请求参数
 */
@Data
public class DeleteNodePoolRequest {
    /**
     * 集群id
     */
    @KsYunField(name = "ClusterId")
    private String ClusterId;

    /**
     * 节点池id
     */
    @KsYunField(name = "NodePoolId")
    private List<String> NodePoolIdList;

    /**
     * 节点的删除模式，有效值:<br>- **Terminate**：销毁实例<br>- **Remove**：仅把节点移出集群，实例本身不销毁<br>默认值：Terminate
     */
    @KsYunField(name = "InstanceDeleteMode")
    private Boolean InstanceDeleteMode;


}