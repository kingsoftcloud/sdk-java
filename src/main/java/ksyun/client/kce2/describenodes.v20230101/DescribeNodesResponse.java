package ksyun.client.kce2.describenodes.v20230101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeNodesResponse
* @Description DescribeNodes 返回体
*/
@Data
@ToString
public class DescribeNodesResponse extends BaseResponseModel {
    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**返回数据*/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /**每页最大数*/
        @JsonProperty("MaxResults")
        private Integer MaxResults;

        /**游标值*/
        @JsonProperty("Marker")
        private Integer Marker;

        /**总数*/
        @JsonProperty("TotalCount")
        private Integer TotalCount;

    }

    /**节点列表*/
    @JsonProperty("InstanceSet")
    private InstanceSetDto InstanceSet;

    @Data
    @ToString
    public static class InstanceSetDto {
    }

}
