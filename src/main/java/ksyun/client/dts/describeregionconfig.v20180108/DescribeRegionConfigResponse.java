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
        private RegionConfigDto RegionConfig;

        @Data
        @ToString
        public static class RegionConfigDto {
            /***/
            @JsonProperty("SubscriptionKrds")
            private List<SubscriptionKrdsDto> SubscriptionKrds;

            @Data
            @ToString
            public static class SubscriptionKrdsDto {
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
            private List<ClusterKcsDto> ClusterKcs;

            @Data
            @ToString
            public static class ClusterKcsDto {
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
            private List<KpgDto> Kpg;

            @Data
            @ToString
            public static class KpgDto {
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
            private List<PublicPgDto> PublicPg;

            @Data
            @ToString
            public static class PublicPgDto {
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
            private List<KrdsDto> Krds;

            @Data
            @ToString
            public static class KrdsDto {
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
            private List<KmgoDto> Kmgo;

            @Data
            @ToString
            public static class KmgoDto {
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
            private List<PublicRedisDto> PublicRedis;

            @Data
            @ToString
            public static class PublicRedisDto {
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
            private List<KcsDto> Kcs;

            @Data
            @ToString
            public static class KcsDto {
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
            private List<PublicFieldDto> PublicField;

            @Data
            @ToString
            public static class PublicFieldDto {
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
            private List<PublicMgoDto> PublicMgo;

            @Data
            @ToString
            public static class PublicMgoDto {
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
            private List<PublicClusterRedisDto> PublicClusterRedis;

            @Data
            @ToString
            public static class PublicClusterRedisDto {
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
