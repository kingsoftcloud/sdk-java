package ksyun.client.memcached.resizecachecluster.v20180627;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ResizeCacheClusterRequest
 * @Description 请求参数
 */
@Data
public class ResizeCacheClusterRequest {
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