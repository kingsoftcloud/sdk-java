package ksyun.client.aicp.describeresourcepoolinstancetasks.v20240612;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * @Classname DescribeResourcePoolInstanceTasksResponse
 * @Description DescribeResourcePoolInstanceTasks 返回体
 */
@Data
@ToString
public class DescribeResourcePoolInstanceTasksResponse extends BaseResponseModel {

    /**
     * 请求ID
     */
    @JsonProperty("RequestId")
    private String RequestId;

    /**
     * 单次调用可返回的最大条目数量
     */
    @JsonProperty("PageSize")
    private Integer PageSize;

    /**
     * 页码
     */
    @JsonProperty("Page")
    private Integer Page;

    /**
     * 任务总数
     */
    @JsonProperty("TotalCount")
    private Integer TotalCount;

    /**
     * 节点所运行任务的信息
     */
    @JsonProperty("InstanceTaskSet")
    private List<InstanceTaskSetDto> InstanceTaskSet;

    @Data
    @ToString
    public static class InstanceTaskSetDto {
        /**
         * Pod实例ID
         */
        @JsonProperty("PodInstanceId")
        private String PodInstanceId;

        /**
         * 任务名称
         */
        @JsonProperty("TaskName")
        private String TaskName;

        /**
         * 任务ID
         */
        @JsonProperty("TaskId")
        private String TaskId;

        /**
         * 任务类型：
         * - Notebook，开发任务
         * - TrainJob，训练任务
         * - Inference，模型在线服务
         * - DataJob，数据处理任务
         */
        @JsonProperty("TaskType")
        private String TaskType;

        /**
         * 任务所占用GPU数量
         */
        @JsonProperty("GPUNum")
        private Integer GPUNum;

        /**
         * 任务所占用CPU数量
         */
        @JsonProperty("CPUNum")
        private Integer CPUNum;

        /**
         * 任务所占用内存数量
         */
        @JsonProperty("MemeryNum")
        private Integer MemeryNum;

        /**
         * 创建者子账号ID
         */
        @JsonProperty("CreateUser")
        private String CreateUser;

        /**
         * 创建时间
         */
        @JsonProperty("CreateTime")
        private String CreateTime;

        /**
         * 开始时间
         */
        @JsonProperty("StartTime")
        private String StartTime;

        /**
         * 结束时间
         */
        @JsonProperty("EndTime")
        private String EndTime;

        /**
         * 状态
         */
        @JsonProperty("Status")
        private String Status;

    }

}
