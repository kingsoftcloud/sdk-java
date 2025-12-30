package ksyun.client.kce.describenodepoolsummary.v20190806;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeNodePoolSummaryResponse
* @Description DescribeNodePoolSummary 返回体
*/
@Data
@ToString
public class DescribeNodePoolSummaryResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**节点池信息*/
    @JsonProperty("NodePools")
    private List<NodePoolsDto> NodePools;

    @Data
    @ToString
    public static class NodePoolsDto {
        /**节点池ID*/
        @JsonProperty("NodePoolId")
        private String NodePoolId;

        /**节点池名称*/
        @JsonProperty("NodePoolName")
        private String NodePoolName;

    }

}
