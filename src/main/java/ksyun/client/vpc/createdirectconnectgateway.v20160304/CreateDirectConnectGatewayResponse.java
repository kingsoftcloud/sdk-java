package ksyun.client.vpc.createdirectconnectgateway.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname CreateDirectConnectGatewayResponse
 * @Description CreateDirectConnectGateway 返回体
 */
@Data
@ToString
public class CreateDirectConnectGatewayResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
