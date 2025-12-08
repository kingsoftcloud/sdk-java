package ksyun.client.epc.describeinspecthostresults.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeInspectHostResultsResponse
* @Description DescribeInspectHostResults 返回体
*/
@Data
@ToString
public class DescribeInspectHostResultsResponse extends BaseResponseModel {
    /***/
    @JsonProperty("InspectResultSet")
    private List<InspectResultSetDto> InspectResultSet;

    @Data
    @ToString
    public static class InspectResultSetDto {
        /***/
        @JsonProperty("InspectId")
        private String InspectId;

        /***/
        @JsonProperty("InspectName")
        private String InspectName;

        /***/
        @JsonProperty("GpuModel")
        private String GpuModel;

        /***/
        @JsonProperty("Result")
        private String Result;

        /***/
        @JsonProperty("CreateTime")
        private String CreateTime;

        /***/
        @JsonProperty("UpdateTime")
        private String UpdateTime;

        /***/
        @JsonProperty("SuccessCount")
        private Integer SuccessCount;

        /***/
        @JsonProperty("FailCount")
        private Integer FailCount;

        /***/
        @JsonProperty("InspectResultDetailSet")
        private List<InspectResultDetailSetDto> InspectResultDetailSet;

        @Data
        @ToString
        public static class InspectResultDetailSetDto {
            /***/
            @JsonProperty("HostId")
            private String HostId;

            /***/
            @JsonProperty("Sn")
            private String Sn;

            /***/
            @JsonProperty("Result")
            private String Result;

            /***/
            @JsonProperty("InspectStatus")
            private String InspectStatus;

            /***/
            @JsonProperty("CreateTime")
            private String CreateTime;

            /***/
            @JsonProperty("UpdateTime")
            private String UpdateTime;

        }

    }

    /***/
    @JsonProperty("InspectHostCount")
    private Integer InspectHostCount;

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("TotalCount")
    private Integer TotalCount;

    /***/
    @JsonProperty("NextToken")
    private String NextToken;

}
