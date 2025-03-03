package ksyun.client.kcs.downloadlevelsnapshot.v20160701;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DownloadLevelSnapshotRequest
 * @Description 请求参数
 */
@Data
public class DownloadLevelSnapshotRequest {
    /**
     * 缓存服务ID
     */
    @KsYunField(name = "CacheId")
    private String CacheId;

    /**
     * 备份ID
     */
    @KsYunField(name = "SnapshotId")
    private String SnapshotId;


}