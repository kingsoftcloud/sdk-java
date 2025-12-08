package ksyun.client.dts.createtask.v20180108;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreateTaskRequest
* @Description 请求参数
*/
@Data
public class CreateTaskRequest{
    /**TaskName*/
    @KsYunField(name="TaskName")
    private String TaskName;

    /**子任务名称。	
Mysql支持：
SchemaMigration,BackupRecovery,RunReplication

双向同步支持：
BackupRecovery,ForwardRunReplication,ReverseRunReplication

Redis支持：
FullSync

mongo支持：
MgoBackupRecovery,MgoRunReplication

数据订阅支持：
Subscription*/
    @KsYunField(name="SubTask")
    private String SubTask;

    /**默认Transmission
范围：
Synchronous数据同步
Transmission数据迁移
Subscription数据订阅*/
    @KsYunField(name="TaskType")
    private String TaskType;

    /**成功的预检查ID。请注意：创建任务与预检查任务的参数任务类型和子任务需保持一致。*/
    @KsYunField(name="PrecheckId")
    private String PrecheckId;

    /**默认1。1：包年包月 86：按量付费（流量）*/
    @KsYunField(name="BillType")
    private Integer BillType;

    /**计费时长。单位：月，计费方式为包年包月时必填。*/
    @KsYunField(name="Duration")
    private Integer Duration;

}
