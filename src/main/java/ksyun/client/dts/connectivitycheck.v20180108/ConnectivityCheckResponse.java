package ksyun.client.dts.connectivitycheck.v20180108;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname ConnectivityCheckResponse
 * @Description ConnectivityCheck 返回体
 */
@Data
@ToString
public class ConnectivityCheckResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
