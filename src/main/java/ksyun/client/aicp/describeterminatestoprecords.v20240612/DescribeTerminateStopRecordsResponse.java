package ksyun.client.aicp.describeterminatestoprecords.v20240612;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeTerminateStopRecordsResponse
* @Description DescribeTerminateStopRecords 返回体
*/
@Data
@ToString
public class DescribeTerminateStopRecordsResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**记录总数*/
    @JsonProperty("TotalCount")
    private Integer TotalCount;

    /**页码*/
    @JsonProperty("Page")
    private Integer Page;

    /**单次调用可返回的最大条目数量*/
    @JsonProperty("PageSize")
    private Integer PageSize;

    /**关停执行记录列表*/
    @JsonProperty("Records")
    private List<RecordsDto> Records;

    @Data
    @ToString
    public static class RecordsDto {
        /**关停策略ID*/
        @JsonProperty("TerminatePolicyId")
        private String TerminatePolicyId;

        /**开发任务名称*/
        @JsonProperty("NotebookName")
        private String NotebookName;

        /**开发任务创建者*/
        @JsonProperty("CreateUser")
        private String CreateUser;

        /**开发任务ID*/
        @JsonProperty("NotebookId")
        private String NotebookId;

        /**仅代表是否成功触发清理；true：成功开始清理任务；false: 清理任务失败*/
        @JsonProperty("Result")
        private Boolean Result;

        /**success代表执行成功，非success代表失败的异常信息*/
        @JsonProperty("Message")
        private String Message;

        /**创建时间*/
        @JsonProperty("CreateTime")
        private String CreateTime;

    }

}
