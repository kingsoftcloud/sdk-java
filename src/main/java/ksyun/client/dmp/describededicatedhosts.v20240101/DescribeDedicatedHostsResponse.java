package ksyun.client.dmp.describededicatedhosts.v20240101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeDedicatedHostsResponse
* @Description DescribeDedicatedHosts 返回体
*/
@Data
@ToString
public class DescribeDedicatedHostsResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /***/
        @JsonProperty("Hosts")
        private List<DataHostsDto> Hosts;

        @Data
        @ToString
        public static class DataHostsDto {
            /***/
            @JsonProperty("HostId")
            private String HostId;

            /***/
            @JsonProperty("HostName")
            private String HostName;

            /***/
            @JsonProperty("Status")
            private String Status;

            /***/
            @JsonProperty("DedicatedClusterId")
            private String DedicatedClusterId;

            /***/
            @JsonProperty("DedicatedClusterName")
            private String DedicatedClusterName;

            /***/
            @JsonProperty("RealResource")
            private DataHostsRealResourceDto RealResource;

            @Data
            @ToString
            public static class DataHostsRealResourceDto {
                /***/
                @JsonProperty("Cpu")
                private Integer Cpu;

                /***/
                @JsonProperty("Memory")
                private Integer Memory;

                /***/
                @JsonProperty("DiskSize")
                private Integer DiskSize;

            }

            /***/
            @JsonProperty("AllocatedResource")
            private DataHostsAllocatedResourceDto AllocatedResource;

            @Data
            @ToString
            public static class DataHostsAllocatedResourceDto {
                /***/
                @JsonProperty("Cpu")
                private Integer Cpu;

                /***/
                @JsonProperty("Memory")
                private Integer Memory;

                /***/
                @JsonProperty("DiskSize")
                private Integer DiskSize;

            }

            /***/
            @JsonProperty("OversoldResource")
            private DataHostsOversoldResourceDto OversoldResource;

            @Data
            @ToString
            public static class DataHostsOversoldResourceDto {
                /***/
                @JsonProperty("Cpu")
                private Integer Cpu;

                /***/
                @JsonProperty("Memory")
                private Integer Memory;

                /***/
                @JsonProperty("DiskSize")
                private Integer DiskSize;

            }

            /***/
            @JsonProperty("CreatedTime")
            private String CreatedTime;

        }

        /***/
        @JsonProperty("TotalCount")
        private Integer TotalCount;

    }

}
