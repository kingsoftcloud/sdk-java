package ksyun.client.kcs.restartcachecluster.v20160701;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname RestartCacheClusterRequest
 * @Description 请求参数
 */
@Data
public class RestartCacheClusterRequest {
    /**
     * 可用区     	 默认：对应机房的a区
     */
    @KsYunField(name = "AvailableZone")
    private String AvailableZone;

    /**
     * 缓存服务ID
     */
    @KsYunField(name = "CacheId")
    private String CacheId;

}