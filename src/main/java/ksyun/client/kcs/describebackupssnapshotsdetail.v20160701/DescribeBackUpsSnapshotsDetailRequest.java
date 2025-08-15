package ksyun.client.kcs.describebackupssnapshotsdetail.v20160701;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribeBackUpsSnapshotsDetailRequest @Description 请求参数
 */
@Data
public class DescribeBackUpsSnapshotsDetailRequest {
  /** 缓存服务ID */
  @KsYunField(name = "CacheId")
  private String CacheId;

  /** 备份ID */
  @KsYunField(name = "SnapshotId")
  private String SnapshotId;
}
