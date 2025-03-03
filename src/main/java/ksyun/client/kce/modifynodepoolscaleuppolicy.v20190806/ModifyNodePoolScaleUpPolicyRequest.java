package ksyun.client.kce.modifynodepoolscaleuppolicy.v20190806;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ModifyNodePoolScaleUpPolicyRequest
 * @Description 请求参数
 */
@Data
public class ModifyNodePoolScaleUpPolicyRequest {
    /**
     * 集群id
     */
    @KsYunField(name = "ClusterId")
    private String ClusterId;

    /**
     * 扩容算法，有效值：<br>- **random**<br>- **most-pods**<br>- **least-waste**<br>注：仅对开启弹性伸缩的节点池生效
     */
    @KsYunField(name = "ScaleUpPolicy")
    private String ScaleUpPolicy;


}