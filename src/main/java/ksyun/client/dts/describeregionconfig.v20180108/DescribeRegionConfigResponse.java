package ksyun.client.dts.describeregionconfig.v20180108;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeRegionConfigResponse
* @Description DescribeRegionConfig 返回体
*/
@Data
@ToString
public class DescribeRegionConfigResponse extends BaseResponseModel {
    /***/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /***/
        @JsonProperty("RegionConfig")
        private DataDtoRegionConfigDto RegionConfig;

        @Data
        @ToString
        public static class DataDtoRegionConfigDto {
            /***/
            @JsonProperty("SubscriptionKrds")
            private List<DataDtoRegionConfigDtoSubscriptionKrdsDto> SubscriptionKrds;

            @Data
            @ToString
            public static class DataDtoRegionConfigDtoSubscriptionKrdsDto {
                /***/
                @JsonProperty("RegionCode")
                private String RegionCode;

                /***/
                @JsonProperty("RegionName")
                private String RegionName;

                /***/
                @JsonProperty("RegionEnName")
                private String RegionEnName;

                /***/
                @JsonProperty("AreaCode")
                private String AreaCode;

                /***/
                @JsonProperty("AreaName")
                private String AreaName;

                /***/
                @JsonProperty("AreaEnName")
                private String AreaEnName;

            }

            /***/
            @JsonProperty("ClusterKcs")
            private List<DataDtoRegionConfigDtoClusterKcsDto> ClusterKcs;

            @Data
            @ToString
            public static class DataDtoRegionConfigDtoClusterKcsDto {
                /***/
                @JsonProperty("RegionCode")
                private String RegionCode;

                /***/
                @JsonProperty("RegionName")
                private String RegionName;

                /***/
                @JsonProperty("RegionEnName")
                private String RegionEnName;

                /***/
                @JsonProperty("AreaCode")
                private String AreaCode;

                /***/
                @JsonProperty("AreaName")
                private String AreaName;

                /***/
                @JsonProperty("AreaEnName")
                private String AreaEnName;

            }

            /***/
            @JsonProperty("Kpg")
            private List<DataDtoRegionConfigDtoKpgDto> Kpg;

            @Data
            @ToString
            public static class DataDtoRegionConfigDtoKpgDto {
                /***/
                @JsonProperty("RegionCode")
                private String RegionCode;

                /***/
                @JsonProperty("RegionName")
                private String RegionName;

                /***/
                @JsonProperty("RegionEnName")
                private String RegionEnName;

                /***/
                @JsonProperty("AreaCode")
                private String AreaCode;

                /***/
                @JsonProperty("AreaName")
                private String AreaName;

                /***/
                @JsonProperty("AreaEnName")
                private String AreaEnName;

            }

            /***/
            @JsonProperty("PublicPg")
            private List<DataDtoRegionConfigDtoPublicPgDto> PublicPg;

            @Data
            @ToString
            public static class DataDtoRegionConfigDtoPublicPgDto {
                /***/
                @JsonProperty("RegionCode")
                private String RegionCode;

                /***/
                @JsonProperty("RegionName")
                private String RegionName;

                /***/
                @JsonProperty("RegionEnName")
                private String RegionEnName;

                /***/
                @JsonProperty("AreaCode")
                private String AreaCode;

                /***/
                @JsonProperty("AreaName")
                private String AreaName;

                /***/
                @JsonProperty("AreaEnName")
                private String AreaEnName;

            }

            /***/
            @JsonProperty("Krds")
            private List<DataDtoRegionConfigDtoKrdsDto> Krds;

            @Data
            @ToString
            public static class DataDtoRegionConfigDtoKrdsDto {
                /***/
                @JsonProperty("RegionCode")
                private String RegionCode;

                /***/
                @JsonProperty("RegionName")
                private String RegionName;

                /***/
                @JsonProperty("RegionEnName")
                private String RegionEnName;

                /***/
                @JsonProperty("AreaCode")
                private String AreaCode;

                /***/
                @JsonProperty("AreaName")
                private String AreaName;

                /***/
                @JsonProperty("AreaEnName")
                private String AreaEnName;

            }

            /***/
            @JsonProperty("Kmgo")
            private List<DataDtoRegionConfigDtoKmgoDto> Kmgo;

            @Data
            @ToString
            public static class DataDtoRegionConfigDtoKmgoDto {
                /***/
                @JsonProperty("RegionCode")
                private String RegionCode;

                /***/
                @JsonProperty("RegionName")
                private String RegionName;

                /***/
                @JsonProperty("RegionEnName")
                private String RegionEnName;

                /***/
                @JsonProperty("AreaCode")
                private String AreaCode;

                /***/
                @JsonProperty("AreaName")
                private String AreaName;

                /***/
                @JsonProperty("AreaEnName")
                private String AreaEnName;

            }

            /***/
            @JsonProperty("PublicRedis")
            private List<DataDtoRegionConfigDtoPublicRedisDto> PublicRedis;

            @Data
            @ToString
            public static class DataDtoRegionConfigDtoPublicRedisDto {
                /***/
                @JsonProperty("RegionCode")
                private String RegionCode;

                /***/
                @JsonProperty("RegionName")
                private String RegionName;

                /***/
                @JsonProperty("RegionEnName")
                private String RegionEnName;

                /***/
                @JsonProperty("AreaCode")
                private String AreaCode;

                /***/
                @JsonProperty("AreaName")
                private String AreaName;

                /***/
                @JsonProperty("AreaEnName")
                private String AreaEnName;

            }

            /***/
            @JsonProperty("Kcs")
            private List<DataDtoRegionConfigDtoKcsDto> Kcs;

            @Data
            @ToString
            public static class DataDtoRegionConfigDtoKcsDto {
                /***/
                @JsonProperty("RegionCode")
                private String RegionCode;

                /***/
                @JsonProperty("RegionName")
                private String RegionName;

                /***/
                @JsonProperty("RegionEnName")
                private String RegionEnName;

                /***/
                @JsonProperty("AreaCode")
                private String AreaCode;

                /***/
                @JsonProperty("AreaName")
                private String AreaName;

                /***/
                @JsonProperty("AreaEnName")
                private String AreaEnName;

            }

            /***/
            @JsonProperty("Public")
            private List<DataDtoRegionConfigDtoPublicFieldDto> PublicField;

            @Data
            @ToString
            public static class DataDtoRegionConfigDtoPublicFieldDto {
                /***/
                @JsonProperty("RegionCode")
                private String RegionCode;

                /***/
                @JsonProperty("RegionName")
                private String RegionName;

                /***/
                @JsonProperty("RegionEnName")
                private String RegionEnName;

                /***/
                @JsonProperty("AreaCode")
                private String AreaCode;

                /***/
                @JsonProperty("AreaName")
                private String AreaName;

                /***/
                @JsonProperty("AreaEnName")
                private String AreaEnName;

            }

            /***/
            @JsonProperty("PublicMgo")
            private List<DataDtoRegionConfigDtoPublicMgoDto> PublicMgo;

            @Data
            @ToString
            public static class DataDtoRegionConfigDtoPublicMgoDto {
                /***/
                @JsonProperty("RegionCode")
                private String RegionCode;

                /***/
                @JsonProperty("RegionName")
                private String RegionName;

                /***/
                @JsonProperty("RegionEnName")
                private String RegionEnName;

                /***/
                @JsonProperty("AreaCode")
                private String AreaCode;

                /***/
                @JsonProperty("AreaName")
                private String AreaName;

                /***/
                @JsonProperty("AreaEnName")
                private String AreaEnName;

            }

            /***/
            @JsonProperty("PublicClusterRedis")
            private List<DataDtoRegionConfigDtoPublicClusterRedisDto> PublicClusterRedis;

            @Data
            @ToString
            public static class DataDtoRegionConfigDtoPublicClusterRedisDto {
                /***/
                @JsonProperty("RegionCode")
                private String RegionCode;

                /***/
                @JsonProperty("RegionName")
                private String RegionName;

                /***/
                @JsonProperty("RegionEnName")
                private String RegionEnName;

                /***/
                @JsonProperty("AreaCode")
                private String AreaCode;

                /***/
                @JsonProperty("AreaName")
                private String AreaName;

                /***/
                @JsonProperty("AreaEnName")
                private String AreaEnName;

            }

        }

    }

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
