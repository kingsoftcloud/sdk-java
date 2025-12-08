package ksyun.client.dmp.instancestatistics.v20240101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname InstanceStatisticsResponse
* @Description InstanceStatistics 返回体
*/
@Data
@ToString
public class InstanceStatisticsResponse extends BaseResponseModel {
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
        @JsonProperty("TypeStatistic")
        private List<DataDtoTypeStatisticDto> TypeStatistic;

        @Data
        @ToString
        public static class DataDtoTypeStatisticDto {
            /***/
            @JsonProperty("Count")
            private Integer Count;

            /***/
            @JsonProperty("Percent")
            private String Percent;

            /***/
            @JsonProperty("DatabaseType")
            private String DatabaseType;

        }

        /***/
        @JsonProperty("RegionStatistic")
        private List<DataDtoRegionStatisticDto> RegionStatistic;

        @Data
        @ToString
        public static class DataDtoRegionStatisticDto {
            /***/
            @JsonProperty("Count")
            private Integer Count;

            /***/
            @JsonProperty("Percent")
            private String Percent;

            /***/
            @JsonProperty("InstanceRegion")
            private String InstanceRegion;

        }

        /***/
        @JsonProperty("SourceStatistic")
        private List<DataDtoSourceStatisticDto> SourceStatistic;

        @Data
        @ToString
        public static class DataDtoSourceStatisticDto {
            /***/
            @JsonProperty("Count")
            private Integer Count;

            /***/
            @JsonProperty("Percent")
            private String Percent;

            /***/
            @JsonProperty("InstanceSource")
            private String InstanceSource;

        }

        /***/
        @JsonProperty("StatusStatistic")
        private DataDtoStatusStatisticDto StatusStatistic;

        @Data
        @ToString
        public static class DataDtoStatusStatisticDto {
            /***/
            @JsonProperty("MySQL")
            private DataDtoStatusStatisticDtoMySQLDto MySQL;

            @Data
            @ToString
            public static class DataDtoStatusStatisticDtoMySQLDto {
                /***/
                @JsonProperty("Normal")
                private Integer Normal;

                /***/
                @JsonProperty("Error")
                private Integer Error;

            }

            /***/
            @JsonProperty("Redis")
            private DataDtoStatusStatisticDtoRedisDto Redis;

            @Data
            @ToString
            public static class DataDtoStatusStatisticDtoRedisDto {
                /***/
                @JsonProperty("Normal")
                private Integer Normal;

                /***/
                @JsonProperty("Error")
                private Integer Error;

            }

        }

        /***/
        @JsonProperty("TotalCount")
        private Integer TotalCount;

    }

}
