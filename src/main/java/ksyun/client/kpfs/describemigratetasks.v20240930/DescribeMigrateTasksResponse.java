package ksyun.client.kpfs.describemigratetasks.v20240930;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeMigrateTasksResponse
* @Description DescribeMigrateTasks 返回体
*/
@Data
@ToString
public class DescribeMigrateTasksResponse extends BaseResponseModel {

    /**数据迁移任务列表。*/
    @JsonProperty("Data")
    private List<DataDto> Data;

    @Data
    @ToString
    public static class DataDto {
        /**数据迁移任务ID。*/
        @JsonProperty("TaskId")
        private String TaskId;

        /**数据源存储下的相对路径。*/
        @JsonProperty("SrcDirectory")
        private String SrcDirectory;

        /**数据目标存储下的相对路径。*/
        @JsonProperty("DstDirectory")
        private String DstDirectory;

        /**任务的运行状态。有效值：waiting（等待中）、running（运行中）、pause（已暂停）、closed（已关闭）、completed（已完成）、abnormal（任务异常中断）。*/
        @JsonProperty("Status")
        private String Status;

        /**任务创建时间。*/
        @JsonProperty("CreateTime")
        private String CreateTime;

        /**任务开始时间。*/
        @JsonProperty("StartTime")
        private String StartTime;

        /**任务结束时间。*/
        @JsonProperty("EndTime")
        private String EndTime;

        /**任务执行时长，单位s。*/
        @JsonProperty("ExcuteTime")
        private String ExcuteTime;

        /**任务扫描的总文件数。*/
        @JsonProperty("ScanFileCount")
        private Long ScanFileCount;

        /**任务已完成的文件数（包括跳过）。*/
        @JsonProperty("CompletedFileCount")
        private Long CompletedFileCount;

        /**任务失败的文件数。*/
        @JsonProperty("FailedFileCount")
        private Long FailedFileCount;

        /**任务扫描的总文件大小，单位Byte。*/
        @JsonProperty("ScanFileBytes")
        private Long ScanFileBytes;

        /**任务已完成的总文件大小，单位Byte。*/
        @JsonProperty("CompletedFileBytes")
        private Long CompletedFileBytes;

        /**任务运行的IOPS，为实时进度，单位次/s。*/
        @JsonProperty("TaskIops")
        private Long TaskIops;

        /**任务运行的带宽，为实时进度，单位Byte/s。*/
        @JsonProperty("TaskBandwidth")
        private Long TaskBandwidth;

        /***/
        @JsonProperty("RuleId")
        private String RuleId;

        /***/
        @JsonProperty("Bandwidth")
        private Integer Bandwidth;

        /***/
        @JsonProperty("UpdateTime")
        private String UpdateTime;

    }

    /**分页大小。*/
    @JsonProperty("PageSize")
    private Long PageSize;

    /**页码。*/
    @JsonProperty("PageNum")
    private Long PageNum;

    /**数据迁移任务总数。*/
    @JsonProperty("TotalCount")
    private Long TotalCount;

    /**唯一请求ID，每次请求都会返回。*/
    @JsonProperty("RequestId")
    private String RequestId;

}
