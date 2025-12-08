package ksyun.client.kci.describeregions.v20200702;

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
    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Regions")
    private List<RegionsDto> Regions;

    @Data
    @ToString
    public static class RegionsDto {
        /**机房*/
        @JsonProperty("Region")
        private String Region;

        /**机房名称*/
        @JsonProperty("RegionName")
        private String RegionName;

        /**机房下的可用区列表*/
        @JsonProperty("AvailabilityZones")
        private List<String> AvailabilityZones;

    }

}
