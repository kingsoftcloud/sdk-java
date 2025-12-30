package ksyun.client.kec.describedataguardcapacity.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeDataGuardCapacityResponse
* @Description DescribeDataGuardCapacity 返回体
*/
@Data
@ToString
public class DescribeDataGuardCapacityResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("DataGuardCapacity")
    private DataGuardCapacityDto DataGuardCapacity;

    @Data
    @ToString
    public static class DataGuardCapacityDto {
        /***/
        @JsonProperty("Region")
        private String Region;

        /***/
        @JsonProperty("Capacity")
        private Integer Capacity;

    }

    /***/
    @JsonProperty("DataGuardCapacitySet")
    private List<DataGuardCapacitySetDto> DataGuardCapacitySet;

    @Data
    @ToString
    public static class DataGuardCapacitySetDto {
        /***/
        @JsonProperty("DomainTypeCapacity")
        private Integer DomainTypeCapacity;

        /***/
        @JsonProperty("HostTypeCapacity")
        private Integer HostTypeCapacity;

    }

}
