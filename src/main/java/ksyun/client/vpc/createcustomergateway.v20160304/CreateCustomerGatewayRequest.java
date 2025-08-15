package ksyun.client.vpc.createcustomergateway.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname CreateCustomerGatewayRequest @Description 请求参数
 */
@Data
public class CreateCustomerGatewayRequest {
  /** 客户网关的名称 */
  @KsYunField(name = "CustomerGatewayName")
  private String CustomerGatewayName;

  /** 客户网关公网IP */
  @KsYunField(name = "CustomerGatewayAddress")
  private String CustomerGatewayAddress;

  /** HA模式客户网关的公网IP */
  @KsYunField(name = "HaCustomerGatewayAddress")
  private String HaCustomerGatewayAddress;
}
