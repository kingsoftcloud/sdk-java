package ksyun.client.aicp.modifyqueue.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ModifyQueueRequest
* @Description 请求参数
*/
@Data
public class ModifyQueueRequest{
    /**队列ID*/
    @KsYunField(name="QueueId")
    private String QueueId;

    /**资源配额，不传该字段表示不修改，若传入，则CPU、Memory、GPUInfos会全量覆盖*/
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

    /**是否允许向其他队列借资源，不传该字段表示不修改*/
    @KsYunField(name="AllowBorrowing")
    private Boolean AllowBorrowing;

    /**队列描述，不传该字段表示不修改*/
    @KsYunField(name="Description")
    private String Description;

    /**访问控制列表，若传入会进行全量覆盖式修改。传入空数组代表清理全部已授权子用户。同一角色（writer管理员/reader成员）只能来自 AccessList 或 SharedGroupList 其中之一，不能同时来自两者*/
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

    /**权限组共享列表（若传入，会进行全量覆盖式修改）。同一角色（writer管理员/reader成员）只能来自 AccessList 或 SharedGroupList 其中之一，不能同时来自两者*/
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

    /**支持负载类型，不传该字段表示不修改，传空数组表示修改为不限制 
- Notebook（开发任务）
- TrainJob（训练任务）
- Inference（推理任务）
- DataJob（数据处理任务）*/
    @KsYunField(name="WorkloadType",type=2)
    private List<String> WorkloadTypeList;

    /**物理队列节点规格信息，不传该字段表示不修改。仅物理队列有效，同一队列内同一 HostType 只能配置一项*/
    @KsYunField(name="NodeSpec",type=2)
    private List<NodeSpecDto> NodeSpecList;

    @Data
    @ToString
    public static class NodeSpecDto {
        /**GPU类型（可选）*/
        @KsYunField(name="GPUType")
        private String GPUType;

        /**裸金属服务器子机型
> 可以通过 DescribeResourcePoolInstanceSpecs 接口获取资源组内各个机型可用节点数*/
        @KsYunField(name="HostType")
        private String HostType;

        /**节点数量，当 NodeSelectType 为 random 时必填*/
        @KsYunField(name="NodeNum")
        private Integer NodeNum;

        /**指定节点ID列表，当 NodeSelectType 为 specify 时必填*/
        @KsYunField(name="SpecifyNodes",type=2)
        private List<String> SpecifyNodesList;

    }

    /**节点选择类型：
- random，随机分配
- specify，指定节点分配
不传该字段表示不修改，仅物理队列有效。变更时需同时传入 NodeSpec*/
    @KsYunField(name="NodeSelectType")
    private String NodeSelectType;

}
