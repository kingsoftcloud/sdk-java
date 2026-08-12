package ksyun.client.kpfs.describeclusterinfo.v20240930;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeClusterInfoResponse
* @Description DescribeClusterInfo 返回体
*/
@Data
@ToString
public class DescribeClusterInfoResponse extends BaseResponseModel {

    /**唯一请求ID，每次请求都会返回。*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**存储集群信息。*/
    @JsonProperty("Data")
    private List<DataDto> Data;

    @Data
    @ToString
    public static class DataDto {
        /**地域。*/
        @JsonProperty("Region")
        private String Region;

        /**可用区。*/
        @JsonProperty("AvailZone")
        private String AvailZone;

        /**存储类型（数组，可包含多个存储类型）。*/
        @JsonProperty("StoreClasses")
        private List<String> StoreClasses;

        /**存储池类型。*/
        @JsonProperty("StorePoolType")
        private String StorePoolType;

        /**存储RoCE集群名称，仅性能Ⅰ型、性能Ⅱ型支持。*/
        @JsonProperty("SRoceCluster")
        private String SRoceCluster;

        /**存储池Code，仅性能Ⅰ型、性能Ⅱ型支持；创建性能型文件系统时需传入此字段。*/
        @JsonProperty("ClusterCode")
        private String ClusterCode;

    }

}
