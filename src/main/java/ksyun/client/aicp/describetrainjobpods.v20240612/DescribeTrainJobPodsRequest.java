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
    /**页码，后续废弃，改用Page*/
    @KsYunField(name="Marker")
    private String Marker;

    /**单次调用返回的最大条目，后续废弃，改用PageSize*/
    @KsYunField(name="MaxResults")
    private String MaxResults;

    /**训练任务ID*/
    @KsYunField(name="TrainJobId")
    private String TrainJobId;

    /**筛选器*/
    @KsYunField(name="Filter",type=1)
    private List<FilterDto> FilterList;

    @Data
    @ToString
    public static class FilterDto {
        /**筛选项名称，可选值:
- role 角色
- state 状态*/
        @KsYunField(name="Name")
        private String Name;

        /**多个筛选项的值*/
        @KsYunField(name="Value",type=1)
        private List<String> ValueList;

    }

}
