package ksyun.client.memcached.describecachecluster.v20180627;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribeCacheClusterRequest
 * @Description 请求参数
 */
@Data
public class DescribeCacheClusterRequest {
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