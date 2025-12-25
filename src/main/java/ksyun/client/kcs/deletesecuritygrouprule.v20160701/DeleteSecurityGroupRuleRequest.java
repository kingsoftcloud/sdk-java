package ksyun.client.kcs.deletesecuritygrouprule.v20160701;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DeleteSecurityGroupRuleRequest
* @Description 请求参数
*/
@Data
public class DeleteSecurityGroupRuleRequest{
    /**可用区			默认：对应机房的a区*/
    @KsYunField(name="AvailableZone")
    private String AvailableZone;

    /**安全组ID	安全组ID*/
    @KsYunField(name="SecurityGroupId")
    private String SecurityGroupId;

    /**安全组规则ID		N：代表数字，示例（SecurityGroupRuleId.1=xxx&SecurityGroupRuleId.2=yyy）*/
    @KsYunField(name = "SecurityGroupRuleId", type = 1)
    private List<String> SecurityGroupRuleIdList;

}
