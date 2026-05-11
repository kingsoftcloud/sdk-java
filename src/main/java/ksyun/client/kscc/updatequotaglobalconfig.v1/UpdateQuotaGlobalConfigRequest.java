package ksyun.client.kscc.updatequotaglobalconfig.v1;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname UpdateQuotaGlobalConfigRequest
* @Description 请求参数
*/
@Data
public class UpdateQuotaGlobalConfigRequest{
    /**预警阈值百分比，例如80表示80%*/
    @KsYunField(name="WarnThreshold")
    private Integer WarnThreshold;

    /**费用折扣，例如9表示9折*/
    @KsYunField(name="Discount")
    private Double Discount;

    /**预警联系人JSON字符串*/
    @KsYunField(name="ContactsJson")
    private String ContactsJson;

    /**账号配额开关，1启用，0禁用*/
    @KsYunField(name="AccountEnabled")
    private Integer AccountEnabled;

    /**部门配额开关，1启用，0禁用*/
    @KsYunField(name="DeptEnabled")
    private Integer DeptEnabled;

    /**成员配额开关，1启用，0禁用*/
    @KsYunField(name="MemberEnabled")
    private Integer MemberEnabled;

    /**默认成员月度配额*/
    @KsYunField(name="DefaultMemberQuota")
    private Double DefaultMemberQuota;

}
