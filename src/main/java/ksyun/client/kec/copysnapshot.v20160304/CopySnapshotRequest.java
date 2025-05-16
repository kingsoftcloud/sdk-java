package ksyun.client.kec.copysnapshot.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname CopySnapshotRequest
 * @Description 请求参数
 */
@Data
public class CopySnapshotRequest {
    /**
     * CopySnapshot
     */
    @KsYunField(name = "SnapshotId")
    private List<String> SnapshotIdList;

    /**
     * 目标省区
     */
    @KsYunField(name = "DestinationRegion")
    private List<String> DestinationRegionList;

    /**
     * 快照名称
     */
    @KsYunField(name = "DestinationSnapshotName")
    private String DestinationSnapshotName;

    /**
     * 快照描述
     */
    @KsYunField(name = "DestinationSnapshotDesc")
    private String DestinationSnapshotDesc;

}