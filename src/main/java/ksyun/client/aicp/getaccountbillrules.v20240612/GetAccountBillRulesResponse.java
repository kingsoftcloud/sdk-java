package ksyun.client.aicp.getaccountbillrules.v20240612;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname GetAccountBillRulesResponse
* @Description GetAccountBillRules 返回体
*/
@Data
@ToString
public class GetAccountBillRulesResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /**是否为存量用户*/
    @JsonProperty("StockData")
    private Boolean StockData;

    /***/
    @JsonProperty("Data")
    private List<DataDto> Data;

    @Data
    @ToString
    public static class DataDto {
        /**模型名称*/
        @JsonProperty("ModelName")
        private String ModelName;

        /**低价池是否可用*/
        @JsonProperty("LowPriceAvailable")
        private Boolean LowPriceAvailable;

        /**高价池是否可用*/
        @JsonProperty("HighPriceAvailable")
        private Boolean HighPriceAvailable;

    }

}
