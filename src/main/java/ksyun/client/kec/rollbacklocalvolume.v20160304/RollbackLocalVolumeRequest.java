package ksyun.client.kec.rollbacklocalvolume.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname RollbackLocalVolumeRequest
 * @Description 请求参数
 */
@Data
public class RollbackLocalVolumeRequest {
    /**
     * 快照Id。
     */
    @KsYunField(name = "LocalVolumeSnapshotId")
    private String LocalVolumeSnapshotId;

}