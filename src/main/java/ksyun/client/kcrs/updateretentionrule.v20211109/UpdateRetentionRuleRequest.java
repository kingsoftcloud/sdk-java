package ksyun.client.kcrs.updateretentionrule.v20211109;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname UpdateRetentionRuleRequest
 * @Description 请求参数
 */
@Data
public class UpdateRetentionRuleRequest {
    /**
     * 实例Id
     */
    @KsYunField(name = "InstanceId")
    private String InstanceId;

    /**
     * 命名空间
     */
    @KsYunField(name = "Namespace")
    private String Namespace;

}