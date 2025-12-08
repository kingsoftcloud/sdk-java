package ksyun.client.krds.describestatisticbackupdetails.v20160701;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeStatisticBackupDetailsResponse
* @Description DescribeStatisticBackupDetails 返回体
*/
@Data
@ToString
public class DescribeStatisticBackupDetailsResponse extends BaseResponseModel {
    /**备份信息返回数据域；
注意：备份信息、Binglog信息数据域只会返回其中一项*/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /**备份列表数据域*/
        @JsonProperty("Backups")
        private List<DataDtoBackupsDto> Backups;

        @Data
        @ToString
        public static class DataDtoBackupsDto {
            /**备份名称*/
            @JsonProperty("Name")
            private String Name;

            /**实例ID*/
            @JsonProperty("DBInstanceIdentifier")
            private String DBInstanceIdentifier;

            /**备份大小：单位MB*/
            @JsonProperty("BackupSize")
            private Integer BackupSize;

            /**备份类型：
backup：实例备份； 
binglog：实例binglog备份；  
delbackup：已删除实例备份*/
            @JsonProperty("Type")
            private String Type;

            /**备份状态*/
            @JsonProperty("Status")
            private String Status;

            /**备份ID*/
            @JsonProperty("DBBackupIdentifier")
            private String DBBackupIdentifier;

            /**备份创建时间*/
            @JsonProperty("BackupCreateTime")
            private String BackupCreateTime;

            /**备份修改时间*/
            @JsonProperty("BackupUpdatedTime")
            private String BackupUpdatedTime;

            /**备份下载路径；
ks3下载路径，注意文件较大容易超时！*/
            @JsonProperty("RemotePath")
            private String RemotePath;

            /**备份远端KS3路径*/
            @JsonProperty("BackupLocationRef")
            private String BackupLocationRef;

            /**备份大小单位*/
            @JsonProperty("BackupSizeUnit")
            private String BackupSizeUnit;

        }

        /**Binlog数据域*/
        @JsonProperty("BinlogTasks")
        private List<DataDtoBinlogTasksDto> BinlogTasks;

        @Data
        @ToString
        public static class DataDtoBinlogTasksDto {
            /**名称*/
            @JsonProperty("BinlogName")
            private String BinlogName;

            /**实例ID*/
            @JsonProperty("DBInstanceIdentifier")
            private String DBInstanceIdentifier;

            /**首次事件开始时间*/
            @JsonProperty("FirstEventCtime")
            private String FirstEventCtime;

            /**最后事件开始时间*/
            @JsonProperty("LastEventCtime")
            private String LastEventCtime;

            /**大小*/
            @JsonProperty("Size")
            private Integer Size;

            /**同步状态*/
            @JsonProperty("SyncStatus")
            private String SyncStatus;

            /**下载地址*/
            @JsonProperty("LogFileName")
            private String LogFileName;

            /**Binlog日志大小单位*/
            @JsonProperty("SizeUnit")
            private String SizeUnit;

        }

        /**总条数*/
        @JsonProperty("TotalCount")
        private Integer TotalCount;

        /**每页展示条数*/
        @JsonProperty("MaxRecords")
        private Integer MaxRecords;

        /**开始条数*/
        @JsonProperty("Marker")
        private Integer Marker;

    }

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
