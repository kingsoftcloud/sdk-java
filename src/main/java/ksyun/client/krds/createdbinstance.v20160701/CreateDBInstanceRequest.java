package ksyun.client.krds.createdbinstance.v20160701;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreateDBInstanceRequest
* @Description 请求参数
*/
@Data
public class CreateDBInstanceRequest{
    /**内存大小	客户只能购买特定规格的套餐，否则将会报错*/
    @KsYunField(name="Mem")
    private Integer Mem;

    /**磁盘大小	客户只能购买特定规格的套餐，否则将会报错*/
    @KsYunField(name="Disk")
    private Integer Disk;

    /**实例名称	不超过256个字节，仅支持中文、大小写字母、数字、减号和下划线*/
    @KsYunField(name="DBInstanceName")
    private String DBInstanceName;

    /**实例中数据库引擎的名称	区分大小写，取值范围：mysql、percona，企业版：consistent_mysql(5.7)，云盘版：ebs_mysql（5.6/5.7）*/
    @KsYunField(name="Engine")
    private String Engine;

    /**实例中数据库引擎的版本	取值范围：其中mysql支持：5.5、5.6、5.7、8.0；其中percona支持：5.6*/
    @KsYunField(name="EngineVersion")
    private String EngineVersion;

    /**数据库用户密码	8-30个字符，必须包含大小写字母和数字，支持的特殊字符为!@#$%^&*()_+=-*/
    @KsYunField(name="MasterUserPassword")
    private String MasterUserPassword;

    /**数据库用户名	root, rdsrepladmin, rdsadmin不可用*/
    @KsYunField(name="MasterUserName")
    private String MasterUserName;

    /**数据库类型	区分大小写,取值范围：高可用实例：HRDS、单实例：SINGLERDS、企业版：ERDS、云盘版：CDS_HRDS*/
    @KsYunField(name="DBInstanceType")
    private String DBInstanceType;

    /**VPC网络ID，可在网络控制台获取。*/
    @KsYunField(name="VpcId")
    private String VpcId;

    /**VPC 终端子网ID，可在网络控制台获取（注意类型必须为终端子网）。*/
    @KsYunField(name="SubnetId")
    private String SubnetId;

    /**自动备份发起时间范围	格式(hh:mm-hh:mm，如:01:00-02:00)，如不指定后台将随机分配*/
    @KsYunField(name="PreferredBackupTime")
    private String PreferredBackupTime;

    /**参数组ID 指定实例的参数组，如不指定，系统将采用默认的参数组来创建实例。用户需事先在控制台创建好参数组。*/
    @KsYunField(name="DBParameterGroupId")
    private String DBParameterGroupId;

    /**安全组ID。不传入默认为空*/
    @KsYunField(name="SecurityGroupId")
    private String SecurityGroupId;

    /**数据库连接端口	默认3306*/
    @KsYunField(name="Port")
    private String Port;

    /**计费方式	默认值：YEAR_MONTH
```json
包年包月:YEAR_MONTH
按量付费(按日月结):DAY
按量付费:HourlyInstantSettlement

备注：
1.按日月结（按日配置付费月结）
2.按量付费 (按小时实时结算，按量实时计费&结算）
```*/
    @KsYunField(name="BillType")
    private String BillType;

    /**购买时长	默认值：1*/
    @KsYunField(name="Duration")
    private String Duration;

    /**购买时长单位	取值范围：M（月），默认值：M（区分大小写）*/
    @KsYunField(name="DurationUnit")
    private String DurationUnit;

    /**可用区字段	示例(AvailabilityZone.1=cn-beijing-6a&AvailabilityZone.2=cn-beijing-6b)，表示实例的主副本在a区，备副本在b区。如果没有跨可用区的需求，建议将实例创建在云主机的可用区内已减少网络延时。其中企业版ERDS可用区为3个（1主2备）*/
    @KsYunField(name = "AvailabilityZone", type = 1)
    private List<String> AvailabilityZoneList;

    /**项目ID	可从IAM获取ProjectId。可按项目来进行细粒度权限控制，将实例归类到某个项目下*/
    @KsYunField(name="ProjectId")
    private Integer ProjectId;

    /**表名是否区分大小写	取值范围：1：表名不区分大小写    0：表名区分大小写。不传则默认为不区分大小写*/
    @KsYunField(name="TableNamesAreCaseSensitive")
    private Integer TableNamesAreCaseSensitive;

}
