package ksyun.client.sqlserver.createdbinstance.v20190425;

import common.annotation.KsYunField;
import java.util.List;
import lombok.Data;

/**
 * @Classname CreateDBInstanceRequest @Description 请求参数
 */
@Data
public class CreateDBInstanceRequest {
  /**
   * 内存大小
   *
   * <p>```json 只能购买特定规格的套餐 ```
   */
  @KsYunField(name = "Mem")
  private Integer Mem;

  /**
   * 磁盘大小
   *
   * <p>
   *
   * <p>```json 只能购买特定规格的套餐 ```
   */
  @KsYunField(name = "Disk")
  private Integer Disk;

  /**
   * 实例名称
   *
   * <p>```json 不超过256个字节，仅支持中文、大小写字母、数字、减号和下划线 ```
   */
  @KsYunField(name = "DBInstanceName")
  private String DBInstanceName;

  /**
   * 引擎名称
   *
   * <p>```json 区分大小写，取值范围：SQLServer ```
   */
  @KsYunField(name = "Engine")
  private String Engine;

  /**
   * 引擎版本
   *
   * <p>```json 可根据用户及可用区配置； 2012sp4,2016sp2,2014sp2,2016sp2,2017 ```
   */
  @KsYunField(name = "EngineVersion")
  private String EngineVersion;

  /**
   * 数据库实例类型
   *
   * <p>```json HRDS_SS 高可用版 SS_HRDS_E 高可用云盘版 TRDS_SS 高可用临时版 SS_TRDS_E 临时云盘版 ```
   */
  @KsYunField(name = "DBInstanceType")
  private String DBInstanceType;

  /** 数据库用户密码 ```json 8-30个字符，必须包含大小写字母和数字，支持的特殊字符为!@#$%^&*()_+=- ``` */
  @KsYunField(name = "MasterUserPassword")
  private String MasterUserPassword;

  /** 数据库用户名 ```json root, rdsrepladmin, rdsadmin不可用。 默认：admin 可以根据需求修改 ``` */
  @KsYunField(name = "MasterUserName")
  private String MasterUserName;

  /** VPC网络ID，可在网络控制台获取。 */
  @KsYunField(name = "VpcId")
  private String VpcId;

  /** SubnetId */
  @KsYunField(name = "SubnetId")
  private String SubnetId;

  /** 数据库连接端口 */
  @KsYunField(name = "Port")
  private String Port;

  /**
   * 自动备份发起时间范围
   *
   * <p>```json 格式(hh:mm-hh:mm，如:01:00-02:00)，如不指定后台将随机分配 ```
   */
  @KsYunField(name = "PreferredBackupTime")
  private String PreferredBackupTime;

  /**
   * 参数组id
   *
   * <p>
   *
   * <p>```json 指定实例的参数组，如不指定，系统将采用默认的参数组来创建实例。用户需事先在控制台创建好参数组。 ```
   */
  @KsYunField(name = "DBParameterGroupId")
  private String DBParameterGroupId;

  /** 安全组id，不传入默认为空 */
  @KsYunField(name = "SecurityGroupId")
  private String SecurityGroupId;

  /**
   * 计费方式
   *
   * <p>```json 默认值：YEAR_MONTH; 取值范围： YEAR_MONTH（包年包月） DAY（按日计费） HourlyInstantSettlement(按量计费)。
   *
   * <p>建议您指定计费方式！！！ ```
   */
  @KsYunField(name = "BillType")
  private String BillType;

  /** 购买时长 */
  @KsYunField(name = "Duration")
  private String Duration;

  /**
   * 购买时长单位
   *
   * <p>
   *
   * <p>```json 取值范围：M（月），默认值：M（区分大小写）Y,M,D,H(年，月，天，小时) ```
   */
  @KsYunField(name = "DurationUnit")
  private String DurationUnit;

  /**
   * 可用区字段
   *
   * <p>```json
   * 示例(AvailabilityZone.1=cn-beijing-6a&AvailabilityZone.2=cn-beijing-6b)，表示实例的主副本在a区，备副本在b区。如果没有跨可用区的需求，建议将实例创建在云主机的可用区内已减少网络延时。
   * ```
   */
  @KsYunField(name = "AvailabilityZone")
  private List<String> AvailabilityZoneList;

  /**
   * 项目Id
   *
   * <p>```json 可从IAM获取ProjectId。可按项目来进行细粒度权限控制，将实例归类到某个项目下,不传时将实例归于默认项目 ```
   */
  @KsYunField(name = "ProjectId")
  private Integer ProjectId;
}
