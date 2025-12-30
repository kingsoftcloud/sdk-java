package ksyun.client.sqlserver.createdbbackup.v20190425;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateDBBackupResponse
* @Description CreateDBBackup 返回体
*/
@Data
@ToString
public class CreateDBBackupResponse extends BaseResponseModel {

    /**单前手动备份详细信息*/
    @JsonProperty("DBBackup")
    private DBBackupDto DBBackup;

    @Data
    @ToString
    public static class DBBackupDto {
        /**所属实例ID*/
        @JsonProperty("DBInstanceIdentifier")
        private String DBInstanceIdentifier;

        /**备份ID*/
        @JsonProperty("DBBackupIdentifier")
        private String DBBackupIdentifier;

        /**数据库引擎类型*/
        @JsonProperty("Engine")
        private String Engine;

        /**数据库引擎版本*/
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

        /**备份类型：Snapshot 手动，AutoBackup 自动*/
        @JsonProperty("BackupType")
        private String BackupType;

        /**备份状态*/
        @JsonProperty("Status")
        private String Status;

    }

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
