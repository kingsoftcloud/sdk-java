package ksyun.client.memcached.describecacheclusters.v20180627;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribeCacheClustersRequest
 * @Description 请求参数
 */
@Data
public class DescribeCacheClustersRequest {
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