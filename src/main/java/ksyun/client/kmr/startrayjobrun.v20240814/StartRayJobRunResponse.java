package ksyun.client.kmr.startrayjobrun.v20240814;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname StartRayJobRunResponse
* @Description StartRayJobRun 返回体
*/
@Data
@ToString
public class StartRayJobRunResponse extends BaseResponseModel {
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

        /**作业运行状态*/
        @JsonProperty("State")
        private String State;

        /**作业运行错误原因*/
        @JsonProperty("ErrorReason")
        private String ErrorReason;

        /**作业运行结束时间*/
        @JsonProperty("EndTime")
        private String EndTime;

        /***/
        @JsonProperty("RaySubmitData")
        private RaySubmitDataDto RaySubmitData;

        @Data
        @ToString
        public static class RaySubmitDataDto {
            /**作业名称*/
            @JsonProperty("Name")
            private String Name;

            /**Ray作业的Head节点核数*/
            @JsonProperty("RayHeadCores")
            private Integer RayHeadCores;

            /**Ray作业的Head节点内存*/
            @JsonProperty("RayHeadMemory")
            private String RayHeadMemory;

            /**Ray作业的Worker节点核数*/
            @JsonProperty("RayWorkerCores")
            private Integer RayWorkerCores;

            /**Ray作业的Worker节点内存*/
            @JsonProperty("RayWorkerMemory")
            private String RayWorkerMemory;

            /**Ray作业的Worker节点数量*/
            @JsonProperty("RayWorkerNum")
            private Integer RayWorkerNum;

            /**Ray作业的Worker节点GPU数*/
            @JsonProperty("RayWorkerGpus")
            private Integer RayWorkerGpus;

            /**启动作业运行*/
            @JsonProperty("EntrypointCmd")
            private String EntrypointCmd;

            /**作业的ks3路径*/
            @JsonProperty("EntrypointResource")
            private String EntrypointResource;

            /**运行时环境配置,例如依赖、环境变量、工作目录等*/
            @JsonProperty("RuntimeEnv")
            private String RuntimeEnv;

            /**作业自定义配置*/
            @JsonProperty("Conf")
            private String Conf;

            /**作业的镜像地址*/
            @JsonProperty("Image")
            private String Image;

            /**JuiceFS配置
Ray head节点挂载 JuiceFS 存储卷*/
            @JsonProperty("JuiceFs")
            private String JuiceFs;

            /**JuiceFS挂载路径*/
            @JsonProperty("MountPath")
            private String MountPath;

        }

    }

}
