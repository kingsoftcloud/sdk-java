package ksyun.client.vpc.createroutetable.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname CreateRouteTableRequest
 * @Description 请求参数
 */
@Data
public class CreateRouteTableRequest {
    /**
     * Vpc的ID
     */
    @KsYunField(name = "VpcId")
    private String VpcId;

    /**
     * 路由表的名称
     */
    @KsYunField(name = "RouteTableName")
    private String RouteTableName;

    /**
     * 路由表的描述信息(部分机房支持，不支持该参数的机房忽略此传值)
     */
    @KsYunField(name = "Description")
    private String Description;


}