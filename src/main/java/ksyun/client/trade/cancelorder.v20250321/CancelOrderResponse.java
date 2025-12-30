package ksyun.client.trade.cancelorder.v20250321;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CancelOrderResponse
* @Description CancelOrder 返回体
*/
@Data
@ToString
public class CancelOrderResponse extends BaseResponseModel {

    /**请求唯一id*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**是否取消成功*/
    @JsonProperty("success")
    private Boolean Success;

}
