package ksyun.client.memcached.renamecachecluster.v20180627;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname RenameCacheClusterRequest
 * @Description 请求参数
 */
@Data
public class RenameCacheClusterRequest {
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