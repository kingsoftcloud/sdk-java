package ksyun.client.vpc.describeavailabilityzones.v20160304;

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
    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**可用区的信息*/
    @JsonProperty("AvailabilityZoneInfo")
    private List<AvailabilityZoneInfoDto> AvailabilityZoneInfo;

    @Data
    @ToString
    public static class AvailabilityZoneInfoDto {
        /**可用区名称*/
        @JsonProperty("AvailabilityZoneName")
        private String AvailabilityZoneName;

    }

}
