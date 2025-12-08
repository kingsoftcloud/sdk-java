package ksyun.client.kec.describemodels.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeModelsResponse
* @Description DescribeModels 返回体
*/
@Data
@ToString
public class DescribeModelsResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("InstanceCount")
    private Integer InstanceCount;

    /***/
    @JsonProperty("ModelSet")
    private List<ModelSetDto> ModelSet;

    @Data
    @ToString
    public static class ModelSetDto {
        /***/
        @JsonProperty("ModelName")
        private String ModelName;

        /***/
        @JsonProperty("AvailabilityZone")
        private String AvailabilityZone;

        /***/
        @JsonProperty("AvailabilityZoneName")
        private String AvailabilityZoneName;

        /***/
        @JsonProperty("CreateTime")
        private String CreateTime;

        /***/
        @JsonProperty("ModelId")
        private String ModelId;

        /***/
        @JsonProperty("ModifiedTime")
        private String ModifiedTime;

        /***/
        @JsonProperty("ImageId")
        private String ImageId;

        /***/
        @JsonProperty("InstanceType")
        private String InstanceType;

        /***/
        @JsonProperty("SubnetId")
        private String SubnetId;

        /***/
        @JsonProperty("ChargeType")
        private String ChargeType;

        /***/
        @JsonProperty("PurchaseTime")
        private String PurchaseTime;

        /***/
        @JsonProperty("SecurityGroupId")
        private String SecurityGroupId;

        /***/
        @JsonProperty("InstanceName")
        private String InstanceName;

        /***/
        @JsonProperty("SriovNetSupport")
        private String SriovNetSupport;

        /***/
        @JsonProperty("KeepImageLogin")
        private String KeepImageLogin;

        /***/
        @JsonProperty("SystemDisk")
        private SystemDiskDto SystemDisk;

        @Data
        @ToString
        public static class SystemDiskDto {
            /***/
            @JsonProperty("DiskType")
            private String DiskType;

            /***/
            @JsonProperty("DiskSize")
            private String DiskSize;

        }

        /**开机失败是否自动删除，默认值为false*/
        @JsonProperty("FailureAutoDelete")
        private Boolean FailureAutoDelete;

        /**是否同步ebs标签*/
        @JsonProperty("SyncTag")
        private Boolean SyncTag;

    }

}
