package ksyun.client.vpc.modifyvpngatewayroute.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ModifyVpnGatewayRouteResponse
* @Description ModifyVpnGatewayRoute 返回体
*/
@Data
@ToString
public class ModifyVpnGatewayRouteResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**路由Id*/
    @JsonProperty("RouteId")
    private Boolean RouteId;

}
