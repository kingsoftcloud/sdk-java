package ksyun.client.kce2.modifycluster.v20230101;

import common.annotation.KsYunField;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * @Classname ModifyClusterRequest
 * @Description 请求参数
 */
@Data
public class ModifyClusterRequest {
    /**
     * 集群ID
     */
    @KsYunField(name = "ClusterId")
    private String ClusterId;

    /**
     * 集群新名称
     */
    @KsYunField(name = "ClusterName")
    private String ClusterName;

    /**
     * 集群新描述信息
     */
    @KsYunField(name = "ClusterDesc")
    private String ClusterDesc;

    /**
     * 更新SANs(覆盖更新)
     */
    @KsYunField(name = "SANs", type = 2)
    private List<String> SANsList;

    /***/
    @KsYunField(name = "PublicApiServer")

    private PublicApiServerDto PublicApiServerList;

    @Data
    @ToString
    public static class PublicApiServerDto {
        /**
         * EIP ID
         */
        @KsYunField(name = "EipId")
        private String EipId;
    }
}