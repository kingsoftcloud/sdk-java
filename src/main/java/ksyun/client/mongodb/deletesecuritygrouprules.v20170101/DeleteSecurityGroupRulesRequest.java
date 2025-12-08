package ksyun.client.mongodb.deletesecuritygrouprules.v20170101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DeleteSecurityGroupRulesRequest
* @Description 请求参数
*/
@Data
public class DeleteSecurityGroupRulesRequest{
    /**cidr字段集合。安全组规则id在白名单列表中获取。 */
    @KsYunField(name="Cidrs")
    private String Cidrs;

    /**实例ID。*/
    @KsYunField(name="InstanceId")
    private String InstanceId;

    /**网络类型	。可选：IPV4 或者 IPV6。 请注意，字段值严格大写。*/
    @KsYunField(name="Type")
    private String Type;

}
