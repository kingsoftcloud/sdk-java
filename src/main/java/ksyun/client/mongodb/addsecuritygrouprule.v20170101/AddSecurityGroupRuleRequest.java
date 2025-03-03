package ksyun.client.mongodb.addsecuritygrouprule.v20170101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname AddSecurityGroupRuleRequest
 * @Description 请求参数
 */
@Data
public class AddSecurityGroupRuleRequest {
    /**
     * 服务ID
     */
    @KsYunField(name = "InstanceId")
    private String InstanceId;

    /**
     * 安全规则IP地址
     * 0.0.0.0/16,0.0.0.0/24,多个","分隔
     */
    @KsYunField(name = "Cidrs")
    private String Cidrs;

    /**
     * 网络类型。可选：IPV4 或者 IPV6。请注意，字段值严格大写。
     */
    @KsYunField(name = "Type")
    private String Type;

}