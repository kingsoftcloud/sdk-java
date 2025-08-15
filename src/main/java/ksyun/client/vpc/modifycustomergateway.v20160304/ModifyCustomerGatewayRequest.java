package ksyun.client.vpc.modifycustomergateway.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ModifyCustomerGatewayRequest @Description 请求参数
 */
@Data
public class ModifyCustomerGatewayRequest {
  /** 客户网关的ID */
  @KsYunField(name = "CustomerGatewayId")
  private String CustomerGatewayId;

  /** 客户网关的名称 */
  @KsYunField(name = "CustomerGatewayName")
  private String CustomerGatewayName;
}
