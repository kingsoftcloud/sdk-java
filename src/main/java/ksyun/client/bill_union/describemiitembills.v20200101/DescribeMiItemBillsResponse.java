package ksyun.client.bill_union.describemiitembills.v20200101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.Set;

/**
 * @Classname DescribeMiItemBillsResponse
 * @Description DescribeMiItemBills 返回体
 */
@Data
@ToString
public class DescribeMiItemBillsResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
