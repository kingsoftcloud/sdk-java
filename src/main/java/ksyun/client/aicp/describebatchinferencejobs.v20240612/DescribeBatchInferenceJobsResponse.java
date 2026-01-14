package ksyun.client.aicp.describebatchinferencejobs.v20240612;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeBatchInferenceJobsResponse
* @Description DescribeBatchInferenceJobs 返回体
*/
@Data
@ToString
public class DescribeBatchInferenceJobsResponse extends BaseResponseModel {

    /**总数*/
    @JsonProperty("TotalCount")
    private Integer TotalCount;

    /**页码，从1开始*/
    @JsonProperty("Marker")
    private Integer Marker;

    /**页长*/
    @JsonProperty("MaxResults")
    private Integer MaxResults;

    /***/
    @JsonProperty("Data")
    private List<DataDto> Data;

    @Data
    @ToString
    public static class DataDto {
        /***/
        @JsonProperty("BatchId")
        private String BatchId;

        /***/
        @JsonProperty("JobName")
        private String JobName;

        /***/
        @JsonProperty("JobDesc")
        private String JobDesc;

        /**INIT("init", "初始化"),
        QUEUING("queuing", "排队中"),
        RUNNING("running", "运行中"),
        TERMINATED("terminated", "已终止"),
        COMPLETED("completed", "已完成"),
        FAILED("failed", "失败"),
TIMEOUT("timeout", "已超时");*/
        @JsonProperty("Status")
        private String Status;

        /**创建时间戳，毫秒*/
        @JsonProperty("CreateTime")
        private Long CreateTime;

        /**创建人*/
        @JsonProperty("CreateUserName")
        private String CreateUserName;

        /***/
        @JsonProperty("JobMetadata")
        private DataJobMetadataDto JobMetadata;

        @Data
        @ToString
        public static class DataJobMetadataDto {
            /**请求总数，可以为空*/
            @JsonProperty("Total")
            private Integer Total;

            /**已执行数，可以为空*/
            @JsonProperty("Executed")
            private Integer Executed;

            /***/
            @JsonProperty("ApikeyId")
            private String ApikeyId;

            /**模型名称*/
            @JsonProperty("Model")
            private String Model;

            /**超时时间*/
            @JsonProperty("ExecuteTimeoutMs")
            private Long ExecuteTimeoutMs;

            /**文件类型：user_ks3 用户ks3, upload_ks3 用户上传下载文件。*/
            @JsonProperty("InputDataType")
            private String InputDataType;

            /***/
            @JsonProperty("Ks3Region")
            private String Ks3Region;

            /***/
            @JsonProperty("InBucket")
            private String InBucket;

            /***/
            @JsonProperty("OutBucket")
            private String OutBucket;

            /***/
            @JsonProperty("InObjectName")
            private String InObjectName;

            /***/
            @JsonProperty("OutObjectName")
            private String OutObjectName;

            /**FileNotAllowed、FileNotReadable、InternalError*/
            @JsonProperty("FailReasonCode")
            private String FailReasonCode;

            /**- 上传文件/ks3：输入文件未通过初始化检验；
- ks3：权限变动/文件更改或删除；
- 系统异常；*/
            @JsonProperty("FailReason")
            private String FailReason;

            /**- 您的输入文件格式或大小不符合规定，请您重新创建任务并上传文件。
- 无法获取到文件，文件不存在或无权限访问文件。
- 系统异常，请您尝试重新创建任务。*/
            @JsonProperty("FailReasonDesc")
            private String FailReasonDesc;

        }

    }

}
