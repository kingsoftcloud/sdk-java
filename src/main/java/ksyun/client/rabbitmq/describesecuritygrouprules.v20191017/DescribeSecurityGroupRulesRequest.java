package ksyun.client.rabbitmq.describesecuritygrouprules.v20191017;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribeSecurityGroupRulesRequest
 * @Description 请求参数
 */
@Data
public class DescribeSecurityGroupRulesRequest {
    /**
     * 实例Id。
     */
    @KsYunField(name = "InstanceId")
    private String InstanceId;


}