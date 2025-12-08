package ksyun.client.bill_union.describemiitembills.v20200101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeMiItemBillsRequest
* @Description 请求参数
*/
@Data
public class DescribeMiItemBillsRequest{
    /***/
    @KsYunField(name="BillMonth")
    private String BillMonth;

}
