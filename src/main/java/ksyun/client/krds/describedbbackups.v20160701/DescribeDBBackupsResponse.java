package ksyun.client.krds.describedbbackups.v20160701;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeDBBackupsResponse
* @Description DescribeDBBackups 返回体
*/
@Data
@ToString
public class DescribeDBBackupsResponse extends BaseResponseModel {
    /***/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /***/
        @JsonProperty("DBBackup")
        private List<DataDtoDBBackupDto> DBBackup;

        @Data
        @ToString
        public static class DataDtoDBBackupDto {
            /**所属实例id*/
            @JsonProperty("DBInstanceIdentifier")
            private String DBInstanceIdentifier;

            /**备份id*/
            @JsonProperty("DBBackupIdentifier")
            private String DBBackupIdentifier;

            /**数据库引擎*/
            @JsonProperty("Engine")
            private String Engine;

            /**数据库引擎版本*/
            @JsonProperty("EngineVersion")
            private String EngineVersion;

            /**备份创建时间*/
            @JsonProperty("BackupCreateTime")
            private String BackupCreateTime;

            /**备份修改时间*/
            @JsonProperty("BackupUpdatedTime")
            private String BackupUpdatedTime;

            /**备份名称*/
            @JsonProperty("DBBackupName")
            private String DBBackupName;

            /**备份模式：
全量：FULL_AMOUNT_BACKUP
增量：INCREMENTAL_BACKUP*/
            @JsonProperty("BackupMode")
            private String BackupMode;

            /**备份类型：
手动：Snapshot
自动：AutoBackup*/
            @JsonProperty("BackupType")
            private String BackupType;

            /**备份状态*/
            @JsonProperty("Status")
            private String Status;

            /**备份大小，单位MB*/
            @JsonProperty("BackupSize")
            private Integer BackupSize;

            /**备份远端地址*/
            @JsonProperty("BackupLocationRef")
            private String BackupLocationRef;

            /**备份下载URL*/
            @JsonProperty("RemotePath")
            private String RemotePath;

            /**MD5校验码*/
            @JsonProperty("MD5")
            private String MD5;

        }

        /**总数*/
        @JsonProperty("TotalCount")
        private Integer TotalCount;

        /***/
        @JsonProperty("MaxRecords")
        private Integer MaxRecords;

    }

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
