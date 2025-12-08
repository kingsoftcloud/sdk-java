package ksyun.client.dmp.describededicatedclusters.v20240101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeDedicatedClustersResponse
* @Description DescribeDedicatedClusters 返回体
*/
@Data
@ToString
public class DescribeDedicatedClustersResponse extends BaseResponseModel {
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
        @JsonProperty("TotalCount")
        private Integer TotalCount;

        /***/
        @JsonProperty("DedicatedClusters")
        private List<DedicatedClustersDto> DedicatedClusters;

        @Data
        @ToString
        public static class DedicatedClustersDto {
            /***/
            @JsonProperty("DedicatedClusterId")
            private String DedicatedClusterId;

            /***/
            @JsonProperty("DedicatedClusterName")
            private String DedicatedClusterName;

            /***/
            @JsonProperty("Region")
            private String Region;

            /***/
            @JsonProperty("Status")
            private String Status;

            /***/
            @JsonProperty("DatabaseType")
            private String DatabaseType;

            /***/
            @JsonProperty("HostNum")
            private Integer HostNum;

            /***/
            @JsonProperty("InstanceNum")
            private Integer InstanceNum;

            /***/
            @JsonProperty("KceClusterId")
            private String KceClusterId;

            /***/
            @JsonProperty("Ratio")
            private RatioDto Ratio;

            @Data
            @ToString
            public static class RatioDto {
                /***/
                @JsonProperty("MemRatio")
                private Integer MemRatio;

                /***/
                @JsonProperty("DiskRatio")
                private Integer DiskRatio;

                /***/
                @JsonProperty("CpuRatio")
                private Integer CpuRatio;

            }

            /***/
            @JsonProperty("CreatedTime")
            private String CreatedTime;

        }

    }

}
