package client.bill_union.describebillsummarybyproduct.v20200101;
import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeBillSummaryByProductRequest
* @Description 请求参数
*/
@Data
public class DescribeBillSummaryByProductRequest{
    /**账单开始时间*/
    @KsYunField(name="BillBeginMonth")
    private String BillBeginMonth;

    /**账单结束时间*/
    @KsYunField(name="BillEndMonth")
    private String BillEndMonth;


}