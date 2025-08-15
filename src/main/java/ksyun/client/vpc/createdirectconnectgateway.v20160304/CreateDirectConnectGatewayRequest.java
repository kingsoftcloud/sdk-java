package ksyun.client.vpc.createdirectconnectgateway.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname CreateDirectConnectGatewayRequest @Description 请求参数
 */
@Data
public class CreateDirectConnectGatewayRequest {
  /** VPC的ID */
  @KsYunField(name = "VpcId")
  private String VpcId;

  /** 边界网关的名称 */
  @KsYunField(name = "DirectConnectGatewayName")
  private String DirectConnectGatewayName;
}
