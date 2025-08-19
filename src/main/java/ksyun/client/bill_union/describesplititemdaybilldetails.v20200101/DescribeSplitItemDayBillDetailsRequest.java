package ksyun.client.bill_union.describesplititemdaybilldetails.v20200101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeSplitItemDayBillDetailsRequest
* @Description 请求参数
*/
@Data
public class DescribeSplitItemDayBillDetailsRequest{
    /**账期，格式：yyyyMM。如：202211
*/
    @KsYunField(name="CustomerBillMonth")
    private Integer CustomerBillMonth;

    /**产品线 code，目前仅支持KS3_GROUP*/
    @KsYunField(name="ProductGroupCode")
    private String ProductGroupCode;

    /**统计周期，固化传 3（代表明细）*/
    @KsYunField(name="StatisticType")
    private Integer StatisticType;

    /**计费类别，0（预付费），1（实时付费），2（后付费）；该接口仅支持后付费*/
    @KsYunField(name="PayType")
    private Integer PayType;

    /**主账号所托管的账号Id
*/
    @KsYunField(name="SubAccountId")
    private Integer SubAccountId;

    /**第几页*/
    @KsYunField(name="Page")
    private Integer Page;

    /**每页条数
*/
    @KsYunField(name="Size")
    private Integer Size;

}