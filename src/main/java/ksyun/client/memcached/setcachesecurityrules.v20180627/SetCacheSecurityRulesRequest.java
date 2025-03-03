package ksyun.client.memcached.setcachesecurityrules.v20180627;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname SetCacheSecurityRulesRequest
 * @Description 请求参数
 */
@Data
public class SetCacheSecurityRulesRequest {
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