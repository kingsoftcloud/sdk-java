package ksyun.client.rabbitmq.deletesecuritygrouprules.v20191017;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DeleteSecurityGroupRulesRequest
 * @Description 请求参数
 */
@Data
public class DeleteSecurityGroupRulesRequest {
    /**
     * 实例Id。
     */
    @KsYunField(name = "InstanceId")
    private String InstanceId;

    /**
     * Ip地址段，如：0.0.0.0/16,0.0.0.0/24。多个以","分隔
     */
    @KsYunField(name = "Cidrs")
    private String Cidrs;


}