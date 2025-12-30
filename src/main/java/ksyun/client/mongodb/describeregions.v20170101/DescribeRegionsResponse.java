package ksyun.client.mongodb.describeregions.v20170101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeRegionsResponse
* @Description DescribeRegions 返回体
*/
@Data
@ToString
public class DescribeRegionsResponse extends BaseResponseModel {

    /***/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /***/
        @JsonProperty("Regions")
        private List<DataRegionsDto> Regions;

        @Data
        @ToString
        public static class DataRegionsDto {
            /***/
            @JsonProperty("Code")
            private String Code;

            /***/
            @JsonProperty("Name")
            private String Name;

            /***/
            @JsonProperty("AvailabilityZones")
            private List<DataRegionsAvailabilityZonesDto> AvailabilityZones;

            @Data
            @ToString
            public static class DataRegionsAvailabilityZonesDto {
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
