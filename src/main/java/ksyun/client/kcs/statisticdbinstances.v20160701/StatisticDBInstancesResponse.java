package ksyun.client.kcs.statisticdbinstances.v20160701;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname StatisticDBInstancesResponse
* @Description StatisticDBInstances 返回体
*/
@Data
@ToString
public class StatisticDBInstancesResponse extends BaseResponseModel {

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
        @JsonProperty("partition")
        private List<DataPartitionDto> Partition;

        @Data
        @ToString
        public static class DataPartitionDto {
            /***/
            @JsonProperty("name")
            private String Name;

            /***/
            @JsonProperty("code")
            private String Code;

            /***/
            @JsonProperty("total")
            private Integer Total;

            /***/
            @JsonProperty("statistics")
            private List<DataPartitionStatisticsDto> Statistics;

            @Data
            @ToString
            public static class DataPartitionStatisticsDto {
                /***/
                @JsonProperty("name")
                private String Name;

                /***/
                @JsonProperty("code")
                private String Code;

                /***/
                @JsonProperty("total")
                private Integer Total;

            }

        }

        /***/
        @JsonProperty("count")
        private DataCountDto Count;

        @Data
        @ToString
        public static class DataCountDto {
            /***/
            @JsonProperty("name")
            private String Name;

            /***/
            @JsonProperty("code")
            private String Code;

            /***/
            @JsonProperty("total")
            private Integer Total;

            /***/
            @JsonProperty("statistics")
            private List<DataCountStatisticsDto> Statistics;

            @Data
            @ToString
            public static class DataCountStatisticsDto {
                /***/
                @JsonProperty("name")
                private String Name;

                /***/
                @JsonProperty("code")
                private String Code;

                /***/
                @JsonProperty("total")
                private Integer Total;

            }

        }

    }

}
