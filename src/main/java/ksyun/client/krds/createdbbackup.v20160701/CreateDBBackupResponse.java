package ksyun.client.krds.createdbbackup.v20160701;

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

    /**备份信息
*/
    @JsonProperty("DBBackup")
    private DBBackupDto DBBackup;

    @Data
    @ToString
    public static class DBBackupDto {
        /**实例id	
*/
        @JsonProperty("DBInstanceIdentifier")
        private String DBInstanceIdentifier;

        /**备份id
*/
        @JsonProperty("DBBackupIdentifier")
        private String DBBackupIdentifier;

        /**数据库引擎类型	
*/
        @JsonProperty("Engine")
        private String Engine;

        /**数据库引擎版本	
*/
        @JsonProperty("EngineVersion")
        private String EngineVersion;

        /**备份创建时间	
*/
        @JsonProperty("BackupCreateTime")
        private String BackupCreateTime;

        /**备份修改时间	
*/
        @JsonProperty("BackupUpdatedTime")
        private String BackupUpdatedTime;

        /**备份名称	
*/
        @JsonProperty("DBBackupName")
        private String DBBackupName;

        /**备份类型，默认"Snapshot"
*/
        @JsonProperty("BackupType")
        private String BackupType;

        /**备份状态	
状态:<br>新建：NEW<br>创建：BUILDING<br>完成：COMPLETED*/
        @JsonProperty("Status")
        private String Status;

    }

    /**请求ID	
–*/
    @JsonProperty("RequestId")
    private String RequestId;

}
