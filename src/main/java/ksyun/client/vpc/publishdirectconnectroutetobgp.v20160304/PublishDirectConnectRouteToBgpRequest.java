package ksyun.client.vpc.publishdirectconnectroutetobgp.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname PublishDirectConnectRouteToBgpRequest
* @Description 请求参数
*/
@Data
public class PublishDirectConnectRouteToBgpRequest{
    /**专线路由的ID*/
    @KsYunField(name="DirectConnectRouteId")
    private String DirectConnectRouteId;

}
