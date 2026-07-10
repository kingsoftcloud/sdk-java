package ksyun.client.monitor.listgrafanainstances.v20250101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ListGrafanaInstancesResponse
* @Description ListGrafanaInstances 返回体
*/
@Data
@ToString
public class ListGrafanaInstancesResponse extends BaseResponseModel {

    /**请求ID。*/
    @JsonProperty("RequestID")
    private String RequestID;

    /***/
    @JsonProperty("InstancesSet")
    private List<InstancesSetDto> InstancesSet;

    @Data
    @ToString
    public static class InstancesSetDto {
        /**用户ID。*/
        @JsonProperty("UserID")
        private Integer UserID;

        /**集群ID。*/
        @JsonProperty("ClusterID")
        private String ClusterID;

        /**集群名称。*/
        @JsonProperty("ClusterName")
        private String ClusterName;

        /***/
        @JsonProperty("ClusterState")
        private String ClusterState;

        /***/
        @JsonProperty("ClusterType")
        private Integer ClusterType;

        /***/
        @JsonProperty("InstanceID")
        private String InstanceID;

        /***/
        @JsonProperty("InstanceName")
        private String InstanceName;

        /***/
        @JsonProperty("InstanceType")
        private String InstanceType;

        /***/
        @JsonProperty("InstanceStatus")
        private String InstanceStatus;

        /***/
        @JsonProperty("InstanceStatusDesc")
        private String InstanceStatusDesc;

        /***/
        @JsonProperty("Region")
        private String Region;

        /***/
        @JsonProperty("RegionCnName")
        private String RegionCnName;

        /***/
        @JsonProperty("GrafanaUserName")
        private String GrafanaUserName;

        /***/
        @JsonProperty("UID")
        private Integer UID;

        /***/
        @JsonProperty("OrgID")
        private Integer OrgID;

        /***/
        @JsonProperty("AccessURL")
        private String AccessURL;

        /***/
        @JsonProperty("AccessToken")
        private String AccessToken;

        /***/
        @JsonProperty("CreatedAt")
        private String CreatedAt;

        /***/
        @JsonProperty("UpdatedAt")
        private String UpdatedAt;

    }

    /***/
    @JsonProperty("TotalCount")
    private Integer TotalCount;

    /***/
    @JsonProperty("PageIndex")
    private Integer PageIndex;

    /***/
    @JsonProperty("PageSize")
    private Integer PageSize;

}
