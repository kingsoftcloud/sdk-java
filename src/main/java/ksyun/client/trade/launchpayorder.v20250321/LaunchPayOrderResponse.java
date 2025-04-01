package ksyun.client.trade.launchpayorder.v20250321;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname LaunchPayOrderResponse
 * @Description LaunchPayOrder 返回体
 */
@Data
@ToString
public class LaunchPayOrderResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
