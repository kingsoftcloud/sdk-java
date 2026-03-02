package ksyun.client.aicp.describenotebooks.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeNotebooksRequest
* @Description 请求参数
*/
@Data
public class DescribeNotebooksRequest{
    /**多个开发任务的ID*/
    @KsYunField(name="NotebookId",type=1)
    private List<String> NotebookIdList;

    /**开发任务名称*/
    @KsYunField(name="Name")
    private String Name;

    /**页码*/
    @KsYunField(name="Page")
    private Integer Page;

    /**单次调用可返回的最大条目数量*/
    @KsYunField(name="PageSize")
    private Integer PageSize;

    /**条件过滤*/
    @KsYunField(name="Filter",type=1)
    private List<FilterDto> FilterList;

    @Data
    @ToString
    public static class FilterDto {
        /**过滤条件 notebook-status（开发任务状态）*/
        @KsYunField(name="Name")
        private String Name;

        /**值*/
        @KsYunField(name="Value",type=1)
        private List<String> ValueList;

    }

    /**队列ID*/
    @KsYunField(name="QueueId")
    private String QueueId;

}
