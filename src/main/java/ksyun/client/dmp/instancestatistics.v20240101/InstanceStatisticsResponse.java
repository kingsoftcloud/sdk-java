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
        private List<DataTypeStatisticDto> TypeStatistic;

        @Data
        @ToString
        public static class DataTypeStatisticDto {
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
        private List<DataRegionStatisticDto> RegionStatistic;

        @Data
        @ToString
        public static class DataRegionStatisticDto {
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
        private List<DataSourceStatisticDto> SourceStatistic;

        @Data
        @ToString
        public static class DataSourceStatisticDto {
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
        private DataStatusStatisticDto StatusStatistic;

        @Data
        @ToString
        public static class DataStatusStatisticDto {
            /***/
            @JsonProperty("MySQL")
            private DataStatusStatisticMySQLDto MySQL;

            @Data
            @ToString
            public static class DataStatusStatisticMySQLDto {
                /***/
                @JsonProperty("Normal")
                private Integer Normal;

                /***/
                @JsonProperty("Error")
                private Integer Error;

            }

            /***/
            @JsonProperty("Redis")
            private DataStatusStatisticRedisDto Redis;

            @Data
            @ToString
            public static class DataStatusStatisticRedisDto {
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
