package ksyun.client.memcached.describecachesecurityrules.v20180627;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribeCacheSecurityRulesRequest
 * @Description 请求参数
 */
@Data
public class DescribeCacheSecurityRulesRequest {
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