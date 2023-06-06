package ksyun.client.bill_union.describecostbill.v20211209;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.Set;

/**
* @Classname DescribeCostBillResponse
* @Description DescribeCostBill 返回体
*/
@Data
@ToString
public class DescribeCostBillResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
