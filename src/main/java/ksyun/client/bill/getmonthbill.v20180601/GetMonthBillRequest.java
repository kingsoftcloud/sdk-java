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
public class GetMonthBillRequest{
    /**GetMonthBill*/
    @KsYunField(name="Action")
    private String Action;


}