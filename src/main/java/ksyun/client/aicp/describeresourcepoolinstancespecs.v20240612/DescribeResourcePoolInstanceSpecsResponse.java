package ksyun.client.aicp.describeresourcepoolinstancespecs.v20240612;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeResourcePoolInstanceSpecsResponse
* @Description DescribeResourcePoolInstanceSpecs 返回体
*/
@Data
@ToString
public class DescribeResourcePoolInstanceSpecsResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**节点规格统计列表*/
    @JsonProperty("NodeSpecs")
    private List<NodeSpecsDto> NodeSpecs;

    @Data
    @ToString
    public static class NodeSpecsDto {
        /**GPU型号（CPU机型为空）*/
        @JsonProperty("GPUModel")
        private String GPUModel;

        /**裸金属服务器子机型/具体型号*/
        @JsonProperty("HostType")
        private String HostType;

        /**每个节点的GPU卡数*/
        @JsonProperty("GPUCount")
        private Integer GPUCount;

        /**CPU核数*/
        @JsonProperty("CPUCores")
        private Integer CPUCores;

        /**内存规格描述*/
        @JsonProperty("Memory")
        private String Memory;

        /**该规格节点总数*/
        @JsonProperty("TotalNodes")
        private Integer TotalNodes;

        /**可选节点数（状态正常且未加入其他物理队列）*/
        @JsonProperty("AvailableNodes")
        private Integer AvailableNodes;

    }

}
