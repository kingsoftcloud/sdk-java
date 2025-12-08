package ksyun.client.postgresql.describedbbackups.v20181225;

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
        private List<DBBackupDto> DBBackup;

        @Data
        @ToString
        public static class DBBackupDto {
            /**实例ID*/
            @JsonProperty("DBInstanceIdentifier")
            private String DBInstanceIdentifier;

            /**备份ID*/
            @JsonProperty("DBBackupIdentifier")
            private String DBBackupIdentifier;

            /**引擎*/
            @JsonProperty("Engine")
            private String Engine;

            /**引擎版本*/
            @JsonProperty("EngineVersion")
            private String EngineVersion;

            /**备份创建时间*/
            @JsonProperty("BackupCreateTime")
            private String BackupCreateTime;

            /**备份更新时间*/
            @JsonProperty("BackupUpdatedTime")
            private String BackupUpdatedTime;

            /**备份名称*/
            @JsonProperty("DBBackupName")
            private String DBBackupName;

            /**备份模式*/
            @JsonProperty("BackupMode")
            private String BackupMode;

            /**备份类型*/
            @JsonProperty("BackupType")
            private String BackupType;

            /**备份状态*/
            @JsonProperty("Status")
            private String Status;

            /**备份大小 MB*/
            @JsonProperty("BackupSize")
            private Integer BackupSize;

            /**备份位置参考*/
            @JsonProperty("BackupLocationRef")
            private String BackupLocationRef;

            /**备份下载地址*/
            @JsonProperty("RemotePath")
            private String RemotePath;

            /**MD5校验*/
            @JsonProperty("MD5")
            private String MD5;

        }

        /**总数*/
        @JsonProperty("TotalCount")
        private Integer TotalCount;

        /**当前页展示*/
        @JsonProperty("MaxRecords")
        private Integer MaxRecords;

    }

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
