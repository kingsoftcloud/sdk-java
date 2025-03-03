package ksyun.client.influxdb.deletesecurityrule.v20191010;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DeleteSecurityRuleRequest
 * @Description 请求参数
 */
@Data
public class DeleteSecurityRuleRequest {
    /***/
    @KsYunField(name = "InstanceId")
    private String InstanceId;

    /***/
    @KsYunField(name = "SecurityRuleIds")
    private String SecurityRuleIds;

}