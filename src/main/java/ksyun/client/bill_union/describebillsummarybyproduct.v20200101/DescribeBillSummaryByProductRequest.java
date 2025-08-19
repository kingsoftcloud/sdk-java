package ksyun.client.bill_union.describebillsummarybyproduct.v20200101;

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

    /**成员账号Id*/
    @KsYunField(name="SubAccount")
    private Integer SubAccount;

    /**非必传，默认值为 False。
是否吐出全部财务关系数据。
值为true时，同时吐出财务管理和财务托管账号数据。
值为false时或不传该参数，仅吐出财务托管账号数据。*/
    @KsYunField(name="FetchAllFinanceRelationData")
    private Boolean FetchAllFinanceRelationData;

}