package ksyun.client.kpfs.describedatamigratetasklist.v20240930;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeDataMigrateTaskListResponse
* @Description DescribeDataMigrateTaskList 返回体
*/
@Data
@ToString
public class DescribeDataMigrateTaskListResponse extends BaseResponseModel {

    /**唯一请求ID，每次请求都会返回。*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**数据流动任务列表*/
    @JsonProperty("Data")
    private List<DataDto> Data;

    @Data
    @ToString
    public static class DataDto {
        /**文件系统ID*/
        @JsonProperty("FileSystemId")
        private String FileSystemId;

        /**数据流动任务ID*/
        @JsonProperty("TaskId")
        private String TaskId;

        /**数据流动任务类型，export：导出*/
        @JsonProperty("TaskType")
        private String TaskType;

        /**数据流动任务名称*/
        @JsonProperty("TaskName")
        private String TaskName;

        /**对象存储信息*/
        @JsonProperty("BucketConfig")
        private DataBucketConfigDto BucketConfig;

        @Data
        @ToString
        public static class DataBucketConfigDto {
            /**存储桶名称*/
            @JsonProperty("Bucket")
            private String Bucket;

            /**存储桶前缀*/
            @JsonProperty("BucektPrefix")
            private String BucektPrefix;

        }

        /**文件存储的完整目录路径*/
        @JsonProperty("DirPath")
        private String DirPath;

        /**带宽限制，单位MB/s，默认为0，不限制*/
        @JsonProperty("BandWidthLimit")
        private String BandWidthLimit;

        /**迁移完成后，是否删除源的数据*/
        @JsonProperty("CleanSourceFile")
        private Boolean CleanSourceFile;

        /**数据流动任务状态，支持周期性任务立即或稍后启用，on：启用，off：禁用*/
        @JsonProperty("ExportTaskPeriodEnabled")
        private String ExportTaskPeriodEnabled;

        /**数据流动任务描述*/
        @JsonProperty("Description")
        private String Description;

        /**导出任务的执行周期信息*/
        @JsonProperty("ExportTaskPeriodConfig")
        private DataExportTaskPeriodConfigDto ExportTaskPeriodConfig;

        @Data
        @ToString
        public static class DataExportTaskPeriodConfigDto {
            /**备份周期。有效值：day：按天（默认值），week：按周，month：按月*/
            @JsonProperty("FrequencyUnit")
            private String FrequencyUnit;

            /**备份日期*/
            @JsonProperty("IndexOfFrequency")
            private List<Integer> IndexOfFrequency;

            /**时间点*/
            @JsonProperty("TimePoints")
            private List<String> TimePoints;

        }

        /**数据流动任务运行次数*/
        @JsonProperty("ExecCount")
        private Integer ExecCount;

        /**数据流动任务的异常可能原因（仅未运行状态且执行次数为1的任务，可能返回该字段，为上一次任务的异常可能原因）*/
        @JsonProperty("ExecResultMsg")
        private String ExecResultMsg;

        /**数据流动任务执行结果错误码（仅未运行状态且执行次数为1的任务，会返回该字段，为上一次任务的异常可能原因）*/
        @JsonProperty("ExecResultErrorCode")
        private String ExecResultErrorCode;

        /**数据流动任务执行开始时间*/
        @JsonProperty("ExecStartTime")
        private String ExecStartTime;

        /**数据流动任务状态，有效值：NOT_RUNNING：未运行，RUNNING：运行中*/
        @JsonProperty("ExecStatus")
        private String ExecStatus;

        /**数据流动任务创建时间*/
        @JsonProperty("CreateTime")
        private Long CreateTime;

        /**数据流动任务更新时间*/
        @JsonProperty("UpdateTime")
        private Long UpdateTime;

    }

    /**页码，默认为1*/
    @JsonProperty("PageSize")
    private Integer PageSize;

    /**分页大小，默认为20*/
    @JsonProperty("PageNum")
    private Integer PageNum;

    /**返回的数据流动任务总数*/
    @JsonProperty("TotalCount")
    private Integer TotalCount;

}
