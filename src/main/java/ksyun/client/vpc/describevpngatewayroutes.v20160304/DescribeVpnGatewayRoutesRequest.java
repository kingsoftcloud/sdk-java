package ksyun.client.vpc.describevpngatewayroutes.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeVpnGatewayRoutesRequest
* @Description 请求参数
*/
@Data
public class DescribeVpnGatewayRoutesRequest{
    /**VPN网关id*/
    @KsYunField(name="vpnGatewayId")
    private String VpnGatewayId;

    /**筛选Filter*/
    @KsYunField(name="Filter")
    private List<FilterDto> FilterList;

    @Data
    @ToString
    public static class FilterDto {
        /**有效值：
- nexthop，吓一跳类型
- cidr-block，网段*/
        @KsYunField(name="Name")
        private String Name;
        /**有效值：
- nexthop，吓一跳类型
- cidr-block，网段*/
        @KsYunField(name="Value")
        private List<String> ValueList;
    }

    /**单次调用可返回的最大条目数量*/
    @KsYunField(name="maxResults")
    private Integer MaxResults;

    /**获取另一页返回结果的 token.*/
    @KsYunField(name="nextToken")
    private String NextToken;


}