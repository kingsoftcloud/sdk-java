package ksyun.client.vpc.describesubnets.v20160304;

import common.annotation.KsYunField;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * @Classname DescribeSubnetsRequest
 * @Description 请求参数
 */
@Data
public class DescribeSubnetsRequest {
    /**
     * 多个子网的ID
     */
    @KsYunField(name = "SubnetId")
    private List<String> SubnetIdList;

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
         * - vpc-id，VPC的ID
         * - nat-id，NAT的ID
         * - network-acl-id，ACL的ID
         * - subnet-type ，子网的类型
         * - availability-zone-name，可用区
         * - subnet-name，子网名称
         * - route-table-id，路由表ID
         */
        @KsYunField(name = "Name")
        private String Name;
        /***/
        @KsYunField(name = "Value")
        private List<String> ValueList;
    }


}