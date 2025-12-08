package ksyun.client.kmr.listflinkjobruns.v20240814;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ListFlinkJobRunsResponse
* @Description ListFlinkJobRuns 返回体
*/
@Data
@ToString
public class ListFlinkJobRunsResponse extends BaseResponseModel {
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
        /**每页条数*/
        @JsonProperty("MaxResults")
        private Integer MaxResults;

        /**符合查询条件作业总数量*/
        @JsonProperty("TotalCount")
        private Integer TotalCount;

        /***/
        @JsonProperty("JobRuns")
        private List<DataDtoJobRunsDto> JobRuns;

        @Data
        @ToString
        public static class DataDtoJobRunsDto {
            /**作业ID*/
            @JsonProperty("JobRunId")
            private String JobRunId;

            /**工作空间ID*/
            @JsonProperty("WorkspaceId")
            private String WorkspaceId;

            /**作业名称*/
            @JsonProperty("Name")
            private String Name;

            /**作业运行状态*/
            @JsonProperty("State")
            private String State;

            /**作业运行错误原因*/
            @JsonProperty("ErrorReason")
            private String ErrorReason;

            /**作业提交时间*/
            @JsonProperty("SubmitTime")
            private String SubmitTime;

            /**作业开始时间*/
            @JsonProperty("StartTime")
            private String StartTime;

            /**作业结束时间*/
            @JsonProperty("EndTime")
            private String EndTime;

            /**作业运行时长
单位：秒*/
            @JsonProperty("RunningTime")
            private Integer RunningTime;

            /**作业WebUI链接*/
            @JsonProperty("WebUI")
            private String WebUI;

            /**Flink作业日志链接*/
            @JsonProperty("FlinkLog")
            private String FlinkLog;

            /**Flink版本*/
            @JsonProperty("ReleaseVersion")
            private String ReleaseVersion;

            /***/
            @JsonProperty("FlinkDeploymentData")
            private DataDtoJobRunsDtoFlinkDeploymentDataDto FlinkDeploymentData;

            @Data
            @ToString
            public static class DataDtoJobRunsDtoFlinkDeploymentDataDto {
                /**作业名称*/
                @JsonProperty("Name")
                private String Name;

                /**作业使用的镜像*/
                @JsonProperty("Image")
                private String Image;

                /**Flink类型*/
                @JsonProperty("UpgradeMode")
                private String UpgradeMode;

                /**Flink作业的Job核数*/
                @JsonProperty("JobCores")
                private Integer JobCores;

                /**Flink作业的Job内存*/
                @JsonProperty("JobMemory")
                private String JobMemory;

                /**Flink作业的Task核数
*/
                @JsonProperty("TaskCores")
                private Integer TaskCores;

                /**Flink作业的Task内存*/
                @JsonProperty("TaskMemory")
                private String TaskMemory;

                /**Flink作业的Task数量*/
                @JsonProperty("NumTasks")
                private Integer NumTasks;

                /**启动类*/
                @JsonProperty("EntryClass")
                private String EntryClass;

                /**JAR作业URL全路径*/
                @JsonProperty("JarUri")
                private String JarUri;

                /**启动类所需参数*/
                @JsonProperty("MainArgs")
                private List<String> MainArgs;

                /**作业配置信息*/
                @JsonProperty("FlinkConf")
                private List<String> FlinkConf;

            }

            /**作业使用CU量

*/
            @JsonProperty("ResourceUsage")
            private Integer ResourceUsage;

        }

    }

}
