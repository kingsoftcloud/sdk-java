package ksyun.client.kce.modifynodepoolscaledownpolicy.v20190806;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ModifyNodePoolScaleDownPolicyRequest
 * @Description 请求参数
 */
@Data
public class ModifyNodePoolScaleDownPolicyRequest {
    /**
     * 集群id
     */
    @KsYunField(name = "ClusterId")
    private String ClusterId;

    /**
     * 缩容最大并发数，默认值10
     */
    @KsYunField(name = "MaxEmptyBulkDelete")
    private Integer MaxEmptyBulkDelete;

    /**
     * 集群扩容后多少分钟开始考虑缩容条件，默认值10
     */
    @KsYunField(name = "ScaleDownDelayAfterAdd")
    private Integer ScaleDownDelayAfterAdd;

    /**
     * 是否启用自动缩容，有效值：<br>- **True**：开启自动缩容<br>- **False**：关闭自动缩容
     */
    @KsYunField(name = "ScaleDownEnabled")
    private Boolean ScaleDownEnabled;

    /**
     * 节点满足缩容条件多少分钟后开始启动缩容，默认值10
     */
    @KsYunField(name = "ScaleDownUnneededTime")
    private Integer ScaleDownUnneededTime;

    /**
     * 缩容阈值百分比。Node已分配资源/node可分配资源小于多少（百分比）时，开始判断缩容条件，默认值50
     */
    @KsYunField(name = "ScaleDownUtilizationThreshold")
    private Integer ScaleDownUtilizationThreshold;

}