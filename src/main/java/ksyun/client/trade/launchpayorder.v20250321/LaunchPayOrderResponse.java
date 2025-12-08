package ksyun.client.trade.launchpayorder.v20250321;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname LaunchPayOrderResponse
* @Description LaunchPayOrder 返回体
*/
@Data
@ToString
public class LaunchPayOrderResponse extends BaseResponseModel {
    /**订单ID*/
    @JsonProperty("OrderId")
    private String OrderId;

    /**支付金额，单位：元*/
    @JsonProperty("RealMoney")
    private Integer RealMoney;

    /**唯一请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**子订单ID*/
    @JsonProperty("SubOrderIds")
    private List<String> SubOrderIds;

    /**官网原价，单位：元*/
    @JsonProperty("TotalMoney")
    private Integer TotalMoney;

}
