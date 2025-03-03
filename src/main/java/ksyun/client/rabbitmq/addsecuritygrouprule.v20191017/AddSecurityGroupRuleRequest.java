package ksyun.client.rabbitmq.addsecuritygrouprule.v20191017;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname AddSecurityGroupRuleRequest
 * @Description 请求参数
 */
@Data
public class AddSecurityGroupRuleRequest {
    /**
     * 实例Id。
     */
    @KsYunField(name = "InstanceId")
    private String InstanceId;

    /**
     * IP地址段。如：0.0.0.0/16,0.0.0.0/24。多个","分隔
     */
    @KsYunField(name = "Cidrs")
    private String Cidrs;


}