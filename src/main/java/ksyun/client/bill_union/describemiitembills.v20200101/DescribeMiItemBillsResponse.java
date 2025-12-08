package ksyun.client.bill_union.describemiitembills.v20200101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeMiItemBillsResponse
* @Description DescribeMiItemBills 返回体
*/
@Data
@ToString
public class DescribeMiItemBillsResponse extends BaseResponseModel {
    /**请求RequestId*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**ks3地址*/
    @JsonProperty("url")
    private String Url;

    /**错误节点。响应错误时，该节点才有值。*/
    @JsonProperty("Error")
    private ErrorDto Error;

    @Data
    @ToString
    public static class ErrorDto {
        /**错误码*/
        @JsonProperty("Code")
        private String Code;

        /**错误描述*/
        @JsonProperty("Message")
        private String Message;

    }

}
