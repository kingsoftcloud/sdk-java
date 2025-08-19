package ksyun.client.bill_union.queryitembills.v20250801;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname QueryItemBillsRequest
* @Description 请求参数
*/
@Data
public class QueryItemBillsRequest{
    /**账期*/
    @KsYunField(name="CustomerBillMonth")
    private Integer CustomerBillMonth;

    /**产品线CODE*/
    @KsYunField(name="ProductGroupCode")
    private String ProductGroupCode;

    /**计费方式：0预付费、1实时付费、2后付费*/
    @KsYunField(name="PayType")
    private Integer PayType;

    /**实例ID*/
    @KsYunField(name="InstanceId")
    private String InstanceId;

    /**托管子账号ID*/
    @KsYunField(name="SubAccountId")
    private Integer SubAccountId;

    /**查询条数，最大值1000*/
    @KsYunField(name="Size")
    private Integer Size;

    /**上次查询排序值LastSortValue，基于es search_after; */
    @KsYunField(name="LastSortValue")
    private String LastSortValue;

}