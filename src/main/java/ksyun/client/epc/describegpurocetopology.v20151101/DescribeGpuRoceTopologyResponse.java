package ksyun.client.epc.describegpurocetopology.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeGpuRoceTopologyResponse
* @Description DescribeGpuRoceTopology 返回体
*/
@Data
@ToString
public class DescribeGpuRoceTopologyResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("DescribePorts")
    private DescribePortsDto DescribePorts;

    @Data
    @ToString
    public static class DescribePortsDto {
        /***/
        @JsonProperty("LeafDatas")
        private List<DescribePortsLeafDatasDto> LeafDatas;

        @Data
        @ToString
        public static class DescribePortsLeafDatasDto {
            /***/
            @JsonProperty("SpineName")
            private String SpineName;

            /***/
            @JsonProperty("LeafName")
            private String LeafName;

            /***/
            @JsonProperty("SpinePort")
            private String SpinePort;

            /***/
            @JsonProperty("LeafPort")
            private String LeafPort;

        }

        /***/
        @JsonProperty("CoreDatas")
        private List<DescribePortsCoreDatasDto> CoreDatas;

        @Data
        @ToString
        public static class DescribePortsCoreDatasDto {
            /***/
            @JsonProperty("CoreName")
            private String CoreName;

            /***/
            @JsonProperty("SpineName")
            private String SpineName;

            /***/
            @JsonProperty("CorePort")
            private String CorePort;

            /***/
            @JsonProperty("SpinePort")
            private String SpinePort;

        }

        /**服务器信息*/
        @JsonProperty("ServerDatas")
        private List<DescribePortsServerDatasDto> ServerDatas;

        @Data
        @ToString
        public static class DescribePortsServerDatasDto {
            /**服务器sn*/
            @JsonProperty("Sn")
            private String Sn;

            /**实例ID*/
            @JsonProperty("HostId")
            private String HostId;

            /**交换机名称*/
            @JsonProperty("LeafName")
            private String LeafName;

            /**交换机端口*/
            @JsonProperty("LeafPort")
            private String LeafPort;

            /**Roce计算集群名称*/
            @JsonProperty("RoceCluster")
            private String RoceCluster;

            /**Roce计算集群Group*/
            @JsonProperty("RoceClusterGroup")
            private String RoceClusterGroup;

            /**SRoce集群名称*/
            @JsonProperty("SRoceCluster")
            private String SRoceCluster;

        }

    }

}
