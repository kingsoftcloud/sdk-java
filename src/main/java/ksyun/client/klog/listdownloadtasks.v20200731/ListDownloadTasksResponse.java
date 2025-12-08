package ksyun.client.klog.listdownloadtasks.v20200731;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ListDownloadTasksResponse
* @Description ListDownloadTasks 返回体
*/
@Data
@ToString
public class ListDownloadTasksResponse extends BaseResponseModel {
    /**数据总量*/
    @JsonProperty("Total")
    private Integer Total;

    /**返回行数*/
    @JsonProperty("Count")
    private Integer Count;

    /***/
    @JsonProperty("Data")
    private List<DataDto> Data;

    @Data
    @ToString
    public static class DataDto {
        /**工程名称*/
        @JsonProperty("ProjectName")
        private String ProjectName;

        /**下载任务ID*/
        @JsonProperty("DownloadTaskId")
        private String DownloadTaskId;

        /**日志池名称*/
        @JsonProperty("LogPoolNames")
        private String LogPoolNames;

        /**下载任务状态
(starting | running | stopping | done | expired)*/
        @JsonProperty("Status")
        private String Status;

        /**用户ID*/
        @JsonProperty("AccountId")
        private String AccountId;

        /**开始时间*/
        @JsonProperty("From")
        private String From;

        /**结束时间*/
        @JsonProperty("To")
        private String To;

        /**下载数据行数*/
        @JsonProperty("Count")
        private String Count;

        /**下载数据大小（Byte）*/
        @JsonProperty("Size")
        private Integer Size;

        /**下载链接*/
        @JsonProperty("DownloadUrl")
        private String DownloadUrl;

        /**日志过滤语句*/
        @JsonProperty("Query")
        private String Query;

        /**创建时间*/
        @JsonProperty("CreatedAt")
        private Integer CreatedAt;

    }

}
