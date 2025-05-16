package ksyun.client.kce2.modifynode.v20230101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname ModifyNodeRequest
 * @Description 请求参数
 */
@Data
public class ModifyNodeRequest {
    /**
     * 集群ID
     */
    @KsYunField(name = "ClusteId")
    private String ClusteId;

    /**
     * 节点id，同实例 id必须二选一
     */
    @KsYunField(name = "KceNodeId")
    private String KceNodeId;

    /**
     * 实例id ，同节点 id必须二选一
     */
    @KsYunField(name = "InstanceId")
    private String InstanceId;

    /**
     * 组件列表
     */
    @KsYunField(name = "Components", type = 2)
    private List<ComponentsDto> ComponentsList;

    @Data
    @ToString
    public static class ComponentsDto {
        /**
         * 节点需要修改的组件
         * • APISERVER
         * • SCHEDULER
         * • CONTROLLERMANAGER
         */
        private String Type;
    }

}