package ksyun.client.vpc.createcustomergateway.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateCustomerGatewayResponse
* @Description CreateCustomerGateway 返回体
*/
@Data
@ToString
public class CreateCustomerGatewayResponse extends BaseResponseModel {
    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**客户网关信息*/
    @JsonProperty("CustomerGateway")
    private CustomerGatewayDto CustomerGateway;

    @Data
    @ToString
    public static class CustomerGatewayDto {
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
