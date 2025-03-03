package ksyun.client.vpc.deleteroutetable.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DeleteRouteTableRequest
 * @Description 请求参数
 */
@Data
public class DeleteRouteTableRequest {
    /**
     * 路由表的ID
     */
    @KsYunField(name = "RouteTableId")
    private String RouteTableId;


}