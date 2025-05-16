package ksyun.client.vpc.publishdirectconnectroute.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname PublishDirectConnectRouteRequest
 * @Description 请求参数
 */
@Data
public class PublishDirectConnectRouteRequest {
    /**
     * 边界网关路由ID
     */
    @KsYunField(name = "DirectConnectGatewayRouteId")
    private String DirectConnectGatewayRouteId;

}