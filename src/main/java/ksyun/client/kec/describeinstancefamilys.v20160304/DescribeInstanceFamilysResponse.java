package ksyun.client.kec.describeinstancefamilys.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeInstanceFamilysResponse
* @Description DescribeInstanceFamilys 返回体
*/
@Data
@ToString
public class DescribeInstanceFamilysResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("InstanceFamilySet")
    private List<InstanceFamilySetDto> InstanceFamilySet;

    @Data
    @ToString
    public static class InstanceFamilySetDto {
        /***/
        @JsonProperty("AvailabilityZoneSet")
        private List<InstanceFamilySetAvailabilityZoneSetDto> AvailabilityZoneSet;

        @Data
        @ToString
        public static class InstanceFamilySetAvailabilityZoneSetDto {
            /***/
            @JsonProperty("AzCode")
            private String AzCode;

        }

        /***/
        @JsonProperty("InstanceFamilyName")
        private String InstanceFamilyName;

        /***/
        @JsonProperty("InstanceFamily")
        private String InstanceFamily;

    }

}
