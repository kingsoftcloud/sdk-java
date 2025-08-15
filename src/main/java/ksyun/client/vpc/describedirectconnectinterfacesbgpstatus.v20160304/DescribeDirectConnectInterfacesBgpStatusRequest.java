package ksyun.client.vpc.describedirectconnectinterfacesbgpstatus.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribeDirectConnectInterfacesBgpStatusRequest @Description 请求参数
 */
@Data
public class DescribeDirectConnectInterfacesBgpStatusRequest {
  /** 专线通道id */
  @KsYunField(name = "DirectConnectInterfaceId.N")
  private String DirectConnectInterfaceIdN;
}
