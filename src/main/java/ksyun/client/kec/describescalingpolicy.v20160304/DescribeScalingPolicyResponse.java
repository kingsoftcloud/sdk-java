package ksyun.client.kec.describescalingpolicy.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeScalingPolicyResponse
* @Description DescribeScalingPolicy 返回体
*/
@Data
@ToString
public class DescribeScalingPolicyResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("ScalingPolicySize")
    private Integer ScalingPolicySize;

    /***/
    @JsonProperty("ScalingPolicySet")
    private List<ScalingPolicySetDto> ScalingPolicySet;

    @Data
    @ToString
    public static class ScalingPolicySetDto {
        /***/
        @JsonProperty("ScalingGroupId")
        private String ScalingGroupId;

        /***/
        @JsonProperty("ScalingPolicyId")
        private String ScalingPolicyId;

        /***/
        @JsonProperty("Description")
        private String Description;

        /***/
        @JsonProperty("ScalingPolicyName")
        private String ScalingPolicyName;

        /***/
        @JsonProperty("AdjustmentType")
        private String AdjustmentType;

        /***/
        @JsonProperty("AdjustmentValue")
        private Integer AdjustmentValue;

        /***/
        @JsonProperty("Metric")
        private MetricDto Metric;

        @Data
        @ToString
        public static class MetricDto {
            /***/
            @JsonProperty("DimensionName")
            private String DimensionName;

            /***/
            @JsonProperty("ComparisonOperator")
            private String ComparisonOperator;

            /***/
            @JsonProperty("Threshold")
            private Integer Threshold;

            /***/
            @JsonProperty("RepeatTimes")
            private Integer RepeatTimes;

            /***/
            @JsonProperty("Period")
            private Integer Period;

            /***/
            @JsonProperty("Function")
            private String Function;

        }

        /***/
        @JsonProperty("CreateTime")
        private String CreateTime;

        /***/
        @JsonProperty("CoolDown")
        private Integer CoolDown;

        /***/
        @JsonProperty("AvailabilityZone")
        private String AvailabilityZone;

    }

}
