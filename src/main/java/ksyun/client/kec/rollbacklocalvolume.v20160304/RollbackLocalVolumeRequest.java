package ksyun.client.kec.rollbacklocalvolume.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname RollbackLocalVolumeRequest @Description 请求参数
 */
@Data
public class RollbackLocalVolumeRequest {
  /** 快照Id。 */
  @KsYunField(name = "LocalVolumeSnapshotId")
  private String LocalVolumeSnapshotId;
}
