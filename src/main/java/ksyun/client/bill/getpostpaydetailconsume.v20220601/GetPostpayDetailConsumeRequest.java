package ksyun.client.bill.getpostpaydetailconsume.v20220601;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname GetPostpayDetailConsumeRequest
* @Description 请求参数
*/
@Data
public class GetPostpayDetailConsumeRequest{
    /**必选参数，账单月份，eg. 2018-06 */
    @KsYunField(name="BillMonth")
    private String BillMonth;

    /**	可选参数，产品类型对应的Code。eg. KEC，不传获取所有产品类型的账单,取值可以参考产品线映射关系*/
    @KsYunField(name="ProductCode")
    private String ProductCode;

    /**可选参数，项目组Id，不传获取所有项目Id */
    @KsYunField(name="ProjectId")
    private String ProjectId;

    /**可选参数，页码，不传默认为0 */
    @KsYunField(name="PageNo")
    private Integer PageNo;

    /**可选参数，每页数量，不传默认为1，最大只允许传5000 */
    @KsYunField(name="PageSize")
    private Integer PageSize;

}
