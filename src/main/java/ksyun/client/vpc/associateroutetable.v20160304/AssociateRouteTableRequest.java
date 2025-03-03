package ksyun.client.vpc.associateroutetable.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname AssociateRouteTableRequest
 * @Description 请求参数
 */
@Data
public class AssociateRouteTableRequest {
    /**
     * 子网的ID
     */
    @KsYunField(name = "SubnetId")
    private String SubnetId;

    /**
     * 路由表的ID
     */
    @KsYunField(name = "RouteTableId")
    private String RouteTableId;


}