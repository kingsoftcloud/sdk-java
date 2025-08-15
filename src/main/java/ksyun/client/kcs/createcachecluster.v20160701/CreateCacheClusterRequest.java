package ksyun.client.kcs.createcachecluster.v20160701;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname CreateCacheClusterRequest @Description 请求参数
 */
@Data
public class CreateCacheClusterRequest {
  /** 可用区 默认：对应机房的a区 */
  @KsYunField(name = "AvailableZone")
  private String AvailableZone;

  /** 缓存服务名称 支持6-64个中文或者英文字符，包括汉字，大小写字母，数字，下划线和中划线 */
  @KsYunField(name = "Name")
  private String Name;

  /** 缓存服务密码。可不填（无密码）或者密码须符合以下规则：含大写字母、小写字母、数字、特殊字符（!@#$%^&*()_+=-）4中字符中的3种以上，且长度为8-30个字符。 */
  @KsYunField(name = "PassWord")
  private String PassWord;

  /** 缓存服务的模式。 默认：2，取值范围：2：单主从；3：自定义集群。 */
  @KsYunField(name = "Mode")
  private Integer Mode;

  /** 缓存服务IP 默认为：自动分配，填写则为指定IP */
  @KsYunField(name = "Vip")
  private String Vip;

  /**
   * 缓存服务容量。主从实例（mode为2）默认1G，集群必填。
   * 缓存服务内存大小，以GB为单位，参照请见－[缓存服务容量](https://docs.ksyun.com/documents/38475)
   */
  @KsYunField(name = "Capacity")
  private Integer Capacity;

  /** 虚拟专用网络 VPC网络ID，可在网络控制台获取 */
  @KsYunField(name = "VpcId")
  private String VpcId;

  /** 终端子网ID 终端子网ID，可在网络控制台获取（注意类型必须为终端子网） */
  @KsYunField(name = "VnetId")
  private String VnetId;

  /** 计费方式 默认：1。范围：1包年包月，5按量付费（按日月结），87按量付费。 参照请见－[计费方式](https://docs.ksyun.com/documents/38477) */
  @KsYunField(name = "BillType")
  private Integer BillType;

  /** 时长 默认：1，BillType=1(包年包月)必填，最大支持范围是(1 ~36月) */
  @KsYunField(name = "Duration")
  private Integer Duration;

  /** 项目ID 默认为0：默认项目 */
  @KsYunField(name = "IamProjectId")
  private String IamProjectId;

  /** 缓存服务版本 集群默认：4.0、单主从默认：4.0，参照请见－[缓存服务版本](https://docs.ksyun.com/documents/38472) */
  @KsYunField(name = "Protocol")
  private String Protocol;

  /** 自动备份时间 不设置参数代表不开启自动备份，参照请见－[自动备份时间格式](https://docs.ksyun.com/documents/38478) */
  @KsYunField(name = "BackupTimezone")
  private String BackupTimezone;

  /**
   * 安全组ID 安全组ID，可通过安全组模块的列表查询获取到具体的安全组ID 参见 [查询安全组列表](https://docs.ksyun.com/documents/38503)
   * 。此接口为20年10月新增参数
   */
  @KsYunField(name = "SecurityGroupId")
  private String SecurityGroupId;

  /** 主从实例的只读节点数量 默认：0，取值范围：0~7（注意当缓存服务方式：2.单主从时生效） */
  @KsYunField(name = "SlaveNum")
  private Integer SlaveNum;

  /** 主从实例的只读节点IP。 默认为：自动分配，填写则为指定IP。 （注意当缓存服务mode：2.单主从时生效） */
  @KsYunField(name = "SlaveVip")
  private String SlaveVip;

  /** 主从实例从节点可用区az。 （注意当缓存服务mode：2.单主从时，且当前Region支持多az生效） */
  @KsYunField(name = "PrepareAzName")
  private String PrepareAzName;

  /** 主从只读实例可用区az。（注意当缓存服务mode：2.单主从时，且当前Region支持多az生效） */
  @KsYunField(name = "RrAzName")
  private String RrAzName;

  /** 集群分片数量。（注意当缓存服务mode：1. 集群时必填）。 */
  @KsYunField(name = "ShardNum")
  private Integer ShardNum;

  /** 集群每个分片内存大小。（注意当缓存服务mode：1. 集群时必填）。 */
  @KsYunField(name = "ShardSize")
  private Integer ShardSize;

  /** 是否开启读写分离。可选范围：0（关闭），1（开启）。默认为0。请注意，目前仅集群实例支持。 */
  @KsYunField(name = "Separation")
  private Integer Separation;
}
