package ksyun.client.vpc.modifyvpngatewayroute.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ModifyVpnGatewayRouteRequest @Description 请求参数
 */
@Data
public class ModifyVpnGatewayRouteRequest {
  /** VPN网关路由的ID */
  @KsYunField(name = "VpnGatewayRouteId")
  private String VpnGatewayRouteId;

  /** 描述 */
  @KsYunField(name = "Description")
  private String Description;
}
