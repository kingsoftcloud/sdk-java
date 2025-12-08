package ksyun.client.vpc.describecustomergateways.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeCustomerGatewaysResponse
* @Description DescribeCustomerGateways 返回体
*/
@Data
@ToString
public class DescribeCustomerGatewaysResponse extends BaseResponseModel {
    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**获取另一页返回结果的 token.*/
    @JsonProperty("NextToken")
    private String NextToken;

    /**客户网关的信息*/
    @JsonProperty("CustomerGatewaySet")
    private List<CustomerGatewaySetDto> CustomerGatewaySet;

    @Data
    @ToString
    public static class CustomerGatewaySetDto {
        /**创建时间*/
        @JsonProperty("CreateTime")
        private String CreateTime;

        /**客户网关的ID*/
        @JsonProperty("CustomerGatewayId")
        private String CustomerGatewayId;

        /**客户网关的名称*/
        @JsonProperty("CustomerGatewayName")
        private String CustomerGatewayName;

        /**客户网关公网IP*/
        @JsonProperty("CustomerGatewayAddress")
        private String CustomerGatewayAddress;

        /**HA模式客户网关的公网IP*/
        @JsonProperty("HaCustomerGatewayAddress")
        private String HaCustomerGatewayAddress;

    }

}
