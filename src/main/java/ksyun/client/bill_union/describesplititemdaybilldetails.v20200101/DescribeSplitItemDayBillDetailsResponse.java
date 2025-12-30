package ksyun.client.bill_union.describesplititemdaybilldetails.v20200101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeSplitItemDayBillDetailsResponse
* @Description DescribeSplitItemDayBillDetails 返回体
*/
@Data
@ToString
public class DescribeSplitItemDayBillDetailsResponse extends BaseResponseModel {

    /**响应状态码*/
    @JsonProperty("Status")
    private Integer Status;

    /**请求id*/
    @JsonProperty("RequestId")
    private String RequestId;

}
