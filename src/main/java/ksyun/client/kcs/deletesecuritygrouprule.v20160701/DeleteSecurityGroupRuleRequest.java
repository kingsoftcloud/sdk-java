package ksyun.client.kcs.deletesecuritygrouprule.v20160701;

import common.annotation.KsYunField;
import lombok.Data;

import java.util.List;

/**
 * @Classname DeleteSecurityGroupRuleRequest
 * @Description 请求参数
 */
@Data
public class DeleteSecurityGroupRuleRequest {
    /**
     * 可用区			默认：对应机房的a区
     */
    @KsYunField(name = "AvailableZone")
    private String AvailableZone;

    /**
     * 安全组ID	安全组ID
     */
    @KsYunField(name = "SecurityGroupId")
    private String SecurityGroupId;

    /**
     * 安全组规则ID		N：代表数字，示例（SecurityGroupRuleId.1=xxx&SecurityGroupRuleId.2=yyy）
     */
    @KsYunField(name = "SecurityGroupRuleId")
    private List<String> SecurityGroupRuleIdList;


}