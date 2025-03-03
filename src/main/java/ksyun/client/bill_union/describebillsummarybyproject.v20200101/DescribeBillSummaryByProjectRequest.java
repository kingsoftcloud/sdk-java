package ksyun.client.bill_union.describebillsummarybyproject.v20200101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribeBillSummaryByProjectRequest
 * @Description 请求参数
 */
@Data
public class DescribeBillSummaryByProjectRequest {
    /**
     * 账单开始月份
     */
    @KsYunField(name = "BillBeginMonth")
    private String BillBeginMonth;

    /**
     * 账单结束月份
     */
    @KsYunField(name = "BillEndMonth")
    private String BillEndMonth;

    /**
     * 成员账号Id
     */
    @KsYunField(name = "SubAccount")
    private Integer SubAccount;

}