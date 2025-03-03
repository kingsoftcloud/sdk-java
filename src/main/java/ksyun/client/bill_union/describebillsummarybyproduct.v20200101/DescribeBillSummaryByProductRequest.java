package ksyun.client.bill_union.describebillsummarybyproduct.v20200101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribeBillSummaryByProductRequest
 * @Description 请求参数
 */
@Data
public class DescribeBillSummaryByProductRequest {
    /**
     * 账单开始时间
     */
    @KsYunField(name = "BillBeginMonth")
    private String BillBeginMonth;

    /**
     * 账单结束时间
     */
    @KsYunField(name = "BillEndMonth")
    private String BillEndMonth;


}