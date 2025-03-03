package ksyun.client.kcs.downloadsnapshot.v20160701;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DownloadSnapshotRequest
 * @Description 请求参数
 */
@Data
public class DownloadSnapshotRequest {
    /**
     * 可用区   	 默认：对应机房的a区
     */
    @KsYunField(name = "AvailableZone")
    private String AvailableZone;

    /**
     * 备份ID
     */
    @KsYunField(name = "SnapshotId")
    private String SnapshotId;

}