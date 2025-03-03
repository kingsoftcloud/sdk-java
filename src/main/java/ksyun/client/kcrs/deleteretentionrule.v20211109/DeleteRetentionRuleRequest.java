package ksyun.client.kcrs.deleteretentionrule.v20211109;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DeleteRetentionRuleRequest
 * @Description 请求参数
 */
@Data
public class DeleteRetentionRuleRequest {
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