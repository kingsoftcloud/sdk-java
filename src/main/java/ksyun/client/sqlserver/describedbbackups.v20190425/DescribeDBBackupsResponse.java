package ksyun.client.sqlserver.describedbbackups.v20190425;

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
        /**备份信息列表*/
        @JsonProperty("DBBackup")
        private List<DataDtoDBBackupDto> DBBackup;

        @Data
        @ToString
        public static class DataDtoDBBackupDto {
            /**实例ID*/
            @JsonProperty("DBInstanceIdentifier")
            private String DBInstanceIdentifier;

            /**备份ID*/
            @JsonProperty("DBBackupIdentifier")
            private String DBBackupIdentifier;

            /**数据库引擎类型*/
            @JsonProperty("Engine")
            private String Engine;

            /**数据库版本*/
            @JsonProperty("EngineVersion")
            private String EngineVersion;

            /**创建时间*/
            @JsonProperty("BackupCreateTime")
            private String BackupCreateTime;

            /**更新时间*/
            @JsonProperty("BackupUpdatedTime")
            private String BackupUpdatedTime;

            /**备份名称*/
            @JsonProperty("DBBackupName")
            private String DBBackupName;

            /**备份描述*/
            @JsonProperty("Description")
            private String Description;

            /**备份模式：FULL_AMOUNT_BACKUP 全量，INCREMENTAL_BACKUP 增量*/
            @JsonProperty("BackupMode")
            private String BackupMode;

            /**备份类型：Snapshot 手动，AutoBackup 自动*/
            @JsonProperty("BackupType")
            private String BackupType;

            /**备份状态：COMPLETED 完成，NEW 新建*/
            @JsonProperty("Status")
            private String Status;

            /**备份大小*/
            @JsonProperty("BackupSize")
            private Integer BackupSize;

            /**备份远端KS3地址*/
            @JsonProperty("BackupLocationRef")
            private String BackupLocationRef;

            /**备份外链下载地址*/
            @JsonProperty("RemotePath")
            private String RemotePath;

        }

        /**总条数*/
        @JsonProperty("TotalCount")
        private Integer TotalCount;

        /**每页暂时数量*/
        @JsonProperty("MaxRecords")
        private Integer MaxRecords;

        /**第N条开始*/
        @JsonProperty("Marker")
        private Integer Marker;

    }

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

}
