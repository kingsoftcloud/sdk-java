package ksyun.client.vpc.describeroutes.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname DescribeRoutesRequest
 * @Description 请求参数
 */
@Data
public class DescribeRoutesRequest {
    /**
     * 多个路由的ID
     */
    @KsYunField(name = "RouteId")
    private List<String> RouteIdList;

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
         * - vpc-id，Vpc的ID
         * - instance-id，主机路由的下一跳ID
         * - destination-cidr-block，目标网段
         * - route-table-id，路由表ID
         */
        @KsYunField(name = "Name")
        private String Name;
        /***/
        @KsYunField(name = "Value")
        private List<String> ValueList;
    }

    /**
     * 单次调用可返回的最大条目数量
     */
    @KsYunField(name = "MaxResults")
    private Integer MaxResults;

    /**获取另一页返回结果的 token.*/
    @KsYunField(name="NextToken")
    private String NextToken;

}