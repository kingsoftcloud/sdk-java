package ksyun.client.influxdb.deletesecurityrule.v20191010;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DeleteSecurityRuleRequest
* @Description 请求参数
*/
@Data
public class DeleteSecurityRuleRequest{
    /***/
    @KsYunField(name="InstanceId")
    private String InstanceId;

    /***/
    @KsYunField(name="SecurityRuleIds")
    private String SecurityRuleIds;

}
