package ksyun.client.bill_union.describebillsummarybypaymode.v20200101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname DescribeBillSummaryByPayModeRequest
 * @Description 请求参数
 */
@Data
public class DescribeBillSummaryByPayModeRequest {
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

    /**
     * 成员账账号Id，非必填
     */
    @KsYunField(name = "SubAccount")
    private Integer SubAccount;

}