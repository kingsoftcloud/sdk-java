package ksyun.client.mongodb.describevalidregion.v20170101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeValidRegionResponse
* @Description DescribeValidRegion 返回体
*/
@Data
@ToString
public class DescribeValidRegionResponse extends BaseResponseModel {
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
        @JsonProperty("regionList")
        private List<DataDtoRegionListDto> RegionList;

        @Data
        @ToString
        public static class DataDtoRegionListDto {
            /***/
            @JsonProperty("areaEnName")
            private String AreaEnName;

            /***/
            @JsonProperty("regionCode")
            private String RegionCode;

            /***/
            @JsonProperty("areaCode")
            private String AreaCode;

            /***/
            @JsonProperty("innerCode")
            private String InnerCode;

            /***/
            @JsonProperty("regionType")
            private Integer RegionType;

            /***/
            @JsonProperty("areaName")
            private String AreaName;

            /***/
            @JsonProperty("azList")
            private List<DataDtoRegionListDtoAzListDto> AzList;

            @Data
            @ToString
            public static class DataDtoRegionListDtoAzListDto {
                /***/
                @JsonProperty("azName")
                private String AzName;

                /***/
                @JsonProperty("azCode")
                private String AzCode;

            }

            /***/
            @JsonProperty("regionName")
            private String RegionName;

            /***/
            @JsonProperty("regionEnName")
            private String RegionEnName;

        }

    }

}
