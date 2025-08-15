package ksyun.client.kec.deletelocalvolumesnapshot.v20160304;

import common.annotation.KsYunField;
import java.util.List;
import lombok.Data;

/**
 * @Classname DeleteLocalVolumeSnapshotRequest @Description 请求参数
 */
@Data
public class DeleteLocalVolumeSnapshotRequest {
  /** 快照Id，支持批量删除，格式为LocalVolumeSnapshotId.N=XXX，N=1,2,3…100。 */
  @KsYunField(name = "LocalVolumeSnapshotId")
  private List<String> LocalVolumeSnapshotIdList;
}
