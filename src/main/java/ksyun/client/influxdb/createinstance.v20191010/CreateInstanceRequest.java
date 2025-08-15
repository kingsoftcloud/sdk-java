package ksyun.client.influxdb.createinstance.v20191010;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname CreateInstanceRequest @Description 请求参数
 */
@Data
public class CreateInstanceRequest {
  /** 项目id */
  @KsYunField(name = "ProjectId")
  private String ProjectId;

  /***/
  @KsYunField(name = "InstanceName")
  private String InstanceName;

  /** 366 标准版 504 集群版 */
  @KsYunField(name = "ProductType")
  private String ProductType;

  /** 目前仅支持1.8.0 */
  @KsYunField(name = "EngineVersion")
  private String EngineVersion;

  /***/
  @KsYunField(name = "InstanceType")
  private String InstanceType;

  /** 默认值是SSD3.0，目前仅支持SSD3.0 */
  @KsYunField(name = "EbsType")
  private String EbsType;

  /** 云盘大小，单位是GB */
  @KsYunField(name = "EbsSize")
  private Integer EbsSize;

  /** VPC网络ID，可在网络控制台获取 */
  @KsYunField(name = "VpcId")
  private String VpcId;

  /** 终端子网ID，可在网络控制台获取（注意类型必须为终端子网） */
  @KsYunField(name = "SubnetId")
  private String SubnetId;

  /** 默认是5，5按日配置月结 */
  @KsYunField(name = "BillType")
  private Integer BillType;
}
