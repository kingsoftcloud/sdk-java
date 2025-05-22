package ksyun.client.vpc.describeipv6publicipaddresses.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname DescribeIpv6PublicIpAddressesRequest
 * @Description 请求参数
 */
@Data
public class DescribeIpv6PublicIpAddressesRequest {
    /**
     * 多个IPV6公网的ID
     */
    @KsYunField(name = "Ipv6PublicIpAddressId")
    private List<String> Ipv6PublicIpAddressIdList;

    /**
     * 筛选Filter
     */
    @KsYunField(name="Filter")
    private List<FilterDto> FilterList;

    @Data
    @ToString
    public static class FilterDto {
        /**
         * 有效值：
         * network-interface-id，网卡的ID
         */
        @KsYunField(name = "Name")
        private String Name;
        /***/
        @KsYunField(name="Value")
        private List<String> ValueList;
    }

    /**单次调用可返回的最大条目数量*/
    @KsYunField(name = "MaxResults")
    private Integer MaxResults;

    /**获取另一页返回结果的 token.*/
    @KsYunField(name="NextToken")
    private String NextToken;

}