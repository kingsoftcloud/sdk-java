package ksyun.client.aicp.describeinferencepods.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeInferencePodsRequest
* @Description 请求参数
*/
@Data
public class DescribeInferencePodsRequest{
    /**推理任务ID*/
    @KsYunField(name="InferenceId")
    private String InferenceId;

    /**过滤器*/
    @KsYunField(name="Filter",type=1)
    private List<FilterDto> FilterList;

    @Data
    @ToString
    public static class FilterDto {
        /**过滤条件*/
        @KsYunField(name="Name")
        private String Name;

        /**条件值*/
        @KsYunField(name="Value",type=1)
        private List<String> ValueList;

    }

    /**页码*/
    @KsYunField(name="Page")
    private Integer Page;

    /**单次调用返回最大条目个数*/
    @KsYunField(name="PageSize")
    private Integer PageSize;

}
