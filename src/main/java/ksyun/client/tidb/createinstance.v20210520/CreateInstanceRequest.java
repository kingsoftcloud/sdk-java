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

    /**集群已开启的实例类型,多个模块用逗号分隔。如："tidb,pd,tikv,timonitor"。*/
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

    /**最大备份记录数。*/
    @KsYunField(name="BackupConfig.MaxBackups")
    private Integer BackupConfigMaxBackups;

    /**备份记录最大保留时长，单位：小时。*/
    @KsYunField(name="BackupConfig.MaxReservedHours")
    private Integer BackupConfigMaxReservedHours;

    /**自动备份时间段。默认值："01:00-02:00"。*/
    @KsYunField(name="BackupConfig.PreferredBackupTime")
    private String BackupConfigPreferredBackupTime;

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


}