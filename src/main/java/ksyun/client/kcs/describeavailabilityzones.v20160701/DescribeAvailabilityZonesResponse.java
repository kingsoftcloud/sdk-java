package ksyun.client.kcs.describeavailabilityzones.v20160701;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeAvailabilityZonesResponse
* @Description DescribeAvailabilityZones 返回体
*/
@Data
@ToString
public class DescribeAvailabilityZonesResponse extends BaseResponseModel {
    /***/
    @JsonProperty("AvailabilityZoneSet")
    private List<AvailabilityZoneSetDto> AvailabilityZoneSet;

    @Data
    @ToString
    public static class AvailabilityZoneSetDto {
        /***/
        @JsonProperty("Region")
        private String Region;

        /***/
        @JsonProperty("AvailabilityZone")
        private String AvailabilityZone;

    }

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
