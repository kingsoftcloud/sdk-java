package ksyun.client.kec.describescalingactivity.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeScalingActivityResponse
* @Description DescribeScalingActivity 返回体
*/
@Data
@ToString
public class DescribeScalingActivityResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("AvailabilityZone")
    private String AvailabilityZone;

    /***/
    @JsonProperty("ScalingActivityCount")
    private Integer ScalingActivityCount;

    /***/
    @JsonProperty("ScalingActivitySet")
    private List<ScalingActivitySetDto> ScalingActivitySet;

    @Data
    @ToString
    public static class ScalingActivitySetDto {
        /***/
        @JsonProperty("ScalingGroupId")
        private String ScalingGroupId;

        /***/
        @JsonProperty("Status")
        private Integer Status;

        /***/
        @JsonProperty("Cause")
        private String Cause;

        /***/
        @JsonProperty("Description")
        private String Description;

        /***/
        @JsonProperty("StartTime")
        private String StartTime;

        /***/
        @JsonProperty("ScalingActivityId")
        private String ScalingActivityId;

        /***/
        @JsonProperty("EndTime")
        private String EndTime;

        /***/
        @JsonProperty("Type")
        private Integer Type;

        /***/
        @JsonProperty("SuccInsList")
        private List<String> SuccInsList;

        /***/
        @JsonProperty("FailInsList")
        private List<String> FailInsList;

        /***/
        @JsonProperty("ErrorCode")
        private Integer ErrorCode;

    }

}
