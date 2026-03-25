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

    /**资源配额，GPU、CPU、内存等*/
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

    /**是否允许向其他队列借资源*/
    @KsYunField(name="AllowBorrowing")
    private Boolean AllowBorrowing;

    /**队列描述, 长度最大200*/
    @KsYunField(name="Description")
    private String Description;

    /**访问控制列表（子账号权限信息）*/
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

    /**支持负载类型，默认不传表示不限制使用类型 
- Notebook（开发任务）
- TrainJob（训练任务）
- Inference（推理任务）
- DataJob（数据处理任务）*/
    @KsYunField(name="WorkloadType",type=2)
    private List<String> WorkloadTypeList;

}
