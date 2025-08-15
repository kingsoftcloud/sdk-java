package ksyun.client.kcs.exportsnapshot.v20160701;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ExportSnapshotRequest @Description 请求参数
 */
@Data
public class ExportSnapshotRequest {
  /** 可用区 默认：对应机房的a区 */
  @KsYunField(name = "AvailableZone")
  private String AvailableZone;

  /** 备份ID */
  @KsYunField(name = "SnapshotId")
  private String SnapshotId;

  /** 存储空间名称 */
  @KsYunField(name = "BucketName")
  private String BucketName;

  /** 文件名称 */
  @KsYunField(name = "ObjectName")
  private String ObjectName;

  /** 实例Id。 */
  @KsYunField(name = "CacheId")
  private String CacheId;
}
