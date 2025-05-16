package ksyun.client.trade.queryorderinfo.v20250321;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.Set;

/**
 * @Classname QueryOrderInfoResponse
 * @Description QueryOrderInfo 返回体
 */
@Data
@ToString
public class QueryOrderInfoResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
