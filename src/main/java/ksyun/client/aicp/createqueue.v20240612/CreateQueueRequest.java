package ksyun.client.aicp.createqueue.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreateQueueRequest
* @Description 请求参数
*/
@Data
public class CreateQueueRequest{
    /**资源池ID*/
    @KsYunField(name="ResourcePoolId")
    private String ResourcePoolId;

    /**允许小写字母、数字、"."、"-",以字母、数字开头和结尾 且"-"和"."不可相邻, 长度 1-64*/
    @KsYunField(name="QueueName")
    private String QueueName;

    /**队列类型：
- normal，普通队列
- physical，物理队列
普通队列必填 Capability；物理队列必填 NodeSelectType 和 NodeSpec*/
    @KsYunField(name="QueueType")
    private String QueueType;

    /**节点选择类型：
- random，随机分配
- specify，指定节点分配
仅当队列为物理队列类型时有效*/
    @KsYunField(name="NodeSelectType")
    private String NodeSelectType;

    /**资源配额，GPU、CPU、内存等。普通队列必填，物理队列非必填*/
    @KsYunField(name="Capability")
    private CapabilityDto Capability;

    @Data
    @ToString
    public static class CapabilityDto {
        /**CPU配额*/
        @KsYunField(name="CPUNum")
        private Integer CPUNum;

        /**内存配额（Gi）*/
        @KsYunField(name="MemoryNum")
        private Integer MemoryNum;

        /**GPU配额列表*/
        @KsYunField(name="GPUInfos",type=2)
        private List<CapabilityGPUInfosDto> GPUInfosList;

        @Data
        @ToString
        public static class CapabilityGPUInfosDto {
            /**GPU类型*/
            @KsYunField(name="GPUType")
            private String GPUType;

            /**GPU数量*/
            @KsYunField(name="GPUNum")
            private Integer GPUNum;

        }

    }

    /**物理队列节点规格信息，仅当 QueueType 为 physical 时有效。同一队列内同一 HostType 只能配置一项*/
    @KsYunField(name="NodeSpec",type=2)
    private List<NodeSpecDto> NodeSpecList;

    @Data
    @ToString
    public static class NodeSpecDto {
        /**GPU类型（可选）*/
        @KsYunField(name="GPUType")
        private String GPUType;

        /**裸金属服务器子机型
> 通过 DescribeResourcePoolInstanceSpecs 接口获取资源组内各个机型可用节点数*/
        @KsYunField(name="HostType")
        private String HostType;

        /**节点数量，当 NodeSelectType 为 random 时必填*/
        @KsYunField(name="NodeNum")
        private Integer NodeNum;

        /**指定节点ID列表，当 NodeSelectType 为 specify 时必填*/
        @KsYunField(name="SpecifyNodes",type=2)
        private List<String> SpecifyNodesList;

    }

    /**是否允许向其他队列借资源*/
    @KsYunField(name="AllowBorrowing")
    private Boolean AllowBorrowing;

    /**队列描述, 长度最大200*/
    @KsYunField(name="Description")
    private String Description;

    /**访问控制列表（子账号权限信息）。同一角色（writer管理员/reader成员）只能来自 AccessList 或 SharedGroupList 其中之一，不能同时来自两者*/
    @KsYunField(name="AccessList",type=2)
    private List<AccessListDto> AccessListList;

    @Data
    @ToString
    public static class AccessListDto {
        /**子账号ID*/
        @KsYunField(name="UserId")
        private String UserId;

        /**权限类型，有效值：
- writer，管理员
- reader，队列成员*/
        @KsYunField(name="Permission")
        private String Permission;

    }

    /**权限组共享列表。同一角色（writer管理员/reader成员）只能来自 AccessList 或 SharedGroupList 其中之一，不能同时来自两者*/
    @KsYunField(name="SharedGroupList",type=2)
    private List<SharedGroupListDto> SharedGroupListList;

    @Data
    @ToString
    public static class SharedGroupListDto {
        /**权限组ID*/
        @KsYunField(name="AccessGroupId")
        private String AccessGroupId;

        /**权限组共享角色，枚举值：
- writer，管理员
- reader，队列成员*/
        @KsYunField(name="Permission")
        private String Permission;

    }

    /**支持负载类型，默认不传表示不限制使用类型 
- Notebook（开发任务）
- TrainJob（训练任务）
- Inference（推理任务）
- DataJob（数据处理任务）*/
    @KsYunField(name="WorkloadType",type=2)
    private List<String> WorkloadTypeList;

}
