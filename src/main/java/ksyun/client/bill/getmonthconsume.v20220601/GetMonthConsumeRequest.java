package ksyun.client.bill.getmonthconsume.v20220601;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname GetMonthConsumeRequest
 * @Description 请求参数
 */
@Data
public class GetMonthConsumeRequest {
    /**
     * 必选参数，账单月份必选参数，账单月份YYYY-MM
     */
    @KsYunField(name = "BillMonth")
    private String BillMonth;

}