package ksyun.client.vpc.deletecustomergateway.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

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