package ksyun.client.bill_union.queryitembills.v20250801;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname QueryItemBillsResponse
* @Description QueryItemBills 返回体
*/
@Data
@ToString
public class QueryItemBillsResponse extends BaseResponseModel {
    /**requestId*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**响应数据结构体*/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
    }

}
