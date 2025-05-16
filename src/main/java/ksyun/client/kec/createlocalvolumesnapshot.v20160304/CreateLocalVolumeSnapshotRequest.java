package ksyun.client.kec.createlocalvolumesnapshot.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname CreateLocalVolumeSnapshotRequest
 * @Description 请求参数
 */
@Data
public class CreateLocalVolumeSnapshotRequest {
    /**
     * 待创建快照的本地盘ID。
     */
    @KsYunField(name = "LocalVolumeId")
    private String LocalVolumeId;

    /**
     * 快照名称。
     */
    @KsYunField(name = "LocalVolumeSnapshotName")
    private String LocalVolumeSnapshotName;

    /**
     * 快照详情描述。
     */
    @KsYunField(name = "LocalVolumeSnapshotDesc")
    private String LocalVolumeSnapshotDesc;

    /**
     * 支持快速开盘/快速变更，该参数仅对本地盘/本地盘机型/本地盘快照生效
     */
    @KsYunField(name = "InstantAccess")
    private Boolean InstantAccess;

}