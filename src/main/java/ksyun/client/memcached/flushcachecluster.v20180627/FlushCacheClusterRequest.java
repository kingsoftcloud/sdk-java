package ksyun.client.memcached.flushcachecluster.v20180627;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname FlushCacheClusterRequest
 * @Description 请求参数
 */
@Data
public class FlushCacheClusterRequest {
    /**
     * Action
     */
    @KsYunField(name = "Action")
    private String Action;

    /**
     * Version
     */
    @KsYunField(name = "Version")
    private String Version;

}