package ksyun.client.vpc.revokesecuritygroupentry.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname RevokeSecurityGroupEntryRequest
 * @Description 请求参数
 */
@Data
public class RevokeSecurityGroupEntryRequest {
    /**
     * 安全组的ID
     */
    @KsYunField(name = "SecurityGroupId")
    private String SecurityGroupId;

    /**
     * 安全组规则的ID
     */
    @KsYunField(name = "SecurityGroupEntryId")
    private String SecurityGroupEntryId;

}