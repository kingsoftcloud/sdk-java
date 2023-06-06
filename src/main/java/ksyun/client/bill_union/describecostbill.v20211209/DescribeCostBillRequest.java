package ksyun.client.bill_union.describecostbill.v20211209;
import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeCostBillRequest
* @Description 请求参数
*/
@Data
public class DescribeCostBillRequest{
    /**账单月*/
    @KsYunField(name="billMonth")
    private Integer billMonth;

    /**统计项，0：按实例；1：按产品*/
    @KsYunField(name="statisticalItem")
    private Integer statisticalItem;

    /**实例id列表，仅当statisticalItem=0时有效*/
    @KsYunField(name="instanceIds")
    private String instanceIds;

    /**分页page no*/
    @KsYunField(name="pageNo")
    private Integer pageNo;

    /**分页page size*/
    @KsYunField(name="pageSize")
    private Integer pageSize;


}