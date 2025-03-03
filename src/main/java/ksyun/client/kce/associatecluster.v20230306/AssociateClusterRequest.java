package ksyun.client.kce.associatecluster.v20230306;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname AssociateClusterRequest
 * @Description 请求参数
 */
@Data
public class AssociateClusterRequest {
    /**
     * 实例id
     */
    @KsYunField(name = "InstanceId")
    private String InstanceId;

    /**
     * 集群id
     */
    @KsYunField(name = "ClusterId")
    private String ClusterId;

}