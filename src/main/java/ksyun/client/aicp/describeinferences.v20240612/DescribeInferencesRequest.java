package ksyun.client.aicp.describeinferences.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeInferencesRequest
* @Description 请求参数
*/
@Data
public class DescribeInferencesRequest{
    /**多个模型在线服务的ID*/
    @KsYunField(name="InferenceId",type=1)
    private List<String> InferenceIdList;

    /**筛选Filter*/
    @KsYunField(name="Filter",type=1)
    private List<FilterDto> FilterList;

    @Data
    @ToString
    public static class FilterDto {
        /**有效值：
- status，服务状态 
- queue-id，队列ID
- resource-pool-id，资源组ID
- gpu-type，GPU类型*/
        @KsYunField(name="Name")
        private String Name;

        /***/
        @KsYunField(name="Value",type=1)
        private List<String> ValueList;

    }

    /**单次调用可返回的最大条目数量*/
    @KsYunField(name="PageSize")
    private Integer PageSize;

    /**页码*/
    @KsYunField(name="Page")
    private Integer Page;

}
