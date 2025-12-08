package ksyun.client.postgresql.createdbinstance.v20181225;

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
    /**客户只能购买特定规格的套餐，否则将会报错,    注:各规格对应连接数和iops见下方附表.

| 实例规格 | 最大连接数 | 读IOPS | 写IOPS | 对应磁盘取值范围(步长均为5) |
| :- | - | - | - | - |
| **1G** | 200 | 1200 | 1200 | *5~40* |
| **2G** | 400 | 2400 | 2400 | *5~80* |
| **4G** | 800 | 4800 | 4800 | *5~200* |
| **8G** | 1600 | 9600 | 9600 | *5~300* |
| **12G** | 2400 | 14400 | 14400 | *5~500* |
| **16G** | 3200 | 19200 | 19200 | *5~600* |
| **24G** | 4800 | 28800 | 28800 | *5~1000* |
| **32G** | 6400 | 38400 | 38400 | *5~1500* |
| **48G** | 9600 | 57600 |  57600 | *5~2000* |*/
    @KsYunField(name="Mem")
    private Integer Mem;

    /**客户只能购买特定规格的套餐，单位为G,否则将会报错*/
    @KsYunField(name="Disk")
    private Integer Disk;

    /**实例名称
不超过256个字节，仅支持中文、大小写字母、数字、减号和下划线*/
    @KsYunField(name="DBInstanceName")
    private String DBInstanceName;

    /**实例数据库引擎名称
取固定值：postgresql*/
    @KsYunField(name="Engine")
    private String Engine;

    /**实例数据库引擎版本
取值范围：9.6 |  10  |   11  |   12.5  |   13*/
    @KsYunField(name="EngineVersion")
    private String EngineVersion;

    /**数据库用户密码
8-30个字符，必须包含大小写字母和数字，支持的特殊字符为!@#$%^&*()_+=-*/
    @KsYunField(name="MasterUserPassword")
    private String MasterUserPassword;

    /**数据库用户名
root, rdsrepladmin, rdsadmin,dtsroot, postgres不可用*/
    @KsYunField(name="MasterUserName")
    private String MasterUserName;

    /**数据库类型,区分大小写,取固定值：高可用实例：HRDS_PG
*/
    @KsYunField(name="DBInstanceType")
    private String DBInstanceType;

    /**VPC网络ID，可在网络控制台获取。*/
    @KsYunField(name="VpcId")
    private String VpcId;

    /**终端子网ID，可在网络控制台获取（注意类型必须为终端子网）。*/
    @KsYunField(name="SubnetId")
    private String SubnetId;

    /**自动备份发起时间范围
格式(hh:mm-hh:mm，如:01:00-02:00)，如不指定后台将随机分配*/
    @KsYunField(name="PreferredBackupTime")
    private String PreferredBackupTime;

    /**参数组id
指定实例的参数组，如不指定，系统将采用默认的参数组来创建实例。用户需事先在控制台创建好参数组。*/
    @KsYunField(name="DBParameterGroupId")
    private String DBParameterGroupId;

    /**安全组id，不传入默认为空*/
    @KsYunField(name="SecurityGroupId")
    private String SecurityGroupId;

    /**数据库连接端口,默认:5432*/
    @KsYunField(name="Port")
    private String Port;

    /**计费方式
默认值：YEAR_MONTH，取值范围：YEAR_MONTH（包年包月）,DAY（按日计费）。*/
    @KsYunField(name="BillType")
    private String BillType;

    /**购买时长
默认值：1 单位为月,选择YEAR_MONTH时计费方式必传.*/
    @KsYunField(name="Duration")
    private String Duration;

    /**购买时长单位
取值范围：M（月），默认值：M（区分大小写）,选择YEAR_MONTH时计费方式必传.*/
    @KsYunField(name="DurationUnit")
    private String DurationUnit;

    /**可用区字段;
示例(AvailabilityZone.1=cn-beijing-6a&AvailabilityZone.2=cn-beijing-6b)，表示实例的主副本在a区，备副本在b区。如果没有跨可用区的需求，建议将实例创建在云主机的可用区内已减少网络延时。*/
    @KsYunField(name="AvailabilityZone",type=2)
    private List<String> AvailabilityZoneList;

    /**项目Id
可从IAM获取ProjectId。可按项目来进行细粒度权限控制，将实例归类到某个项目下*/
    @KsYunField(name="ProjectId")
    private String ProjectId;

}
