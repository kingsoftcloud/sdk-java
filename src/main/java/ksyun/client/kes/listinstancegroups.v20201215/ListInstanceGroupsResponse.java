package ksyun.client.kes.listinstancegroups.v20201215;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ListInstanceGroupsResponse
* @Description ListInstanceGroups 返回体
*/
@Data
@ToString
public class ListInstanceGroupsResponse extends BaseResponseModel {
    /**节点组详情*/
    @JsonProperty("InstanceGroups")
    private List<InstanceGroupsDto> InstanceGroups;

    @Data
    @ToString
    public static class InstanceGroupsDto {
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
        @JsonProperty("InstanceTypeCode")
        private String InstanceTypeCode;

        /**节点数量*/
        @JsonProperty("InstanceCount")
        private Integer InstanceCount;

        /**数据盘类型*/
        @JsonProperty("VolumeType")
        private String VolumeType;

        /**数据盘大小*/
        @JsonProperty("VolumeSize")
        private Integer VolumeSize;

        /**数据盘数量*/
        @JsonProperty("VolumeCount")
        private Integer VolumeCount;

        /**虚拟私有网络ID*/
        @JsonProperty("VpcId")
        private String VpcId;

        /**子网ID*/
        @JsonProperty("VpcSubnetId")
        private String VpcSubnetId;

        /**可用区*/
        @JsonProperty("AvalabilityZone")
        private String AvalabilityZone;

        /**该类型节点组数量*/
        @JsonProperty("MultiInstanceCount")
        private Integer MultiInstanceCount;

        /**节点组节点信息*/
        @JsonProperty("Instances")
        private List<InstanceGroupsDtoInstancesDto> Instances;

        @Data
        @ToString
        public static class InstanceGroupsDtoInstancesDto {
            /**节点逻辑ID*/
            @JsonProperty("Id")
            private String Id;

            /**节点ID */
            @JsonProperty("InstanceGroupId")
            private String InstanceGroupId;

            /**节点真实ID（主机实例ID）*/
            @JsonProperty("InstanceId")
            private String InstanceId;

            /**节点名称*/
            @JsonProperty("InstanceName")
            private String InstanceName;

            /**节点IP*/
            @JsonProperty("InternalIp")
            private String InternalIp;

            /**节点磁盘ID集合*/
            @JsonProperty("Volumes")
            private List<String> Volumes;

        }

    }

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**状态码*/
    @JsonProperty("StatusCode")
    private Integer StatusCode;

}
