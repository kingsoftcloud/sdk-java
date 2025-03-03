package ksyun.client.ebs.rollbacksnapshot.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname RollbackSnapshotRequest
 * @Description 请求参数
 */
@Data
public class RollbackSnapshotRequest {
    /**
     * 云盘ID，长度36个字符，包括字母、数字、-
     */
    @KsYunField(name = "VolumeId")
    private String VolumeId;

    /**
     * 快照ID
     */
    @KsYunField(name = "SnapshotId")
    private String SnapshotId;


}