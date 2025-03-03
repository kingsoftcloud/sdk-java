package ksyun.client.vpc.deleteroute.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DeleteRouteRequest
 * @Description 请求参数
 */
@Data
public class DeleteRouteRequest {
    /**
     * 路由的ID
     */
    @KsYunField(name = "RouteId")
    private String RouteId;


}