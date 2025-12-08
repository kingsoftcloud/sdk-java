package ksyun.client.vpc.createvpngatewayroute.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateVpnGatewayRouteResponse
* @Description CreateVpnGatewayRoute 返回体
*/
@Data
@ToString
public class CreateVpnGatewayRouteResponse extends BaseResponseModel {
    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**路由Id*/
    @JsonProperty("RouteId")
    private String RouteId;

}
