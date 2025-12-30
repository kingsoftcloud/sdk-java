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
        private DataRegionConfigDto RegionConfig;

        @Data
        @ToString
        public static class DataRegionConfigDto {
            /***/
            @JsonProperty("SubscriptionKrds")
            private List<DataRegionConfigSubscriptionKrdsDto> SubscriptionKrds;

            @Data
            @ToString
            public static class DataRegionConfigSubscriptionKrdsDto {
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
            private List<DataRegionConfigClusterKcsDto> ClusterKcs;

            @Data
            @ToString
            public static class DataRegionConfigClusterKcsDto {
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
            private List<DataRegionConfigKpgDto> Kpg;

            @Data
            @ToString
            public static class DataRegionConfigKpgDto {
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
            private List<DataRegionConfigPublicPgDto> PublicPg;

            @Data
            @ToString
            public static class DataRegionConfigPublicPgDto {
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
            private List<DataRegionConfigKrdsDto> Krds;

            @Data
            @ToString
            public static class DataRegionConfigKrdsDto {
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
            private List<DataRegionConfigKmgoDto> Kmgo;

            @Data
            @ToString
            public static class DataRegionConfigKmgoDto {
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
            private List<DataRegionConfigPublicRedisDto> PublicRedis;

            @Data
            @ToString
            public static class DataRegionConfigPublicRedisDto {
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
            private List<DataRegionConfigKcsDto> Kcs;

            @Data
            @ToString
            public static class DataRegionConfigKcsDto {
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
            private List<DataRegionConfigPublicFieldDto> PublicField;

            @Data
            @ToString
            public static class DataRegionConfigPublicFieldDto {
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
            private List<DataRegionConfigPublicMgoDto> PublicMgo;

            @Data
            @ToString
            public static class DataRegionConfigPublicMgoDto {
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
            private List<DataRegionConfigPublicClusterRedisDto> PublicClusterRedis;

            @Data
            @ToString
            public static class DataRegionConfigPublicClusterRedisDto {
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
