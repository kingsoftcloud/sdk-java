package ksyun.client.epc.describesoavailableresource.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeSoAvailableResourceResponse
* @Description DescribeSoAvailableResource 返回体
*/
@Data
@ToString
public class DescribeSoAvailableResourceResponse extends BaseResponseModel {

    /***/
    @JsonProperty("AvailableZones")
    private List<AvailableZonesDto> AvailableZones;

    @Data
    @ToString
    public static class AvailableZonesDto {
        /***/
        @JsonProperty("AvailableResources")
        private List<AvailableZonesAvailableResourcesDto> AvailableResources;

        @Data
        @ToString
        public static class AvailableZonesAvailableResourcesDto {
            /***/
            @JsonProperty("SupportedResources")
            private List<AvailableZonesAvailableResourcesSupportedResourcesDto> SupportedResources;

            @Data
            @ToString
            public static class AvailableZonesAvailableResourcesSupportedResourcesDto {
                /**Available*/
                @JsonProperty("Status")
                private String Status;

                /**SO-GM404-I*/
                @JsonProperty("Value")
                private String Value;

            }

            /**InstanceType*/
            @JsonProperty("Type")
            private String Type;

        }

        /**cn-beijing-6*/
        @JsonProperty("RegionId")
        private String RegionId;

        /**Available*/
        @JsonProperty("Status")
        private String Status;

        /**cn-beijing-6a*/
        @JsonProperty("ZoneId")
        private String ZoneId;

    }

}
