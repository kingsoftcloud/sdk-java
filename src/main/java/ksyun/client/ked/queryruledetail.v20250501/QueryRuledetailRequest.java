package ksyun.client.ked.queryruledetail.v20250501;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname QueryRuledetailRequest
 * @Description 请求参数
 */
@Data
public class QueryRuledetailRequest {
    /**
     * 策略组 id
     */
    @KsYunField(name = "securityGroupId")
    private String SecurityGroupId;

}