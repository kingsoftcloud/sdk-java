package ksyun.client.vpc.modifycustomergateway.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname ModifyCustomerGatewayRequest
 * @Description 请求参数
 */
@Data
public class ModifyCustomerGatewayRequest {
    /**
     * 客户网关的ID
     */
    @KsYunField(name = "CustomerGatewayId")
    private String CustomerGatewayId;

    /**
     * 客户网关的名称
     */
    @KsYunField(name = "CustomerGatewayName")
    private String CustomerGatewayName;

}