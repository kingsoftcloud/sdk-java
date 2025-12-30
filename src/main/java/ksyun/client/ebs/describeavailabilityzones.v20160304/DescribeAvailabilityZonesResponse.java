package ksyun.client.ebs.describeavailabilityzones.v20160304;

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
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("AvailabilityZones")
    private List<String> AvailabilityZones;

}
