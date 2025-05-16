package ksyun.client.milvus.createsecurityrules.v20231010;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname CreateSecurityRulesRequest
 * @Description 请求参数
 */
@Data
public class CreateSecurityRulesRequest {
    /**
     * 安全组ID
     */
    @KsYunField(name = "SecurityGroupId")
    private String SecurityGroupId;

    /**
     * 安全组规则列表(支持多个)
     */
    @KsYunField(name = "Rules")
    private List<RulesDto> RulesList;

    @Data
    @ToString
    public static class RulesDto {
        /**
         * cidr规则(支持0-32)
         */
        @KsYunField(name = "Cidr")
        private String Cidr;
        /**
         * cidr规则描述
         */
        @KsYunField(name = "Detail")
        private String Detail;
    }

}