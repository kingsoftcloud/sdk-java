package ksyun.client.kec.describescalinginstance.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeScalingInstanceResponse
* @Description DescribeScalingInstance 返回体
*/
@Data
@ToString
public class DescribeScalingInstanceResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("ScalingInstanceCount")
    private Integer ScalingInstanceCount;

    /***/
    @JsonProperty("ScalingInstanceSet")
    private List<ScalingInstanceSetDto> ScalingInstanceSet;

    @Data
    @ToString
    public static class ScalingInstanceSetDto {
        /***/
        @JsonProperty("InstanceId")
        private String InstanceId;

        /***/
        @JsonProperty("InstanceName")
        private String InstanceName;

        /***/
        @JsonProperty("HealthStatus")
        private String HealthStatus;

        /***/
        @JsonProperty("CreationType")
        private String CreationType;

        /***/
        @JsonProperty("AddTime")
        private String AddTime;

        /***/
        @JsonProperty("ProtectedFromScaleIn")
        private Integer ProtectedFromScaleIn;

        /***/
        @JsonProperty("HostName")
        private String HostName;

        /***/
        @JsonProperty("LifeCycleState")
        private String LifeCycleState;

        /***/
        @JsonProperty("AvailabilityZone")
        private String AvailabilityZone;

    }

}
