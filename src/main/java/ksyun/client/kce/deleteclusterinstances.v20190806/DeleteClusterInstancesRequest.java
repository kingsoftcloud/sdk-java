package ksyun.client.kce.deleteclusterinstances.v20190806;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DeleteClusterInstancesRequest
* @Description 请求参数
*/
@Data
public class DeleteClusterInstancesRequest{
    /**集群id*/
    @KsYunField(name="ClusterId")
    private String ClusterId;

    /**需要移除的节点id列表，只允许移除Worker节点（N的范围为1-50）。*/
    @KsYunField(name="InstanceId",type=2)
    private List<String> InstanceIdList;

    /**节点的删除模式，有效值:
- **Terminate**（默认值）销毁实例（仅针对于按量付费的云服务器，对于包年包月的云服务器和裸金属服务器不生效）
- **Remove** 仅把节点移除集群，实例本身不销毁。*/
    @KsYunField(name="InstanceDeleteMode")
    private String InstanceDeleteMode;

}
