package ksyun.client.ked.querystrategyruledetail.v20250501;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname QueryStrategyruledetailResponse
 * @Description QueryStrategyruledetail 返回体
 */
@Data
@ToString
public class QueryStrategyruledetailResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
