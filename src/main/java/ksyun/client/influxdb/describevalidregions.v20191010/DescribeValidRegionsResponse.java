package ksyun.client.influxdb.describevalidregions.v20191010;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeValidRegionsResponse
* @Description DescribeValidRegions 返回体
*/
@Data
@ToString
public class DescribeValidRegionsResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Data")
    private List<DataDto> Data;

    @Data
    @ToString
    public static class DataDto {
        /***/
        @JsonProperty("RegionCode")
        private String RegionCode;

        /***/
        @JsonProperty("RegionName")
        private String RegionName;

        /***/
        @JsonProperty("AvailabilityZones")
        private List<DataDtoAvailabilityZonesDto> AvailabilityZones;

        @Data
        @ToString
        public static class DataDtoAvailabilityZonesDto {
            /***/
            @JsonProperty("Code")
            private String Code;

            /***/
            @JsonProperty("Name")
            private String Name;

        }

    }

}
