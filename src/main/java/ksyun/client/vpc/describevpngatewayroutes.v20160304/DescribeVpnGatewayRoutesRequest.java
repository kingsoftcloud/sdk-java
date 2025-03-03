package ksyun.client.vpc.describevpngatewayroutes.v20160304;

import common.annotation.KsYunField;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * @Classname DescribeVpnGatewayRoutesRequest
 * @Description 请求参数
 */
@Data
public class DescribeVpnGatewayRoutesRequest {
    /**
     * Vpn网关Id
     */
    @KsYunField(name = "VpnGatewayId")
    private String VpnGatewayId;

    /**
     * 筛选Filter
     */
    @KsYunField(name = "Filter")
    private List<FilterDto> FilterList;
    /**
     * 单次调用可返回的最大条目数量
     */
    @KsYunField(name = "MaxResults")
    private Integer MaxResults;
    /**
     * 获取另一页返回结果的 token.
     */
    @KsYunField(name = "NextToken")
    private String NextToken;

    @Data
    @ToString
    public static class FilterDto {
        /**
         * 有效值：
         * - nexthop，下一跳类型
         * - cidr-block，网段
         */
        @KsYunField(name = "Name")
        private String Name;
        /***/
        @KsYunField(name = "Value")
        private List<String> ValueList;
    }


}