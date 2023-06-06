package ksyun.client.bill.getpostpaydetailbillcsv.v20180601;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.Set;

/**
* @Classname GetPostpayDetailBillCSVResponse
* @Description GetPostpayDetailBillCSV 返回体
*/
@Data
@ToString
public class GetPostpayDetailBillCSVResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
