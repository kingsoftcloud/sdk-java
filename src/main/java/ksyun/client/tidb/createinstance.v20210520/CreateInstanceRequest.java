package ksyun.client.tidb.createinstance.v20210520;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreateInstanceRequest
* @Description 请求参数
*/
@Data
public class CreateInstanceRequest{
    /**实例名称。需满足以下规则：6-64个中文或者英文字符，包括汉字，大小写字母，数字，下划线及中划线*/
    @KsYunField(name="InstanceName")
    private String InstanceName;

    /**集群已开启的实例类型,多个模块用逗号分隔。如："tidb,pd,tikv,timonitor,tidcd"。*/
    @KsYunField(name="EnableModules")
    private String EnableModules;

    /**集群各个模块配置, 需与EnableModules参数中定义的各模块对应。Object:         {
            "moduleType": "tidb",
            "packageCode": "DB_1C2G",
            "replicas": 1,
            "cpu": 1,
            "mem": 2,
            "tidisk": 0
        }*/
    @KsYunField(name="ModuleConfigs",type=2)
    private List<ModuleConfigsDto> ModuleConfigsList;

    @Data
    @ToString
    public static class ModuleConfigsDto {
        /**模块类型*/
        @KsYunField(name="ModuleType")
        private String ModuleType;

        /**模块套餐*/
        @KsYunField(name="PackageCode")
        private String PackageCode;

        /**模块副本数*/
        @KsYunField(name="Replicas")
        private Integer Replicas;

        /**模块CPU数*/
        @KsYunField(name="Cpu")
        private Integer Cpu;

        /**模块Mem数*/
        @KsYunField(name="Mem")
        private Integer Mem;

        /**模块disk数- */
        @KsYunField(name="Tidisk")
        private Integer Tidisk;

    }

    /**管理员账号名称，默认：root。*/
    @KsYunField(name="AdminUser")
    private String AdminUser;

    /**管理员账号密码。*/
    @KsYunField(name="AdminPassword")
    private String AdminPassword;

    /**虚拟网络ID。*/
    @KsYunField(name="VpcId")
    private String VpcId;

    /**终端子网ID。*/
    @KsYunField(name="SubnetId")
    private String SubnetId;

    /**计费类型。可选：1(包年包月)；5（按量付费-按日月结）；87（按量付费）。*/
    @KsYunField(name="BillType")
    private Integer BillType;

    /**仅计费类型为包年包月（BillType=1）时用。默认为1。*/
    @KsYunField(name="Duration")
    private String Duration;

    /**商品类型。取固定值：577。*/
    @KsYunField(name="ProductType")
    private Integer ProductType;

    /**项目制ID。如默认项目："0"。*/
    @KsYunField(name="ProjectId")
    private String ProjectId;

    /**开启自动备份。取固定值：true。*/
    @KsYunField(name="EnableAutoBackup")
    private Boolean EnableAutoBackup;

    /**实例引擎。默认：tidb。*/
    @KsYunField(name="Engine")
    private String Engine;

    /**引擎版本。默认：4.0。*/
    @KsYunField(name="EngineVersion")
    private String EngineVersion;

    /**实例端口。默认：4000。*/
    @KsYunField(name="ClientPort")
    private Integer ClientPort;

    /**可用区。*/
    @KsYunField(name="Az")
    private String Az;

    /**安全组ID。*/
    @KsYunField(name="SecurityGroupId")
    private String SecurityGroupId;

    /**备份配置*/
    @KsYunField(name="BackupConfig")
    private BackupConfigDto BackupConfig;

    @Data
    @ToString
    public static class BackupConfigDto {
        /**最大备份记录数。暂不可改*/
        @KsYunField(name="MaxBackups")
        private String MaxBackups;

        /**备份最大保留时长，单位：小时；
默认：72小时*/
        @KsYunField(name="MaxReservedHours")
        private String MaxReservedHours;

        /**自动备份时间段。默认值：“01:00-02:00”。*/
        @KsYunField(name="PreferredBackupTime")
        private String PreferredBackupTime;

    }

    /**实例备份id(指定备份恢复时需传)*/
    @KsYunField(name="backupId")
    private String BackupId;

    /**备份恢复实例ID(根据时间点恢复的源实例)
```
指定时间点恢复，需要如下参数都传

注意：
backupRestoreInstanceId
backupRestoreTime
```*/
    @KsYunField(name="backupRestoreInstanceId")
    private String BackupRestoreInstanceId;

    /**备份恢复时间点(根据时间点恢复的指定时间点)
```
格式：2024-03-14 10:46:02

注意：
backupRestoreInstanceId
backupRestoreTime
```*/
    @KsYunField(name="backupRestoreTime")
    private String BackupRestoreTime;

}
