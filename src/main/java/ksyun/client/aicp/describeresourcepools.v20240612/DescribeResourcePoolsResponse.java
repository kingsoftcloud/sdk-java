package ksyun.client.aicp.describeresourcepools.v20240612;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeResourcePoolsResponse
* @Description DescribeResourcePools 返回体
*/
@Data
@ToString
public class DescribeResourcePoolsResponse extends BaseResponseModel {

    /**资源组列表*/
    @JsonProperty("ResourcePoolSet")
    private List<ResourcePoolSetDto> ResourcePoolSet;

    @Data
    @ToString
    public static class ResourcePoolSetDto {
        /**资源组ID*/
        @JsonProperty("ResourcePoolId")
        private String ResourcePoolId;

        /**资源组名称*/
        @JsonProperty("ResourcePoolName")
        private String ResourcePoolName;

        /**	
描述信息*/
        @JsonProperty("Description")
        private String Description;

        /**资源组类型：
- KCE 自运维资源组
- Managed 托管资源组*/
        @JsonProperty("ResourcePoolType")
        private String ResourcePoolType;

        /**VPC ID*/
        @JsonProperty("VpcId")
        private String VpcId;

        /**资源组状态：

- normal 正常
- abnormal 异常*/
        @JsonProperty("Status")
        private String Status;

        /**创建时间*/
        @JsonProperty("CreateTime")
        private String CreateTime;

        /**资源组GPU节点个数*/
        @JsonProperty("GpuNodeNum")
        private Integer GpuNodeNum;

        /**资源组健康GPU节点数目*/
        @JsonProperty("AvailableGpuNodeNum")
        private Integer AvailableGpuNodeNum;

        /**GPU卡数*/
        @JsonProperty("GpuNum")
        private Integer GpuNum;

        /**健康GPU卡数*/
        @JsonProperty("AvailableGpuNum")
        private Integer AvailableGpuNum;

        /**KCE集群关联的Promethus ID*/
        @JsonProperty("PrometheusId")
        private String PrometheusId;

        /**KCE集群ID*/
        @JsonProperty("ClusterId")
        private String ClusterId;

        /**资源组用途：

- General 通用
- IDP 白海*/
        @JsonProperty("Purpose")
        private String Purpose;

        /**组件列表*/
        @JsonProperty("Components")
        private List<String> Components;

        /**Klog工程名称*/
        @JsonProperty("LogProjectName")
        private String LogProjectName;

        /**日志池名称*/
        @JsonProperty("LogPoolName")
        private String LogPoolName;

        /**性能型KPFS ID*/
        @JsonProperty("FileSystemId")
        private String FileSystemId;

        /**资源组是否关联性能型KPFS*/
        @JsonProperty("EnableKPFSPerformance")
        private Boolean EnableKPFSPerformance;

        /**资源组是否启用Klog日志服务*/
        @JsonProperty("EnableKlog")
        private Boolean EnableKlog;

    }

    /**资源组总数*/
    @JsonProperty("TotalCount")
    private Integer TotalCount;

    /**每页最大实例数目*/
    @JsonProperty("PageSize")
    private Integer PageSize;

    /**页码*/
    @JsonProperty("Page")
    private Integer Page;

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

}
