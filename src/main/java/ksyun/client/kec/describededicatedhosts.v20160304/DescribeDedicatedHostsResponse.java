package ksyun.client.kec.describededicatedhosts.v20160304;

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
    @JsonProperty("DedicatedHostSet")
    private List<DedicatedHostSetDto> DedicatedHostSet;

    @Data
    @ToString
    public static class DedicatedHostSetDto {
        /***/
        @JsonProperty("DedicatedHostId")
        private String DedicatedHostId;

        /***/
        @JsonProperty("DedicatedHostName")
        private String DedicatedHostName;

        /***/
        @JsonProperty("State")
        private String State;

        /***/
        @JsonProperty("TotalCpu")
        private Integer TotalCpu;

        /***/
        @JsonProperty("OriCpu")
        private Integer OriCpu;

        /***/
        @JsonProperty("AvailableCpu")
        private Integer AvailableCpu;

        /***/
        @JsonProperty("TotalMemory")
        private Integer TotalMemory;

        /***/
        @JsonProperty("AvailableMemory")
        private Integer AvailableMemory;

        /***/
        @JsonProperty("TotalDatadisk")
        private Integer TotalDatadisk;

        /***/
        @JsonProperty("AvailableDatadisk")
        private Integer AvailableDatadisk;

        /***/
        @JsonProperty("Instances")
        private List<String> Instances;

        /***/
        @JsonProperty("CreateDate")
        private String CreateDate;

        /***/
        @JsonProperty("AvailabilityZone")
        private String AvailabilityZone;

        /***/
        @JsonProperty("AvailabilityZoneName")
        private String AvailabilityZoneName;

        /***/
        @JsonProperty("Model")
        private String Model;

        /***/
        @JsonProperty("ProjectId")
        private Integer ProjectId;

        /**存储集群模式
Mixed：混合模式；
Public：公共集群；
Exclusive：专属块存储集群*/
        @JsonProperty("EbsClusterMode")
        private String EbsClusterMode;

    }

}
