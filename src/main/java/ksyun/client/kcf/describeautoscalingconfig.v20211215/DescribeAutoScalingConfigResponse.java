package ksyun.client.kcf.describeautoscalingconfig.v20211215;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeAutoScalingConfigResponse
* @Description DescribeAutoScalingConfig 返回体
*/
@Data
@ToString
public class DescribeAutoScalingConfigResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /***/
        @JsonProperty("IdleReplicaCount")
        private Integer IdleReplicaCount;

        /***/
        @JsonProperty("MaxReplicaCount")
        private Integer MaxReplicaCount;

        /***/
        @JsonProperty("MinReplicaCount")
        private Integer MinReplicaCount;

        /***/
        @JsonProperty("CooldownPeriod")
        private Integer CooldownPeriod;

        /***/
        @JsonProperty("StabilizationWindowSeconds")
        private Integer StabilizationWindowSeconds;

    }

}
