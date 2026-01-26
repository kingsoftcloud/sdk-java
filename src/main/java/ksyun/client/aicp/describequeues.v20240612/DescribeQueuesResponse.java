package ksyun.client.aicp.describequeues.v20240612;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * @Classname DescribeQueuesResponse
 * @Description DescribeQueues 返回体
 */
@Data
@ToString
public class DescribeQueuesResponse extends BaseResponseModel {

    /**
     * 请求ID
     */
    @JsonProperty("RequestId")
    private String RequestId;

    /**
     * 单次调用可返回的最大条目数量
     */
    @JsonProperty("PageSize")
    private Integer PageSize;

    /**
     * 页码
     */
    @JsonProperty("Page")
    private Integer Page;

    /**
     * 队列总数
     */
    @JsonProperty("TotalCount")
    private Integer TotalCount;

    /**
     * 队列列表
     */
    @JsonProperty("QueueSet")
    private List<QueueSetDto> QueueSet;

    @Data
    @ToString
    public static class QueueSetDto {
        /**
         * 队列ID
         */
        @JsonProperty("QueueId")
        private String QueueId;

        /**
         * 资源池ID
         */
        @JsonProperty("ResourcePoolId")
        private String ResourcePoolId;

        /**
         * 队列名称
         */
        @JsonProperty("QueueName")
        private String QueueName;

        /**
         * 队列描述
         */
        @JsonProperty("Description")
        private String Description;

        /**
         * 是否支持资源回收
         */
        @JsonProperty("Reclaimable")
        private Boolean Reclaimable;

        /**
         * 是否允许向其他队列借资源
         */
        @JsonProperty("AllowBorrowing")
        private Boolean AllowBorrowing;

        /**
         * 队列状态信息
         */
        @JsonProperty("Status")
        private QueueSetStatusDto Status;

        @Data
        @ToString
        public static class QueueSetStatusDto {
            /**
             * 状态
             */
            @JsonProperty("State")
            private String State;

            /**
             * 排队中的任务数量
             */
            @JsonProperty("Queuing")
            private Integer Queuing;

        }

        /**
         * 创建者id
         */
        @JsonProperty("CreatorId")
        private String CreatorId;

        /**
         * 创建时间
         */
        @JsonProperty("CreateTime")
        private String CreateTime;

        /**
         * 更新时间
         */
        @JsonProperty("UpdateTime")
        private String UpdateTime;

        /**
         * 访问控制列表
         */
        @JsonProperty("AccessList")
        private List<QueueSetAccessListDto> AccessList;

        @Data
        @ToString
        public static class QueueSetAccessListDto {
            /**
             * 用户ID
             */
            @JsonProperty("UserId")
            private String UserId;

            /**
             * 权限信息:
             * - admin，超级管理员/创建者
             * - writer，管理员
             * - reader，队列成员
             */
            @JsonProperty("Permission")
            private String Permission;

        }

        /**
         * 队列资源配额
         */
        @JsonProperty("Capability")
        private QueueSetCapabilityDto Capability;

        @Data
        @ToString
        public static class QueueSetCapabilityDto {
            /**
             * 队列CPU配额量
             */
            @JsonProperty("CPU")
            private Integer CPU;

            /**
             * 内存配额量（Gi）
             */
            @JsonProperty("Memory")
            private Integer Memory;

            /**
             * GPU配额列表
             */
            @JsonProperty("GPUInfos")
            private List<QueueSetCapabilityGPUInfosDto> GPUInfos;

            @Data
            @ToString
            public static class QueueSetCapabilityGPUInfosDto {
                /**
                 * GPU类型
                 */
                @JsonProperty("GPUType")
                private String GPUType;

                /**
                 * GPU数量
                 */
                @JsonProperty("GPUNum")
                private Integer GPUNum;

            }

        }

        /**
         * 已分配资源
         */
        @JsonProperty("Allocated")
        private QueueSetAllocatedDto Allocated;

        @Data
        @ToString
        public static class QueueSetAllocatedDto {
            /**
             * 已分配CPU数量
             */
            @JsonProperty("CPU")
            private Integer CPU;

            /**
             * 已分配内存（Gi）
             */
            @JsonProperty("Memory")
            private Integer Memory;

            /**
             * 已分配GPU数量
             */
            @JsonProperty("GPU")
            private QueueSetAllocatedGPUDto GPU;

            @Data
            @ToString
            public static class QueueSetAllocatedGPUDto {
            }

        }

    }

}
