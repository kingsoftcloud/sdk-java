package ksyun.client.vpc.deletedirectconnectgateway.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname DeleteDirectConnectGatewayResponse
 * @Description DeleteDirectConnectGateway 返回体
 */
@Data
@ToString
public class DeleteDirectConnectGatewayResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
