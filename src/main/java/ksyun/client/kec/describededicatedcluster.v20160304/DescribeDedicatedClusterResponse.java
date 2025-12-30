package ksyun.client.kec.describededicatedcluster.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeDedicatedClusterResponse
* @Description DescribeDedicatedCluster 返回体
*/
@Data
@ToString
public class DescribeDedicatedClusterResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("DedicatedClustersSet")
    private DedicatedClustersSetDto DedicatedClustersSet;

    @Data
    @ToString
    public static class DedicatedClustersSetDto {
        /***/
        @JsonProperty("DedicatedClusterId")
        private String DedicatedClusterId;

        /***/
        @JsonProperty("DedicatedClusterName")
        private String DedicatedClusterName;

        /***/
        @JsonProperty("CreationDate")
        private String CreationDate;

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
        @JsonProperty("DedicatedHostsSet")
        private List<DedicatedClustersSetDedicatedHostsSetDto> DedicatedHostsSet;

        @Data
        @ToString
        public static class DedicatedClustersSetDedicatedHostsSetDto {
            /***/
            @JsonProperty("DedicatedHostId")
            private String DedicatedHostId;

            /***/
            @JsonProperty("DedicatedHostName")
            private String DedicatedHostName;

        }

    }

}
