package ksyun.client.kmr.startflinkjobrun.v20240814;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname StartFlinkJobRunResponse
* @Description StartFlinkJobRun 返回体
*/
@Data
@ToString
public class StartFlinkJobRunResponse extends BaseResponseModel {
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
        /**作业ID*/
        @JsonProperty("JobRunId")
        private String JobRunId;

        /**工作空间ID*/
        @JsonProperty("WorkspaceId")
        private String WorkspaceId;

        /**作业名称*/
        @JsonProperty("Name")
        private String Name;

        /**作业运行状态，包括资源分配情况和作业状态*/
        @JsonProperty("State")
        private String State;

        /**作业运行错误原因*/
        @JsonProperty("ErrorReason")
        private String ErrorReason;

        /**作业运行结束时间*/
        @JsonProperty("EndTime")
        private String EndTime;

        /***/
        @JsonProperty("FlinkDeploymentData")
        private DataDtoFlinkDeploymentDataDto FlinkDeploymentData;

        @Data
        @ToString
        public static class DataDtoFlinkDeploymentDataDto {
            /***/
            @JsonProperty("Name")
            private String Name;

            /***/
            @JsonProperty("Image")
            private String Image;

            /***/
            @JsonProperty("UpgradeMode")
            private String UpgradeMode;

            /***/
            @JsonProperty("JobCores")
            private Integer JobCores;

            /***/
            @JsonProperty("JobMemory")
            private String JobMemory;

            /***/
            @JsonProperty("TaskCores")
            private Integer TaskCores;

            /***/
            @JsonProperty("TaskMemory")
            private String TaskMemory;

            /***/
            @JsonProperty("NumTasks")
            private Integer NumTasks;

            /***/
            @JsonProperty("JarUri")
            private String JarUri;

            /***/
            @JsonProperty("Dependencies")
            private List<String> Dependencies;

            /***/
            @JsonProperty("FlinkDeploymentData")
            private DataDtoFlinkDeploymentDataDtoFlinkDeploymentDataDto FlinkDeploymentData;

            @Data
            @ToString
            public static class DataDtoFlinkDeploymentDataDtoFlinkDeploymentDataDto {
                /**作业名称*/
                @JsonProperty("Name")
                private String Name;

                /**作业使用的镜像*/
                @JsonProperty("Image")
                private String Image;

                /**Flink类型
*/
                @JsonProperty("UpgradeMode")
                private String UpgradeMode;

                /**Flink作业的Job核数*/
                @JsonProperty("JobCores")
                private Integer JobCores;

                /**Flink作业的Job内存*/
                @JsonProperty("JobMemory")
                private String JobMemory;

                /**Flink作业的Task数量*/
                @JsonProperty("NumTasks")
                private Integer NumTasks;

                /**作业的配置信息*/
                @JsonProperty("FlinkConf")
                private List<String> FlinkConf;

                /**作业依赖文件ks3路径*/
                @JsonProperty("Dependencies")
                private List<String> Dependencies;

                /**运行时环境配置，如依赖、环境变量、工作目录等
*/
                @JsonProperty("JarUri")
                private String JarUri;

                /**启动类，需填写类的全称*/
                @JsonProperty("EntryClass")
                private String EntryClass;

                /**JAR作业URL全路径
*/
                @JsonProperty("JarUri1")
                private String JarUri1;

                /**启动类所需参数*/
                @JsonProperty("MainArgs")
                private String MainArgs;

            }

        }

    }

}
