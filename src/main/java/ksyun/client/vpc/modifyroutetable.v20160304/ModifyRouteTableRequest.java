package ksyun.client.vpc.modifyroutetable.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname ModifyRouteTableRequest
 * @Description 请求参数
 */
@Data
public class ModifyRouteTableRequest {
    /**
     * 路由表的ID
     */
    @KsYunField(name = "RouteTableId")
    private String RouteTableId;

    /**
     * 路由表的名称
     */
    @KsYunField(name = "RouteTableName")
    private String RouteTableName;

    /**
     * 路由表的描述信息(部分机房支持，不支持该参数的机房忽略此传值)
     */
    @KsYunField(name="Description")
    private String Description;

}