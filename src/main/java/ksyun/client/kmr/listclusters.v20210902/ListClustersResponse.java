package ksyun.client.kmr.listclusters.v20210902;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ListClustersResponse
* @Description ListClusters 返回体
*/
@Data
@ToString
public class ListClustersResponse extends BaseResponseModel {
    /**该账号下的集群列表*/
    @JsonProperty("Clusters")
    private List<ClustersDto> Clusters;

    @Data
    @ToString
    public static class ClustersDto {
        /**集群ID*/
        @JsonProperty("ClusterId")
        private String ClusterId;

        /**集群名称*/
        @JsonProperty("ClusterName")
        private String ClusterName;

        /**产品版本*/
        @JsonProperty("MainVersion")
        private String MainVersion;

        /**该集群下的节点组列表*/
        @JsonProperty("InstanceGroups")
        private List<ClustersDtoInstanceGroupsDto> InstanceGroups;

        @Data
        @ToString
        public static class ClustersDtoInstanceGroupsDto {
            /**节点组ID*/
            @JsonProperty("Id")
            private String Id;

            /**节点组类型*/
            @JsonProperty("InstanceGroupType")
            private String InstanceGroupType;

            /**节点资源类型*/
            @JsonProperty("ResourceType")
            private String ResourceType;

            /**节点组套餐代码*/
            @JsonProperty("InstanceType")
            private String InstanceType;

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

        /**VPC子网ID*/
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

        /**集群运行时间

*/
        @JsonProperty("ServingMinutes")
        private Integer ServingMinutes;

    }

    /**该账号下的 KMR 集群总数

*/
    @JsonProperty("Total")
    private Integer Total;

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**状态码*/
    @JsonProperty("StatusCode")
    private Integer StatusCode;

}
