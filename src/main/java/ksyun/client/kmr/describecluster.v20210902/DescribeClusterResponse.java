package ksyun.client.kmr.describecluster.v20210902;

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

    /**集群名称
*/
    @JsonProperty("ClusterName")
    private String ClusterName;

    /**对于KMR服务来说，固定为KMR*/
    @JsonProperty("ClusterType")
    private String ClusterType;

    /**产品版本*/
    @JsonProperty("MainVersion")
    private String MainVersion;

    /**该集群下的节点组列表*/
    @JsonProperty("InstanceGroups")
    private List<InstanceGroupsDto> InstanceGroups;

    @Data
    @ToString
    public static class InstanceGroupsDto {
        /**节点组ID*/
        @JsonProperty("Id")
        private String Id;

        /**节点组类型:

- Hadoop: MASTER、CORE 、TASK、GATEWAY、COMMON
- Kafka: BROKER
- Zookeeper: MASTER、CORE
- RocketMQ: MASTER、CORE*/
        @JsonProperty("InstanceGroupType")
        private String InstanceGroupType;

        /**服务器类型：

- KEC：云服务器
- EPC：裸金属服务器*/
        @JsonProperty("ResourceType")
        private String ResourceType;

        /**节点组KMR套餐
示例：

- KMR.I3.4C8G
- EPC: CAL-KMR.epc.32C256G*/
        @JsonProperty("InstanceType")
        private String InstanceType;

        /**数据盘大小*/
        @JsonProperty("VolumeSize")
        private Integer VolumeSize;

        /**数据盘类型*/
        @JsonProperty("VolumeType")
        private String VolumeType;

        /**节点组主机实例ID列表

*/
        @JsonProperty("InstanceIds")
        private List<String> InstanceIds;

    }

    /**是否绑定 EIP*/
    @JsonProperty("EnableEip")
    private Boolean EnableEip;

    /**数据中心*/
    @JsonProperty("Region")
    private String Region;

    /**VPC 网络ID*/
    @JsonProperty("VpcDomainId")
    private String VpcDomainId;

    /**计费方式*/
    @JsonProperty("ChargeType")
    private String ChargeType;

    /**集群状态
*/
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

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**状态码*/
    @JsonProperty("StatusCode")
    private Integer StatusCode;

    /**集群标签*/
    @JsonProperty("Tags")
    private List<TagsDto> Tags;

    @Data
    @ToString
    public static class TagsDto {
        /**标签ID*/
        @JsonProperty("TagId")
        private Integer TagId;

        /**标签Key*/
        @JsonProperty("TagKey")
        private String TagKey;

        /**标签Value*/
        @JsonProperty("TagValue")
        private String TagValue;

    }

}
