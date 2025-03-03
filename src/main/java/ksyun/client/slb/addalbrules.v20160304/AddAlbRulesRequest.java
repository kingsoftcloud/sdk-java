package ksyun.client.slb.addalbrules.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname AddAlbRulesRequest
 * @Description 请求参数
 */
@Data
public class AddAlbRulesRequest {
    /**
     * 转发策月id
     */
    @KsYunField(name = "AlbRuleGroupId")
    private String AlbRuleGroupId;

    /**
     * 转发策月规则类型
     */
    @KsYunField(name = "AlbRuleType")
    private String AlbRuleType;

    /**
     * 转发策月规则值
     */
    @KsYunField(name = "AlbRuleValue")
    private String AlbRuleValue;


}