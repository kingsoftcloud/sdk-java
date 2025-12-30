package ksyun.client.aicp.describeresourcepoolinstances.v20240612;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeResourcePoolInstancesResponse
* @Description DescribeResourcePoolInstances 返回体
*/
@Data
@ToString
public class DescribeResourcePoolInstancesResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**每页最大数目*/
    @JsonProperty("PageSize")
    private Integer PageSize;

    /**	
页码*/
    @JsonProperty("Page")
    private Integer Page;

    /**节点总数*/
    @JsonProperty("TotalCount")
    private Integer TotalCount;

    /**资源组节点列表*/
    @JsonProperty("ResourcePoolInstanceSet")
    private List<ResourcePoolInstanceSetDto> ResourcePoolInstanceSet;

    @Data
    @ToString
    public static class ResourcePoolInstanceSetDto {
        /**资源组ID*/
        @JsonProperty("ResourcePoolId")
        private String ResourcePoolId;

        /**实例ID*/
        @JsonProperty("InstanceId")
        private String InstanceId;

        /**实例名称*/
        @JsonProperty("InstanceName")
        private String InstanceName;

        /**实例角色，取值为：
• Worker
• Master
• Etcd
• Master_Etcd*/
        @JsonProperty("K8sRole")
        private String K8sRole;

        /**实例状态：

- abnormal 异常
- normal 正常
- building 创建中
- failed 开机失败
- installing 安装中
- deleting 移除中
- rebuilding 重装系统中*/
        @JsonProperty("InstanceStatus")
        private String InstanceStatus;

        /**实例规格*/
        @JsonProperty("InstanceType")
        private String InstanceType;

        /**实例类型：

- KEC 云主机
- EPC 裸金属实例*/
        @JsonProperty("NodeType")
        private String NodeType;

        /**主网卡IP，托管资源组实例为空*/
        @JsonProperty("InstanceIp")
        private String InstanceIp;

        /**主网卡VPC ID，托管资源组实例为空*/
        @JsonProperty("VpcId")
        private String VpcId;

        /**	
可用区*/
        @JsonProperty("AvailabilityZone")
        private String AvailabilityZone;

        /**	
计费方式*/
        @JsonProperty("ChargeType")
        private String ChargeType;

        /**项目制ID*/
        @JsonProperty("ProjectId")
        private String ProjectId;

        /**节点提示信息*/
        @JsonProperty("NodeIcon")
        private String NodeIcon;

        /**到期时间*/
        @JsonProperty("ServiceEndTime")
        private String ServiceEndTime;

        /**创建时间*/
        @JsonProperty("CreateTime")
        private String CreateTime;

        /**是否为试用产品，自运维资源组节点为空*/
        @JsonProperty("IsTrial")
        private Boolean IsTrial;

        /**是否为GPU节点*/
        @JsonProperty("IsGpu")
        private Boolean IsGpu;

        /**资源组类型：

- KCE 自运维资源组
- Managed 托管资源组*/
        @JsonProperty("ResourcePoolType")
        private String ResourcePoolType;

        /**GPU类型*/
        @JsonProperty("GpuType")
        private String GpuType;

        /**	
网卡列表*/
        @JsonProperty("NetworkInterfaceSet")
        private List<ResourcePoolInstanceSetNetworkInterfaceSetDto> NetworkInterfaceSet;

        @Data
        @ToString
        public static class ResourcePoolInstanceSetNetworkInterfaceSetDto {
            /**VPC ID*/
            @JsonProperty("VpcId")
            private String VpcId;

            /**子网ID*/
            @JsonProperty("SubnetId")
            private String SubnetId;

            /**私网IP地址*/
            @JsonProperty("PrivateIpAddress")
            private String PrivateIpAddress;

            /**网卡ID*/
            @JsonProperty("NetworkInterfaceId")
            private String NetworkInterfaceId;

            /**网卡类型:
- primary 主网卡
- extension 辅网卡*/
            @JsonProperty("NetworkInterfaceType")
            private String NetworkInterfaceType;

        }

        /**	
节点CPU使用情况*/
        @JsonProperty("Cpu")
        private ResourcePoolInstanceSetCpuDto Cpu;

        @Data
        @ToString
        public static class ResourcePoolInstanceSetCpuDto {
            /**已分配值*/
            @JsonProperty("Allocated")
            private Integer Allocated;

            /**可分配值*/
            @JsonProperty("Allocatable")
            private Integer Allocatable;

        }

        /**	
节点GPU使用情况*/
        @JsonProperty("Gpu")
        private ResourcePoolInstanceSetGpuDto Gpu;

        @Data
        @ToString
        public static class ResourcePoolInstanceSetGpuDto {
            /**已分配值*/
            @JsonProperty("Allocated")
            private Integer Allocated;

            /**可分配值*/
            @JsonProperty("Allocatable")
            private Integer Allocatable;

        }

        /**	
节点内存使用情况*/
        @JsonProperty("Memory")
        private ResourcePoolInstanceSetMemoryDto Memory;

        @Data
        @ToString
        public static class ResourcePoolInstanceSetMemoryDto {
            /**已分配值*/
            @JsonProperty("Allocated")
            private Integer Allocated;

            /**可分配值*/
            @JsonProperty("Allocatable")
            private Integer Allocatable;

        }

        /**节点是否封锁*/
        @JsonProperty("UnSchedulable")
        private Boolean UnSchedulable;

    }

}
