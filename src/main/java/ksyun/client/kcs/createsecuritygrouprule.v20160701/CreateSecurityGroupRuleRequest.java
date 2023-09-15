package ksyun.client.kcs.createsecuritygrouprule.v20160701;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreateSecurityGroupRuleRequest
* @Description 请求参数
*/
@Data
public class CreateSecurityGroupRuleRequest{
    /**可用区   	 默认：对应机房的a区*/
    @KsYunField(name="AvailableZone")
    private String AvailableZone;

    /**IP规则   	 N：代表数字，示例（Cidrs.1=127.0.0.1/32&Cidrs.2=0.0.0.0/32）*/
    @KsYunField(name="Cidrs")
    private List<String> CidrsList;

    /**安全组ID */
    @KsYunField(name="SecurityGroupId")
    private String SecurityGroupId;


}