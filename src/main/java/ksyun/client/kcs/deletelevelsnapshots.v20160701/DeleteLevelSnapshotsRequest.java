package ksyun.client.kcs.deletelevelsnapshots.v20160701;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DeleteLevelSnapshotsRequest
 * @Description 请求参数
 */
@Data
public class DeleteLevelSnapshotsRequest {
    /**
     * 缓存服务ID		缓存服务ID
     */
    @KsYunField(name = "CacheId")
    private String CacheId;

    /**
     * 备份ID		备份ID
     */
    @KsYunField(name = "SnapshotId")
    private String SnapshotId;

}