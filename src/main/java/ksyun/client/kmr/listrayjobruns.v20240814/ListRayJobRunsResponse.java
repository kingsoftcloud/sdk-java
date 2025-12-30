package ksyun.client.kmr.listrayjobruns.v20240814;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ListRayJobRunsResponse
* @Description ListRayJobRuns 返回体
*/
@Data
@ToString
public class ListRayJobRunsResponse extends BaseResponseModel {

    /***/
    @JsonProperty("status")
    private Integer Status;

    /***/
    @JsonProperty("data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
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
        private DataDataDto Data;

        @Data
        @ToString
        public static class DataDataDto {
            /**每页展示作业数量
*/
            @JsonProperty("MaxResults")
            private Integer MaxResults;

            /**符合查询条件的作业总数*/
            @JsonProperty("TotalCount")
            private Integer TotalCount;

            /***/
            @JsonProperty("JobRuns")
            private List<DataDataJobRunsDto> JobRuns;

            @Data
            @ToString
            public static class DataDataJobRunsDto {
                /**作业ID*/
                @JsonProperty("JobRunId")
                private String JobRunId;

                /**工作空间ID*/
                @JsonProperty("WorkspaceId")
                private String WorkspaceId;

                /**作业名称*/
                @JsonProperty("Name")
                private String Name;

                /**作业状态
*/
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

                /**作业WebUI的url*/
                @JsonProperty("WebUI")
                private String WebUI;

                /**作业日志的url*/
                @JsonProperty("RayLog")
                private String RayLog;

                /**Ray版本*/
                @JsonProperty("ReleaseVersion")
                private String ReleaseVersion;

                /***/
                @JsonProperty("RaySubmitData")
                private DataDataJobRunsRaySubmitDataDto RaySubmitData;

                @Data
                @ToString
                public static class DataDataJobRunsRaySubmitDataDto {
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

                    /**Ray作业的Worker节点数*/
                    @JsonProperty("RayWorkerNum")
                    private Integer RayWorkerNum;

                    /**Ray作业的Worker节点GPU数*/
                    @JsonProperty("RayWorkerGpus")
                    private Integer RayWorkerGpus;

                    /**用于配置启动作业运行命令*/
                    @JsonProperty("EntrypointCmd")
                    private String EntrypointCmd;

                    /**作业ks3路径*/
                    @JsonProperty("EntrypointResource")
                    private String EntrypointResource;

                    /**作业运行需要的Python包*/
                    @JsonProperty("RuntimeEnv")
                    private String RuntimeEnv;

                    /**作业自定义配置*/
                    @JsonProperty("Conf")
                    private String Conf;

                    /**作业镜像地址*/
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

                /**作业使用的资源量
单位：CU*/
                @JsonProperty("ResourceUsage")
                private Integer ResourceUsage;

            }

        }

    }

}
