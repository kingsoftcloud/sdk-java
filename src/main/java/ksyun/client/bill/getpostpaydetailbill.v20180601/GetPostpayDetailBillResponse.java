package ksyun.client.bill.getpostpaydetailbill.v20180601;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname GetPostpayDetailBillResponse
 * @Description GetPostpayDetailBill 返回体
 */
@Data
@ToString
public class GetPostpayDetailBillResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
