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
        private List<TypeStatisticDto> TypeStatistic;

        @Data
        @ToString
        public static class TypeStatisticDto {
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
        private List<RegionStatisticDto> RegionStatistic;

        @Data
        @ToString
        public static class RegionStatisticDto {
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
        private List<SourceStatisticDto> SourceStatistic;

        @Data
        @ToString
        public static class SourceStatisticDto {
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
        private StatusStatisticDto StatusStatistic;

        @Data
        @ToString
        public static class StatusStatisticDto {
            /***/
            @JsonProperty("MySQL")
            private MySQLDto MySQL;

            @Data
            @ToString
            public static class MySQLDto {
                /***/
                @JsonProperty("Normal")
                private Integer Normal;

                /***/
                @JsonProperty("Error")
                private Integer Error;

            }

            /***/
            @JsonProperty("Redis")
            private RedisDto Redis;

            @Data
            @ToString
            public static class RedisDto {
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
