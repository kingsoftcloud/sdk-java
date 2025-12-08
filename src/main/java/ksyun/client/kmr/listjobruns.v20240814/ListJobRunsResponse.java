package ksyun.client.kmr.listjobruns.v20240814;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ListJobRunsResponse
* @Description ListJobRuns 返回体
*/
@Data
@ToString
public class ListJobRunsResponse extends BaseResponseModel {
    /**响应状态码*/
    @JsonProperty("Code")
    private Integer Code;

    /**响应消息*/
    @JsonProperty("Message")
    private String Message;

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /***/
        @JsonProperty("JobRuns")
        private List<JobRunsDto> JobRuns;

        @Data
        @ToString
        public static class JobRunsDto {
            /**SparkApp ID*/
            @JsonProperty("AppId")
            private String AppId;

            /**作业名称*/
            @JsonProperty("AppName")
            private String AppName;

            /**作业状态*/
            @JsonProperty("AppStatus")
            private String AppStatus;

            /**作业ID*/
            @JsonProperty("jobRunId")
            private String JobRunId;

            /**作业提交时间*/
            @JsonProperty("SubmitTime")
            private String SubmitTime;

            /**作业开始运行时间*/
            @JsonProperty("StartTime")
            private String StartTime;

            /**作业结束时间*/
            @JsonProperty("EndTime")
            private String EndTime;

            /**Spark版本*/
            @JsonProperty("ReleaseVersion")
            private String ReleaseVersion;

            /**作业使用资源
单位：CU*/
            @JsonProperty("UsageResource")
            private Integer UsageResource;

        }

        /**查询作业数量*/
        @JsonProperty("MaxResults")
        private Integer MaxResults;

        /**工作空间作业总数*/
        @JsonProperty("TotalCount")
        private Integer TotalCount;

    }

}
