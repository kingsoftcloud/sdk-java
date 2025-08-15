package ksyun.client.kec.createfilesystem.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname CreateFileSystemRequest @Description 请求参数
 */
@Data
public class CreateFileSystemRequest {
  /**
   * 产品服务地点，在支持可用区的Region下有效；<br>
   * cn-beijing-6a：华北1（北京）可用区A
   */
  @KsYunField(name = "AvailabilityZone")
  private String AvailabilityZone;

  /** 主网卡VPC ID。标准UUID格式，[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$ */
  @KsYunField(name = "VpcId")
  private String VpcId;

  /** 文件系统类型，当前支持容量型。有效值： Capacity */
  @KsYunField(name = "StorageType")
  private String StorageType;

  /** 协议类型，支持NFS，CIFS */
  @KsYunField(name = "ProtocolType")
  private String ProtocolType;

  /** 文件系统名称，有效值：长度2-64字符，支持中文，字母，数字，以及-_； */
  @KsYunField(name = "FileSystemName")
  private String FileSystemName;

  /** 项目制id */
  @KsYunField(name = "ProjectId")
  private Integer ProjectId;
}
