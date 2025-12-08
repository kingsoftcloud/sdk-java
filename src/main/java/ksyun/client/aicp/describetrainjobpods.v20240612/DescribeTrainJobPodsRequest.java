package ksyun.client.aicp.describetrainjobpods.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeTrainJobPodsRequest
* @Description 请求参数
*/
@Data
public class DescribeTrainJobPodsRequest{
    /***/
    @KsYunField(name="Marker")
    private String Marker;

    /***/
    @KsYunField(name="MaxResults")
    private String MaxResults;

    /***/
    @KsYunField(name="TrainJobId")
    private String TrainJobId;

    /***/
    @KsYunField(name="Filter",type=2)
    private List<FilterDto1> FilterList;

    @Data
    @ToString
    public static class FilterDto1 {
        /**可选值：role state*/
        @KsYunField(name="Name")
        private String Name;

        /***/
        @KsYunField(name="Value",type=2)
        private List<String> ValueList;

    }

}
