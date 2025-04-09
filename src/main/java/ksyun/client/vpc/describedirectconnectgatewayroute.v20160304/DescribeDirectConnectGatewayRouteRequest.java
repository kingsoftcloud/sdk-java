package ksyun.client.vpc.describedirectconnectgatewayroute.v20160304;

import common.annotation.KsYunField;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * @Classname DescribeDirectConnectGatewayRouteRequest
 * @Description 请求参数
 */
@Data
public class DescribeDirectConnectGatewayRouteRequest {
    /**
     * 边界网关的ID
     */
    @KsYunField(name = "DirectConnectGatewayId")
    private String DirectConnectGatewayId;

    /**
     * 单次调用可返回的最大条目数量
     */
    @KsYunField(name = "MaxResults")
    private Integer MaxResults;

    /**
     * 筛选Filter
     */
    @KsYunField(name = "Filter")
    private List<FilterDto> FilterList;

    @Data
    @ToString
    public static class FilterDto {
        /**
         * 有效值：
         * - route-type，路由类型
         * - cidr-block，目标网段
         */
        @KsYunField(name = "Name")
        private String Name;
        /***/
        @KsYunField(name = "Value")
        private List<String> ValueList;
    }

    /**
     * 获取另一页返回结果的 token.
     */
    @KsYunField(name = "NextToken")
    private String NextToken;

}