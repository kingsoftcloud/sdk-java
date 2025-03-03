package ksyun.client.memcached.deletecachesecurityrule.v20180627;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DeleteCacheSecurityRuleRequest
 * @Description 请求参数
 */
@Data
public class DeleteCacheSecurityRuleRequest {
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