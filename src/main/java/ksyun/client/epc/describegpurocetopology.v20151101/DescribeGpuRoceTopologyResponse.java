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
        private List<LeafDatasDto> LeafDatas;

        @Data
        @ToString
        public static class LeafDatasDto {
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
        private List<CoreDatasDto> CoreDatas;

        @Data
        @ToString
        public static class CoreDatasDto {
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

    }

}
