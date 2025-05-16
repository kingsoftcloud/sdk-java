package ksyun.client.vpc.deleteroutetable.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

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