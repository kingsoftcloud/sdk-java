package ksyun.client.kec.describescalinggroup.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeScalingGroupResponse
* @Description DescribeScalingGroup 返回体
*/
@Data
@ToString
public class DescribeScalingGroupResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("ScalingGroupCount")
    private Integer ScalingGroupCount;

    /***/
    @JsonProperty("ScalingGroupSet")
    private List<ScalingGroupSetDto> ScalingGroupSet;

    @Data
    @ToString
    public static class ScalingGroupSetDto {
        /***/
        @JsonProperty("ScalingGroupId")
        private String ScalingGroupId;

        /***/
        @JsonProperty("BInScalingActivity")
        private Integer BInScalingActivity;

        /***/
        @JsonProperty("SlbId")
        private String SlbId;

        /***/
        @JsonProperty("ServerPort")
        private Integer ServerPort;

        /***/
        @JsonProperty("ListenerId")
        private String ListenerId;

        /***/
        @JsonProperty("Description")
        private String Description;

        /***/
        @JsonProperty("ServerPorts")
        private String ServerPorts;

        /***/
        @JsonProperty("SlbConfigSet")
        private List<ScalingGroupSetDtoSlbConfigSetDto> SlbConfigSet;

        @Data
        @ToString
        public static class ScalingGroupSetDtoSlbConfigSetDto {
            /***/
            @JsonProperty("SlbId")
            private String SlbId;

            /***/
            @JsonProperty("ListenerId")
            private String ListenerId;

            /***/
            @JsonProperty("ServerPortSet")
            private List<Integer> ServerPortSet;

            /***/
            @JsonProperty("Weight")
            private Integer Weight;

            /***/
            @JsonProperty("HealthCheckType")
            private String HealthCheckType;

        }

        /***/
        @JsonProperty("ScalingGroupName")
        private String ScalingGroupName;

        /***/
        @JsonProperty("ScalingConfigurationId")
        private String ScalingConfigurationId;

        /***/
        @JsonProperty("ScalingConfigurationName")
        private String ScalingConfigurationName;

        /***/
        @JsonProperty("MinSize")
        private Integer MinSize;

        /***/
        @JsonProperty("MaxSize")
        private Integer MaxSize;

        /***/
        @JsonProperty("InstanceNum")
        private Integer InstanceNum;

        /***/
        @JsonProperty("CreateTime")
        private String CreateTime;

        /***/
        @JsonProperty("RemovePolicy")
        private String RemovePolicy;

        /***/
        @JsonProperty("VpcId")
        private String VpcId;

        /***/
        @JsonProperty("SecurityGroupId")
        private String SecurityGroupId;

        /***/
        @JsonProperty("SubnetId")
        private String SubnetId;

        /***/
        @JsonProperty("Status")
        private String Status;

        /***/
        @JsonProperty("AvailabilityZone")
        private String AvailabilityZone;

        /***/
        @JsonProperty("ProductLine")
        private String ProductLine;

        /***/
        @JsonProperty("AvailabilityZoneName")
        private String AvailabilityZoneName;

        /***/
        @JsonProperty("DesiredCapacity")
        private Integer DesiredCapacity;

        /***/
        @JsonProperty("DistributeIpv6")
        private Boolean DistributeIpv6;

        /***/
        @JsonProperty("SubnetIdSet")
        private List<String> SubnetIdSet;

        /***/
        @JsonProperty("SubnetStrategy")
        private String SubnetStrategy;

        /***/
        @JsonProperty("SecurityGroupIdSet")
        private List<String> SecurityGroupIdSet;

        /***/
        @JsonProperty("LockDesiredCapacity")
        private Boolean LockDesiredCapacity;

        /***/
        @JsonProperty("AllowSlbScalingPolicy")
        private Boolean AllowSlbScalingPolicy;

    }

}
