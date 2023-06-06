package ksyun.client.vpc.unpublishdirectconnectroute.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname UnpublishDirectConnectRouteRequest
* @Description 请求参数
*/
@Data
public class UnpublishDirectConnectRouteRequest{
    /**边界网关路由ID*/
    @KsYunField(name="DirectConnectGatewayRouteId")
    private String DirectConnectGatewayRouteId;


}