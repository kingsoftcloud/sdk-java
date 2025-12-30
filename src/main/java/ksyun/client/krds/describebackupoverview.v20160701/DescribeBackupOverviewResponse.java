package ksyun.client.krds.describebackupoverview.v20160701;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeBackupOverviewResponse
* @Description DescribeBackupOverview 返回体
*/
@Data
@ToString
public class DescribeBackupOverviewResponse extends BaseResponseModel {

    /***/
    @JsonProperty("BackupOverview")
    private BackupOverviewDto BackupOverview;

    @Data
    @ToString
    public static class BackupOverviewDto {
        /**总备份*/
        @JsonProperty("Total")
        private BackupOverviewTotalDto Total;

        @Data
        @ToString
        public static class BackupOverviewTotalDto {
            /**日志备份+数据备份的总占用空间*/
            @JsonProperty("Size")
            private String Size;

            /**日志备份+数据备份的总数量*/
            @JsonProperty("Num")
            private String Num;

            /**免费空间额度*/
            @JsonProperty("FreeSize")
            private String FreeSize;

            /**日志备份+数据备份占用的免费空间，如果总占用空间大于免费空间额度，该值等于免费空间额度；如果总占用空间小于免费额度，该值即为总占用空间*/
            @JsonProperty("UsedSize")
            private String UsedSize;

            /**日志备份+数据备份占用的收费空间*/
            @JsonProperty("ChargedSize")
            private String ChargedSize;

        }

        /**数据备份*/
        @JsonProperty("Backup")
        private BackupOverviewBackupDto Backup;

        @Data
        @ToString
        public static class BackupOverviewBackupDto {
            /**数据备份的总空间*/
            @JsonProperty("Size")
            private String Size;

            /**数据备份的总数量*/
            @JsonProperty("Num")
            private String Num;

            /**自动备份的总占用空间*/
            @JsonProperty("AutoBackupSize")
            private String AutoBackupSize;

            /**自动备份的总占用空间*/
            @JsonProperty("AutoBackupNum")
            private String AutoBackupNum;

            /**手动备份的总占用空间*/
            @JsonProperty("ManualBackupSize")
            private String ManualBackupSize;

            /**手动备份的总输俩个*/
            @JsonProperty("ManualBackupNum")
            private String ManualBackupNum;

        }

        /**日志备份*/
        @JsonProperty("Binlog")
        private BackupOverviewBinlogDto Binlog;

        @Data
        @ToString
        public static class BackupOverviewBinlogDto {
            /**日志备份总占用空间*/
            @JsonProperty("Size")
            private String Size;

            /**日志备份总数量*/
            @JsonProperty("Num")
            private String Num;

        }

        /**已删除实例备份*/
        @JsonProperty("Deleted")
        private BackupOverviewDeletedDto Deleted;

        @Data
        @ToString
        public static class BackupOverviewDeletedDto {
            /**已删除删除手动备份的总占用空间*/
            @JsonProperty("Size")
            private String Size;

            /**已删除实例手动备份的总数量*/
            @JsonProperty("Num")
            private String Num;

        }

    }

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
