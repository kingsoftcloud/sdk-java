package ksyun.client.kce2.deletecluster.v20230101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DeleteClusterRequest
 * @Description 请求参数
 */
@Data
public class DeleteClusterRequest {
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
     * 是否删除主机
     */
    @KsYunField(name = "InstanceDelete")
    private Boolean InstanceDelete;

}