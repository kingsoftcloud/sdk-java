package ksyun.client.influxdb.describeretentionpolicylist.v20191010;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeRetentionPolicyListResponse
* @Description DescribeRetentionPolicyList 返回体
*/
@Data
@ToString
public class DescribeRetentionPolicyListResponse extends BaseResponseModel {

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
        @JsonProperty("Total")
        private Integer Total;

        /***/
        @JsonProperty("Offset")
        private Integer Offset;

        /***/
        @JsonProperty("Limit")
        private Integer Limit;

        /***/
        @JsonProperty("Data")
        private List<DataDataDto> Data;

        @Data
        @ToString
        public static class DataDataDto {
            /***/
            @JsonProperty("PolicyName")
            private String PolicyName;

            /***/
            @JsonProperty("Duration")
            private String Duration;

            /***/
            @JsonProperty("DefaultPolicy")
            private Integer DefaultPolicy;

            /***/
            @JsonProperty("ShardGroupDuration")
            private String ShardGroupDuration;

        }

    }

}
