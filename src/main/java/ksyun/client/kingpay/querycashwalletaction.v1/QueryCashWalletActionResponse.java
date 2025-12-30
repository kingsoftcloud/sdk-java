package ksyun.client.kingpay.querycashwalletaction.v1;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname QueryCashWalletActionResponse
* @Description QueryCashWalletAction 返回体
*/
@Data
@ToString
public class QueryCashWalletActionResponse extends BaseResponseModel {

    /**状态*/
    @JsonProperty("status")
    private Integer Status;

    /**请求ID*/
    @JsonProperty("request_id")
    private String Request_id;

    /***/
    @JsonProperty("data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /**账号ID*/
        @JsonProperty("customerId")
        private Integer CustomerId;

        /**可用金额*/
        @JsonProperty("availableAmount")
        private String AvailableAmount;

        /**赠送金额*/
        @JsonProperty("rewardAmount")
        private String RewardAmount;

        /**冻结金额*/
        @JsonProperty("frozenAmount")
        private String FrozenAmount;

        /**货币属性
CNY 人民币
USD 美元*/
        @JsonProperty("currency")
        private String Currency;

    }

}
