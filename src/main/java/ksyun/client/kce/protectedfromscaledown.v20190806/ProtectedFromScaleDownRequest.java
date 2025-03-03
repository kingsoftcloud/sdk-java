package ksyun.client.kce.protectedfromscaledown.v20190806;

import common.annotation.KsYunField;
import lombok.Data;

import java.util.List;

/**
 * @Classname ProtectedFromScaleDownRequest
 * @Description 请求参数
 */
@Data
public class ProtectedFromScaleDownRequest {
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

    /**
     * 节点是否开启缩容保护，有效值：<br>- **True**：开启缩容保护<br>- **False**：关闭缩容保护<br>
     */
    @KsYunField(name = "ProtectedFromScaleDown")
    private Boolean ProtectedFromScaleDown;

}