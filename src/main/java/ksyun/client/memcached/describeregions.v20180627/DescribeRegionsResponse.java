package ksyun.client.memcached.describeregions.v20180627;

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
    @JsonProperty("RegionSet")
    private List<RegionSetDto> RegionSet;

    @Data
    @ToString
    public static class RegionSetDto {
        /***/
        @JsonProperty("RegionName")
        private String RegionName;

        /***/
        @JsonProperty("Region")
        private String Region;

    }

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
