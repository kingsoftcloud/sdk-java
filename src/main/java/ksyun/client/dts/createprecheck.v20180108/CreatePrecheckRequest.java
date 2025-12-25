package ksyun.client.dts.createprecheck.v20180108;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreatePrecheckRequest
* @Description 请求参数
*/
@Data
public class CreatePrecheckRequest{
    /**源端库类型

```json
公有云mysql：Krds
公有云主从redis：Kcs
公有云集群redis：ClusterKcs
公有云mongo：Kmgo
公有云pg：Kpg
订阅目标类型：Vpc

注：目前不支持创建pg任务，源库与目标库类型须一致
```*/
    @KsYunField(name="SourceType")
    private String SourceType;

    /**目标端库类型

```json
公有云mysql：Krds
公有云主从redis：Kcs
公有云集群redis：ClusterKcs
公有云mongo：Kmgo
公有云pg：Kpg
订阅目标类型：Vpc

注：目前不支持创建pg任务，源库与目标库类型须一致
```*/
    @KsYunField(name="TargetType")
    private String TargetType;

    /**目标库地域*/
    @KsYunField(name="TargetRegion")
    private String TargetRegion;

    /**源端库地域*/
    @KsYunField(name="SourceRegion")
    private String SourceRegion;

    /**需要同步的源数据库结构

```json
注意：此处接受json字符串
例如："{\"is_full\":true}"表示为全部同步
```*/
    @KsYunField(name="DbSchema")
    private String DbSchema;

    /**dts子任务

```json
1.MYSQL支持：SchemaMigration,BackupRecovery,RunReplication
2.Redis支持：FullSync
3.MongoDB支持：MgoBackupRecovery,MgoRunReplication
4.双向同步支持：BackupRecovery,ForwardRunReplication,ReverseRunReplication 
5.数据订阅：Subscription
```*/
    @KsYunField(name="SubTasks")
    private String SubTasks;

    /**源端库实例ID*/
    @KsYunField(name="SourceInstanceId")
    private String SourceInstanceId;

    /**目标库地域*/
    @KsYunField(name="TargetInstanceId")
    private String TargetInstanceId;

    /**源端库账号名称*/
    @KsYunField(name="SourceUsername")
    private String SourceUsername;

    /**源端库连接账号密码*/
    @KsYunField(name="SourcePassword")
    private String SourcePassword;

    /**dts任务类型

```json
范围： 
Synchronous数据同步 
Transmission数据迁移 
Subscription数据订阅 
Bisynchronous双向同步
```*/
    @KsYunField(name="Type")
    private String Type;

    /**需要同步迁移参数时传递

```json
例如：
{
  "SourceType": "Krds",
  "TargetType": "Krds",
  "TargetRegion": "cn-beijing-6",
  "region": "cn-beijing-6",
  "DbSchema": "{\"is_full\":true}",
  "SubTasks": "BackupRecovery,RunReplication",
  "SourceRegion": "cn-beijing-6",
  "SourceInstanceId": "******",
  "TargetInstanceId": "******",
  "SourceUsername": "admin",
  "SourceUser": [
     {
        "Username":"testuser",
        "SourceHost":"%"
    }
  ],
  "DTSParameter": [
    {
      "DBParameter": "log_bin_trust_function_creators",
      "TargetDBParameterValue": "OFF"
    },
    {
      "DBParameter": "binlog_format",
      "TargetDBParameterValue": "ROW"
    }
  ],
  "SourcePassword": "******",
  "Type": "Transmission"
}
```*/
    @KsYunField(name = "DTSParameter", type = 1)
    private List<DTSParameterDto> DTSParameterList;

    @Data
    @ToString
    public static class DTSParameterDto {
        /**参数名*/
        @KsYunField(name="DBParameter")
        private String DBParameter;

        /**预期值(目标库预期值)*/
        @KsYunField(name="TargetDBParameterValue")
        private String TargetDBParameterValue;

    }

    /**需要往目标库迁移'账号'时传递

```json
例如：
{
  "SourceType": "Krds",
  "TargetType": "Krds",
  "TargetRegion": "cn-beijing-6",
  "region": "cn-beijing-6",
  "DbSchema": "{\"is_full\":true}",
  "SubTasks": "BackupRecovery,RunReplication",
  "SourceRegion": "cn-beijing-6",
  "SourceInstanceId": "******",
  "TargetInstanceId": "******",
  "SourceUsername": "admin",
  "SourceUser": [
     {
        "Username":"testuser",
        "SourceHost":"%"
    }
  ],
  "DTSParameter": [
    {
      "DBParameter": "log_bin_trust_function_creators",
      "TargetDBParameterValue": "OFF"
    },
    {
      "DBParameter": "binlog_format",
      "TargetDBParameterValue": "ROW"
    }
  ],
  "SourcePassword": "******",
  "Type": "Transmission"
}
````*/
    @KsYunField(name = "SourceUser", type = 1)
    private List<SourceUserDto> SourceUserList;

    @Data
    @ToString
    public static class SourceUserDto {
        /**源库账号名(将要迁移到目标库的账号信息)*/
        @KsYunField(name="Username")
        private String Username;

        /**源库账号地址*/
        @KsYunField(name="SourceHost")
        private String SourceHost;

    }

}
