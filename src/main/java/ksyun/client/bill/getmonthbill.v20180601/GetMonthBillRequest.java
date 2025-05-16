package ksyun.client.bill.getmonthbill.v20180601;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname GetMonthBillRequest
 * @Description 请求参数
 */
@Data
public class GetMonthBillRequest {
    /**
     * 必选参数，账单开始月份
     */
    @KsYunField(name = "BillStartMonth")
    private String BillStartMonth;

    /**
     * 必选参数，账单结束月份
     */
    @KsYunField(name = "BillEndMonth")
    private String BillEndMonth;

}