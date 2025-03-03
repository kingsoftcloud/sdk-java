package ksyun.client.kcs.describeparentbackupssnapshots.v20160701;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribeParentBackUpsSnapshotsRequest
 * @Description 请求参数
 */
@Data
public class DescribeParentBackUpsSnapshotsRequest {
    /**
     * 缓存服务ID		缓存服务ID
     */
    @KsYunField(name = "CacheId")
    private String CacheId;


}