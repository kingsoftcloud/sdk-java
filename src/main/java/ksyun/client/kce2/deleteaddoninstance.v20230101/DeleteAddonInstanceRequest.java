package ksyun.client.kce2.deleteaddoninstance.v20230101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DeleteAddonInstanceRequest
 * @Description 请求参数
 */
@Data
public class DeleteAddonInstanceRequest {
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
     * 插件ID
     */
    @KsYunField(name = "AddonId")
    private String AddonId;

    /**
     * 插件实例ID
     */
    @KsYunField(name = "InstanceId")
    private String InstanceId;

}