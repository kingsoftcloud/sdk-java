package ksyun.client.bill_union.describeinstancesummarybills.v20200101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeInstanceSummaryBillsRequest
* @Description 请求参数
*/
@Data
public class DescribeInstanceSummaryBillsRequest{
    /**客户账单月份，YYYY-MM。不支持跨月查询*/
    @KsYunField(name="BillMonth")
    private String BillMonth;

    /**产品线对应的Code*/
    @KsYunField(name="ProductCode")
    private String ProductCode;

    /**页码*/
    @KsYunField(name="Page")
    private Integer Page;

    /**每页数量*/
    @KsYunField(name="Size")
    private Integer Size;

}