package ksyun.client.rabbitmq.describevalidregion.v20191017;

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
    @JsonProperty("Code")
    private String Code;

    /***/
    @JsonProperty("Message")
    private String Message;

    /***/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /***/
        @JsonProperty("Regions")
        private List<DataDtoRegionsDto> Regions;

        @Data
        @ToString
        public static class DataDtoRegionsDto {
            /***/
            @JsonProperty("Name")
            private String Name;

            /***/
            @JsonProperty("Code")
            private String Code;

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

            /***/
            @JsonProperty("AvailabilityZones")
            private List<DataDtoRegionsDtoAvailabilityZonesDto> AvailabilityZones;

            @Data
            @ToString
            public static class DataDtoRegionsDtoAvailabilityZonesDto {
                /***/
                @JsonProperty("Code")
                private String Code;

                /***/
                @JsonProperty("Name")
                private String Name;

            }

        }

    }

}
