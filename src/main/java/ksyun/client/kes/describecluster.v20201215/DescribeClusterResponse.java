package ksyun.client.kes.describecluster.v20201215;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeClusterResponse
* @Description DescribeCluster 返回体
*/
@Data
@ToString
public class DescribeClusterResponse extends BaseResponseModel {

    /**集群ID*/
    @JsonProperty("ClusterId")
    private String ClusterId;

    /**集群名称*/
    @JsonProperty("ClusterName")
    private String ClusterName;

    /**KES服务*/
    @JsonProperty("ClusterType")
    private String ClusterType;

    /**产品版本*/
    @JsonProperty("MainVersion")
    private String MainVersion;

    /**该集群下节点组列表*/
    @JsonProperty("InstanceGroups")
    private List<InstanceGroupsDto> InstanceGroups;

    @Data
    @ToString
    public static class InstanceGroupsDto {
        /**节点组ID*/
        @JsonProperty("Id")
        private String Id;

        /**节点组类型：
MASTER（专有主节点）
DATA（数据节点）
COORDINATOR（协调节点）
WARM（冷数据节点）*/
        @JsonProperty("InstanceGroupType")
        private String InstanceGroupType;

        /**服务器类型：
KEC：云服务器
EPC：裸金属服务器*/
        @JsonProperty("ResourceType")
        private String ResourceType;

        /**节点组ES套餐*/
        @JsonProperty("InstanceType")
        private String InstanceType;

        /**	
数据盘大小*/
        @JsonProperty("VolumeSize")
        private Integer VolumeSize;

        /**数据盘类型
*/
        @JsonProperty("VolumeType")
        private String VolumeType;

    }

    /**是否绑定 EIP*/
    @JsonProperty("EnableEip")
    private Boolean EnableEip;

    /**数据中心*/
    @JsonProperty("Region")
    private String Region;

    /**可用区*/
    @JsonProperty("AvailabilityZone")
    private String AvailabilityZone;

    /**VPC网络ID*/
    @JsonProperty("VpcDomainId")
    private String VpcDomainId;

    /**子网ID*/
    @JsonProperty("VpcSubnetId")
    private String VpcSubnetId;

    /**计费方式*/
    @JsonProperty("ChargeType")
    private String ChargeType;

    /**集群状态*/
    @JsonProperty("ClusterStatus")
    private String ClusterStatus;

    /**集群创建时间*/
    @JsonProperty("CreateTime")
    private String CreateTime;

    /**集群更新时间*/
    @JsonProperty("UpdateTime")
    private String UpdateTime;

    /**集群运行时间*/
    @JsonProperty("ServingMinutes")
    private Integer ServingMinutes;

    /**代理端口*/
    @JsonProperty("ProxyPort")
    private Integer ProxyPort;

    /**集群标签*/
    @JsonProperty("Tags")
    private List<TagsDto> Tags;

    @Data
    @ToString
    public static class TagsDto {
        /**标签键*/
        @JsonProperty("TagKey")
        private String TagKey;

        /**标签值*/
        @JsonProperty("TagValue")
        private String TagValue;

    }

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**状态码*/
    @JsonProperty("StatusCode")
    private Integer StatusCode;

}
