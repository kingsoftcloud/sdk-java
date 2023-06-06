package ksyun.client.vpc.deleteroute.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DeleteRouteRequest
* @Description 请求参数
*/
@Data
public class DeleteRouteRequest{
    /**路由的ID*/
    @KsYunField(name="RouteId")
    private String RouteId;


}