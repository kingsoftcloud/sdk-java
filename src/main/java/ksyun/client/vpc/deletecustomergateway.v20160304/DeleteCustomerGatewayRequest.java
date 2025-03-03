package ksyun.client.vpc.deletecustomergateway.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DeleteCustomerGatewayRequest
 * @Description 请求参数
 */
@Data
public class DeleteCustomerGatewayRequest {
    /**
     * 客户网关的ID
     */
    @KsYunField(name = "CustomerGatewayId")
    private String CustomerGatewayId;

}