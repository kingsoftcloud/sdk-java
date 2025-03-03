package ksyun.client.memcached.createcachecluster.v20180627;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname CreateCacheClusterRequest
 * @Description 请求参数
 */
@Data
public class CreateCacheClusterRequest {
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

    /**
     * 项目ID
     */
    @KsYunField(name = "IamProjectId")
    private String IamProjectId;

}