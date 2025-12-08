package ksyun.client.tidb.listbackup.v20210520;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ListBackupResponse
* @Description ListBackup 返回体
*/
@Data
@ToString
public class ListBackupResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Code")
    private String Code;

    /***/
    @JsonProperty("Message")
    private String Message;

    /***/
    @JsonProperty("Data")
    private List<DataDto> Data;

    @Data
    @ToString
    public static class DataDto {
        /**备份id*/
        @JsonProperty("backupId")
        private String BackupId;

        /**备份记录所属的集群ID*/
        @JsonProperty("instanceId")
        private String InstanceId;

        /**备份记录的可读名称*/
        @JsonProperty("backupName")
        private String BackupName;

        /**备份状态；
created 备份任务已创建； 
running 备份任务正在运行
success 备份任务已完成； 
error 备份失败；*/
        @JsonProperty("backupStatus")
        private String BackupStatus;

        /**备份状态名称:
created 备份任务已创建； 
running 备份任务正在运行
success 备份任务已完成； 
error 备份失败；*/
        @JsonProperty("backupStatusName")
        private String BackupStatusName;

        /**备份可读大小*/
        @JsonProperty("backupSizeReadable")
        private String BackupSizeReadable;

        /**运行方式-en
0 手动备份； 1 自动备份*/
        @JsonProperty("runType")
        private Integer RunType;

        /**运行方式-zh
0 手动备份； 1 自动备份*/
        @JsonProperty("runTypeName")
        private String RunTypeName;

        /**备份方式:
全量 增量*/
        @JsonProperty("increaseName")
        private String IncreaseName;

        /**备份开始时间*/
        @JsonProperty("startTime")
        private String StartTime;

        /**备份完成时间*/
        @JsonProperty("complateTime")
        private String ComplateTime;

        /**备份耗时*/
        @JsonProperty("cost")
        private Integer Cost;

        /**创建时间*/
        @JsonProperty("createTime")
        private String CreateTime;

    }

}
