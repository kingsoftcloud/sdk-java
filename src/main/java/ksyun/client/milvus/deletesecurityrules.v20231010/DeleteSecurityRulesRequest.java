package ksyun.client.milvus.deletesecurityrules.v20231010;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname DeleteSecurityRulesRequest
 * @Description 请求参数
 */
@Data
public class DeleteSecurityRulesRequest {
    /**
     * 安全组ID
     */
    @KsYunField(name = "SecurityGroupId")
    private String SecurityGroupId;

    /**
     * 规则ID，支持批量(英文逗号隔开)
     */
    @KsYunField(name = "RuleIds")
    private String RuleIds;

}