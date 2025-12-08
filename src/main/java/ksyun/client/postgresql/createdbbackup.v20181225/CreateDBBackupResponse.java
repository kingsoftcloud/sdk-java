package ksyun.client.postgresql.createdbbackup.v20181225;

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
    /***/
    @JsonProperty("DBBackup")
    private DBBackupDto DBBackup;

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

        /**备份描述，创建备份时添加此参数才会返回*/
        @JsonProperty("Description")
        private String Description;

        /**备份类型

默认"Snapshot" 快照/手动*/
        @JsonProperty("BackupType")
        private String BackupType;

        /**备份状态

状态: 新建：NEW 创建：BUILDING 完成：COMPLETED*/
        @JsonProperty("Status")
        private String Status;

    }

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
