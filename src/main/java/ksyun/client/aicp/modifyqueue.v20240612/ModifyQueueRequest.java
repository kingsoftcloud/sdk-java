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

    /**访问控制列表，若传入会进行全量覆盖式修改。传入空数组代表清理全部已授权子用户*/
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

    /**支持负载类型，不传该字段表示不修改，传空数组表示修改为不限制 
- Notebook（开发任务）
- TrainJob（训练任务）
- Inference（推理任务）
- DataJob（数据处理任务）*/
    @KsYunField(name="WorkloadType",type=2)
    private List<String> WorkloadTypeList;

}
