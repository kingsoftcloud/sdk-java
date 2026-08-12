package ksyun.client.kpfs.getdatamigratetaskprogress.v20240930;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname GetDataMigrateTaskProgressResponse
* @Description GetDataMigrateTaskProgress 返回体
*/
@Data
@ToString
public class GetDataMigrateTaskProgressResponse extends BaseResponseModel {

    /**唯一请求ID，每次请求都会返回。*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**数据流动任务状态。NOT_RUNNING：未运行，RUNNING：运行中*/
    @JsonProperty("ExecStatus")
    private String ExecStatus;

    /**数据流动任务运行次数*/
    @JsonProperty("ExecCount")
    private Integer ExecCount;

    /**数据流动任务执行开始时间*/
    @JsonProperty("ExecStartTime")
    private String ExecStartTime;

    /**数据流动任务统计信息*/
    @JsonProperty("ExecStatistic")
    private ExecStatisticDto ExecStatistic;

    @Data
    @ToString
    public static class ExecStatisticDto {
        /**流动统计信息是否有效*/
        @JsonProperty("IsActive")
        private Boolean IsActive;

        /**扫描的文件/对象数*/
        @JsonProperty("ScanObjects")
        private Long ScanObjects;

        /**迁移成功的文件/对象数*/
        @JsonProperty("TransSuccessCount")
        private Long TransSuccessCount;

        /**迁移失败的文件/对象数*/
        @JsonProperty("TransFailedCount")
        private Long TransFailedCount;

        /**迁移总数据大小*/
        @JsonProperty("TransTotalSize")
        private String TransTotalSize;

        /**任务总耗时*/
        @JsonProperty("TransTime")
        private String TransTime;

    }

    /**任务运行中的实时进度信息*/
    @JsonProperty("ProgressInfo")
    private ProgressInfoDto ProgressInfo;

    @Data
    @ToString
    public static class ProgressInfoDto {
        /**已完成迁移的数据量大小*/
        @JsonProperty("WTotalTransfers")
        private String WTotalTransfers;

        /**总迁移数据量大小*/
        @JsonProperty("WTotalSize")
        private String WTotalSize;

        /**整体迁移平均速度*/
        @JsonProperty("VTotalSpeed")
        private String VTotalSpeed;

        /**总迁移文件/对象数量*/
        @JsonProperty("VTotalTransfers")
        private Long VTotalTransfers;

        /**已完成迁移的文件/对象数*/
        @JsonProperty("WTransfers")
        private Long WTransfers;

        /**整体耗时*/
        @JsonProperty("WElapsedTime")
        private String WElapsedTime;

        /**预计剩余时间*/
        @JsonProperty("WTotalEta")
        private String WTotalEta;

        /**整体迁移进度百分比*/
        @JsonProperty("WTotalPercentage")
        private String WTotalPercentage;

        /**正在迁移的文件/对象进度信息*/
        @JsonProperty("Transferring")
        private List<ProgressInfoTransferringDto> Transferring;

        @Data
        @ToString
        public static class ProgressInfoTransferringDto {
            /**文件/对象已完成迁移的数据量大小*/
            @JsonProperty("Bytes")
            private String Bytes;

            /**预计该文件/对象迁移剩余时间*/
            @JsonProperty("Eta")
            private String Eta;

            /**文件/对象名称*/
            @JsonProperty("FileName")
            private String FileName;

            /**该文件/对象迁移进度百分比*/
            @JsonProperty("Percentage")
            private String Percentage;

            /**该文件/对象迁移平均速度*/
            @JsonProperty("Speed")
            private String Speed;

            /**该文件/对象瞬时速度*/
            @JsonProperty("SpeedAvg")
            private String SpeedAvg;

            /**该文件/对象总大小*/
            @JsonProperty("FileSize")
            private String FileSize;

        }

    }

}
