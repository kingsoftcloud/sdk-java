package ksyun.client.aicp.describetrainjobs.v20251212;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeTrainJobsRequest
* @Description 请求参数
*/
@Data
public class DescribeTrainJobsRequest{
    /**多个训练任务的ID*/
    @KsYunField(name="TrainJobId",type=1)
    private List<String> TrainJobIdList;

    /**筛选Filter*/
    @KsYunField(name="Filter",type=1)
    private List<FilterDto> FilterList;

    @Data
    @ToString
    public static class FilterDto {
        /**有效值：
- resource-group-id，资源组的ID
- train-job-status，训练任务状态*/
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

    /**训练任务名称(支持模糊搜索)*/
    @KsYunField(name="TrainJobName")
    private String TrainJobName;

}
