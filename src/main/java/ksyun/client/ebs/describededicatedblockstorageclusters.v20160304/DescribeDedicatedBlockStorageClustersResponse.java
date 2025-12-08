package ksyun.client.ebs.describededicatedblockstorageclusters.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeDedicatedBlockStorageClustersResponse
* @Description DescribeDedicatedBlockStorageClusters 返回体
*/
@Data
@ToString
public class DescribeDedicatedBlockStorageClustersResponse extends BaseResponseModel {
    /***/
    @JsonProperty("requestId")
    private String RequestId;

    /***/
    @JsonProperty("Dbscs")
    private List<DbscsDto> Dbscs;

    @Data
    @ToString
    public static class DbscsDto {
        /***/
        @JsonProperty("DscId")
        private String DscId;

        /***/
        @JsonProperty("DbscName")
        private String DbscName;

        /***/
        @JsonProperty("DbscDescription")
        private String DbscDescription;

        /***/
        @JsonProperty("AvailabilityZone")
        private String AvailabilityZone;

        /***/
        @JsonProperty("DbscStatus")
        private String DbscStatus;

        /***/
        @JsonProperty("DbscType")
        private String DbscType;

        /***/
        @JsonProperty("EbsClusterId")
        private String EbsClusterId;

        /***/
        @JsonProperty("CreateTime")
        private String CreateTime;

        /***/
        @JsonProperty("DedicatedBlockStorageClusterSize")
        private DbscsDtoDedicatedBlockStorageClusterSizeDto DedicatedBlockStorageClusterSize;

        @Data
        @ToString
        public static class DbscsDtoDedicatedBlockStorageClusterSizeDto {
            /***/
            @JsonProperty("AvailableSize")
            private Integer AvailableSize;

            /***/
            @JsonProperty("TotalSize")
            private Integer TotalSize;

            /***/
            @JsonProperty("DeliverySize")
            private Integer DeliverySize;

            /***/
            @JsonProperty("UsedSize")
            private Integer UsedSize;

        }

    }

    /***/
    @JsonProperty("TotalCount")
    private Integer TotalCount;

    /***/
    @JsonProperty("Marker")
    private Integer Marker;

    /***/
    @JsonProperty("MaxResults")
    private Integer MaxResults;

}
