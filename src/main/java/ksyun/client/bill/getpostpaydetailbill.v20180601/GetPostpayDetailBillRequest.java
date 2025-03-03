package ksyun.client.bill.getpostpaydetailbill.v20180601;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname GetPostpayDetailBillRequest
 * @Description 请求参数
 */
@Data
public class GetPostpayDetailBillRequest {
    /**
     * 必选参数，账单开始月份，eg. 2018-06
     */
    @KsYunField(name = "BillStartMonth")
    private String BillStartMonth;

    /**
     * 必选参数，账单结束月份
     */
    @KsYunField(name = "BillEndMonth")
    private String BillEndMonth;

    /**
     * 可选参数，产品类型对应的Code。eg. KEC，不传获取所有产品类型的账单,取值可以参考产品线映射关系
     */
    @KsYunField(name = "ProductCode")
    private String ProductCode;

    /**
     * 可选参数，项目组Id，不传获取所有项目Id
     */
    @KsYunField(name = "ProjectId")
    private String ProjectId;


}