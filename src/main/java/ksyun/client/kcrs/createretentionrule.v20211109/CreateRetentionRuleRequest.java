package ksyun.client.kcrs.createretentionrule.v20211109;

import common.annotation.KsYunField;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname CreateRetentionRuleRequest
 * @Description 请求参数
 */
@Data
public class CreateRetentionRuleRequest {
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

    /**
     * 参数实体类
     */
    @KsYunField(name = "Rule")

    private RuleDto RuleList;

    @Data
    @ToString
    public static class RuleDto {
        /**
         * 生效范围，多个仓库用逗号隔开
         */
        @KsYunField(name = "Scope")
        private String Scope;
        /**
         * 保留策略为镜像版本时，Template=always
         * <p>
         * 保留策略为镜像数量时，Template =latestPushedK/latestPulledN/nDaysSinceLastPush/nDaysSinceLastPull，分别对应“保留最新推送的#个镜像”，“保留最新拉取的#个镜像”，“保留最近#天推送的镜像”，“保留最近#天拉取的镜像”
         */
        @KsYunField(name = "Template")
        private String Template;
        /**
         * 在保留策略为镜像版本时必选 ，匹配版本名称，支持正则表达式，如repo*或**
         */
        @KsYunField(name = "Tag")
        private String Tag;
        /**
         * 在保留策略为镜像版本时可选  ，是否匹配无tag版本，默认为true
         */
        @KsYunField(name = "UnTagged")
        private Boolean UnTagged;
        /**
         * 在保留策略为镜像数量时必选 ，对应保留策略的数量值
         */
        @KsYunField(name = "Param")
        private String Param;
        /**
         * 是否禁用，默认false
         */
        @KsYunField(name = "Disabled")
        private Boolean Disabled;
    }
}