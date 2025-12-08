package ksyun.client.vpc.deletevpngatewayroute.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeleteVpnGatewayRouteResponse
* @Description DeleteVpnGatewayRoute 返回体
*/
@Data
@ToString
public class DeleteVpnGatewayRouteResponse extends BaseResponseModel {
    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**返回结果*/
    @JsonProperty("Return")
    private Boolean ReturnField;

}
