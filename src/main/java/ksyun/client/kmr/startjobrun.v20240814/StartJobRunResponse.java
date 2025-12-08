package ksyun.client.kmr.startjobrun.v20240814;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname StartJobRunResponse
* @Description StartJobRun 返回体
*/
@Data
@ToString
public class StartJobRunResponse extends BaseResponseModel {
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

        /**工作空间名称*/
        @JsonProperty("Name")
        private String Name;

        /**作业类型*/
        @JsonProperty("CodeType")
        private String CodeType;

        /**作业状态*/
        @JsonProperty("State")
        private String State;

        /**如有错误发生，提供错误原因*/
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

        /**作业WebUI的url*/
        @JsonProperty("WebUI")
        private String WebUI;

        /**Spark版本*/
        @JsonProperty("ReleaseVersion")
        private String ReleaseVersion;

        /***/
        @JsonProperty("SparkSubmitData")
        private DataDtoSparkSubmitDataDto SparkSubmitData;

        @Data
        @ToString
        public static class DataDtoSparkSubmitDataDto {
            /**作业名称*/
            @JsonProperty("Name")
            private String Name;

            /**作业的Driver核数*/
            @JsonProperty("SparkDriverCores")
            private Integer SparkDriverCores;

            /**作业的Driver内存*/
            @JsonProperty("SparkDriverMemory")
            private String SparkDriverMemory;

            /**作业的Executor核数*/
            @JsonProperty("SparkExecutorCores")
            private Integer SparkExecutorCores;

            /**作业的Executor内存*/
            @JsonProperty("SparkExecutorMemory")
            private String SparkExecutorMemory;

            /**作业的Executor数量*/
            @JsonProperty("SparkNumExecutors")
            private Integer SparkNumExecutors;

            /**Java作业的主类，其中包含启动的main函数*/
            @JsonProperty("Class")
            private String ClassField;

            /**作业应用程序代码的资源文件路径*/
            @JsonProperty("AppResource")
            private String AppResource;

            /**自定义参数数组*/
            @JsonProperty("ExtraArgs")
            private List<String> ExtraArgs;

            /**设置的作业配置项，key=value形式*/
            @JsonProperty("Conf")
            private String Conf;

            /**作业需要引用的JAR包资源*/
            @JsonProperty("Jars")
            private String Jars;

            /**作业需引用的资源文件*/
            @JsonProperty("Files")
            private String Files;

            /**作业需引用的Python脚本*/
            @JsonProperty("PyFiles")
            private String PyFiles;

            /**作业需引用的archive包资源*/
            @JsonProperty("Archives")
            private String Archives;

            /**作业的外部依赖包*/
            @JsonProperty("Packages")
            private String Packages;

            /**缓存加速archive资源*/
            @JsonProperty("CacheFile")
            private String CacheFile;

            /**容器镜像地址*/
            @JsonProperty("Image")
            private String Image;

            /***/
            @JsonProperty("ProxyUser")
            private String ProxyUser;

            /***/
            @JsonProperty("Params")
            private String Params;

        }

        /***/
        @JsonProperty("ResourceUsage")
        private Integer ResourceUsage;

    }

}
