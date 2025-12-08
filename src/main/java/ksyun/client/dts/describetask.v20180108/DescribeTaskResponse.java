package ksyun.client.dts.describetask.v20180108;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeTaskResponse
* @Description DescribeTask 返回体
*/
@Data
@ToString
public class DescribeTaskResponse extends BaseResponseModel {
    /***/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /***/
        @JsonProperty("Tasks")
        private List<TasksDto> Tasks;

        @Data
        @ToString
        public static class TasksDto {
            /**任务名称*/
            @JsonProperty("TaskName")
            private String TaskName;

            /**任务ID*/
            @JsonProperty("TaskId")
            private String TaskId;

            /**任务状态*/
            @JsonProperty("TaskStatus")
            private String TaskStatus;

            /**最新的一致性检查状态*/
            @JsonProperty("LatestConsistencyCheckStatus")
            private String LatestConsistencyCheckStatus;

            /**创建时间*/
            @JsonProperty("Created")
            private String Created;

            /**配置ID*/
            @JsonProperty("ConnConfigId")
            private String ConnConfigId;

            /**源类型*/
            @JsonProperty("SourceType")
            private String SourceType;

            /**子任务类型列表(类型名称)*/
            @JsonProperty("SubTask")
            private String SubTask;

            /**任务开始时间*/
            @JsonProperty("StartTime")
            private String StartTime;

            /**度量值*/
            @JsonProperty("MeasureValue")
            private Integer MeasureValue;

            /**当前主任务下的子任务信息(详情查询返回)*/
            @JsonProperty("SubTasks")
            private List<SubTasksDto> SubTasks;

            @Data
            @ToString
            public static class SubTasksDto {
                /**子任务ID*/
                @JsonProperty("Id")
                private String Id;

                /**对应的主任务ID*/
                @JsonProperty("TaskId")
                private String TaskId;

                /**配置ID*/
                @JsonProperty("ConnConfigId")
                private String ConnConfigId;

                /**子任务名称*/
                @JsonProperty("Name")
                private String Name;

                /**操作状态*/
                @JsonProperty("ActionOn")
                private String ActionOn;

                /**任务状态：FINISHED  RUNNING ERROR*/
                @JsonProperty("Status")
                private String Status;

                /**操作节点状态*/
                @JsonProperty("agentStage")
                private String AgentStage;

                /***/
                @JsonProperty("Judging")
                private Integer Judging;

                /**信息*/
                @JsonProperty("Message")
                private String Message;

                /**执行节点地址*/
                @JsonProperty("Node")
                private String Node;

                /**执行节点地域*/
                @JsonProperty("Region")
                private String Region;

                /**创建时间*/
                @JsonProperty("Created")
                private String Created;

                /**修改时间*/
                @JsonProperty("Updated")
                private String Updated;

                /**是否删除*/
                @JsonProperty("Deleted")
                private Integer Deleted;

                /**参数情况*/
                @JsonProperty("Params")
                private String Params;

                /**百分比进度*/
                @JsonProperty("Progress")
                private Integer Progress;

                /**延迟*/
                @JsonProperty("Latency")
                private Integer Latency;

                /**主账户ID(金山云主账户)*/
                @JsonProperty("AccountId")
                private String AccountId;

                /**任务开始时间*/
                @JsonProperty("StartTime")
                private String StartTime;

                /**任务结束时间*/
                @JsonProperty("EndTime")
                private String EndTime;

                /**重载次数*/
                @JsonProperty("ReloadTimes")
                private Integer ReloadTimes;

                /**失败次数*/
                @JsonProperty("FailureNum")
                private Integer FailureNum;

                /**跳过错误次数*/
                @JsonProperty("errSkip")
                private Integer ErrSkip;

            }

        }

        /***/
        @JsonProperty("TotalCount")
        private Integer TotalCount;

        /***/
        @JsonProperty("Marker")
        private Integer Marker;

        /***/
        @JsonProperty("MaxRecords")
        private Integer MaxRecords;

    }

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
