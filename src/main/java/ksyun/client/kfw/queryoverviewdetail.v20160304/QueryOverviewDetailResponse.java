package ksyun.client.kfw.queryoverviewdetail.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname QueryOverviewDetailResponse
* @Description QueryOverviewDetail 返回体
*/
@Data
@ToString
public class QueryOverviewDetailResponse extends BaseResponseModel {

    /***/
    @JsonProperty("CloudFireWallInstanceDetail")
    private CloudFireWallInstanceDetailDto CloudFireWallInstanceDetail;

    @Data
    @ToString
    public static class CloudFireWallInstanceDetailDto {
        /***/
        @JsonProperty("InstanceId")
        private String InstanceId;

        /***/
        @JsonProperty("InstanceName")
        private String InstanceName;

        /***/
        @JsonProperty("InstanceType")
        private String InstanceType;

        /***/
        @JsonProperty("Bandwidth")
        private Integer Bandwidth;

        /***/
        @JsonProperty("Status")
        private Integer Status;

        /***/
        @JsonProperty("TotalEipNum")
        private Integer TotalEipNum;

        /***/
        @JsonProperty("TotalAclNum")
        private Integer TotalAclNum;

        /***/
        @JsonProperty("UsedEipNum")
        private Integer UsedEipNum;

        /***/
        @JsonProperty("UsedAclNum")
        private Integer UsedAclNum;

        /***/
        @JsonProperty("IpsStatus")
        private Integer IpsStatus;

        /***/
        @JsonProperty("AvStatus")
        private Integer AvStatus;

        /***/
        @JsonProperty("CreateTime")
        private String CreateTime;

        /***/
        @JsonProperty("ProjectId")
        private String ProjectId;

        /***/
        @JsonProperty("ChargeType")
        private String ChargeType;

        /***/
        @JsonProperty("ProjectName")
        private String ProjectName;

        /***/
        @JsonProperty("Region")
        private String Region;

        /***/
        @JsonProperty("ServiceEndTime")
        private String ServiceEndTime;

        /***/
        @JsonProperty("Duration")
        private Integer Duration;

        /***/
        @JsonProperty("FwLbId")
        private String FwLbId;

        /***/
        @JsonProperty("AclDenyCount")
        private Integer AclDenyCount;

        /***/
        @JsonProperty("IpsCount")
        private Integer IpsCount;

        /***/
        @JsonProperty("InMax")
        private String InMax;

        /***/
        @JsonProperty("OutMax")
        private String OutMax;

    }

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
