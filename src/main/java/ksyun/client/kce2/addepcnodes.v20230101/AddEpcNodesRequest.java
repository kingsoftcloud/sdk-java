package ksyun.client.kce2.addepcnodes.v20230101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname AddEpcNodesRequest
 * @Description 请求参数
 */
@Data
public class AddEpcNodesRequest {
    /**
     * 集群id
     */
    @KsYunField(name = "ClusterId")
    private String ClusterId;

    /**
     * 节点信息
     */
    @KsYunField(name = "NodeInstanceSet", type = 2)
    private List<NodeInstanceSetDto> NodeInstanceSetList;

    @Data
    @ToString
    public static class NodeInstanceSetDto {
        /**
         * 实例类型
         * • EPC   裸金属服务器
         */
        private String Provider;
        /**
         * 组件配置
         */
        @KsYunField(name = "Components", type = 2)
        private List<Object> ComponentsList;
        /**节点通用配置*/
        /**k8s节点配置*/
    }

}