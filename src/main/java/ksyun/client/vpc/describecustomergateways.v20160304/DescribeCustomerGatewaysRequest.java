package ksyun.client.vpc.describecustomergateways.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

import java.util.List;

/**
 * @Classname DescribeCustomerGatewaysRequest
 * @Description 请求参数
 */
@Data
public class DescribeCustomerGatewaysRequest {
    /**
     * 多个客户网关的ID
     */
    @KsYunField(name = "CustomerGatewayId")
    private List<String> CustomerGatewayIdList;

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

}