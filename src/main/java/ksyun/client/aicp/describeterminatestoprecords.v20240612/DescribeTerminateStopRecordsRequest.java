package ksyun.client.aicp.describeterminatestoprecords.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeTerminateStopRecordsRequest
* @Description 请求参数
*/
@Data
public class DescribeTerminateStopRecordsRequest{
    /**队列ID，与TerminatePolicyIds、NotebookIds不能同时为空*/
    @KsYunField(name="QueueId")
    private String QueueId;

    /**关停策略ID列表，与QueueId、NotebookIds不能同时为空*/
    @KsYunField(name="TerminatePolicyIds",type=2)
    private List<String> TerminatePolicyIdsList;

    /**任务ID列表，与QueueId、TerminatePolicyIds不能同时为空*/
    @KsYunField(name="NotebookIds",type=2)
    private List<String> NotebookIdsList;

    /**查询开始时间，格式：yyyy-MM-dd HH:mm:ss*/
    @KsYunField(name="StartTime")
    private String StartTime;

    /**查询结束时间，格式：yyyy-MM-dd HH:mm:ss*/
    @KsYunField(name="EndTime")
    private String EndTime;

    /**页码*/
    @KsYunField(name="Page")
    private Integer Page;

    /**单次调用可返回的最大条目数量*/
    @KsYunField(name="PageSize")
    private Integer PageSize;

}
