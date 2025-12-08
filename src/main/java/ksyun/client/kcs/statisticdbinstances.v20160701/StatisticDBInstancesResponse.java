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
        private List<DataDtoPartitionDto> Partition;

        @Data
        @ToString
        public static class DataDtoPartitionDto {
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
            private List<DataDtoPartitionDtoStatisticsDto> Statistics;

            @Data
            @ToString
            public static class DataDtoPartitionDtoStatisticsDto {
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
        private DataDtoCountDto Count;

        @Data
        @ToString
        public static class DataDtoCountDto {
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
            private List<DataDtoCountDtoStatisticsDto> Statistics;

            @Data
            @ToString
            public static class DataDtoCountDtoStatisticsDto {
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
