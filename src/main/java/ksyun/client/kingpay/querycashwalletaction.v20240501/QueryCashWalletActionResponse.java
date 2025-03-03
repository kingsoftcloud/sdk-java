package ksyun.client.kingpay.querycashwalletaction.v20240501;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname QueryCashWalletActionResponse
 * @Description QueryCashWalletAction 返回体
 */
@Data
@ToString
public class QueryCashWalletActionResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
