package ksyun.client.sqlserver.describedbbackuppolicy.v20190425;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeDBBackupPolicyResponse
* @Description DescribeDBBackupPolicy 返回体
*/
@Data
@ToString
public class DescribeDBBackupPolicyResponse extends BaseResponseModel {

    /**备份配置参数*/
    @JsonProperty("BackupConfig")
    private BackupConfigDto BackupConfig;

    @Data
    @ToString
    public static class BackupConfigDto {
        /**备份过期时间(暂不支持修改)*/
        @JsonProperty("ExpireAfter")
        private Integer ExpireAfter;

        /**自动备份时间段(可修改)*/
        @JsonProperty("AutobackupAt")
        private String AutobackupAt;

        /**备份间隔(一天)*/
        @JsonProperty("Duration")
        private Integer Duration;

        /**增量备份时间间隔(小时)*/
        @JsonProperty("IncrementalBackupCycle")
        private Integer IncrementalBackupCycle;

        /**全量备份时间周期(不可改)*/
        @JsonProperty("FullBackupCycle")
        private String FullBackupCycle;

        /**全局配置ID*/
        @JsonProperty("GroupId")
        private String GroupId;

        /**Binlog保存时间(不可改)*/
        @JsonProperty("BinlogExpireAfter")
        private Integer BinlogExpireAfter;

        /**高频备份开关(不可改)*/
        @JsonProperty("HighFrequencyBackup")
        private Boolean HighFrequencyBackup;

    }

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

}
