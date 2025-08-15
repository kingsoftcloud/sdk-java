package ksyun.client.vpc.modifydnat.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ModifyDnatRequest @Description 请求参数
 */
@Data
public class ModifyDnatRequest {
  /** Nat的ID */
  @KsYunField(name = "NatId")
  private String NatId;

  /** Dnat规则的ID */
  @KsYunField(name = "DnatId")
  private String DnatId;

  /** Nat的IP */
  @KsYunField(name = "NatIp")
  private String NatIp;

  /** Dnat规则的名称 */
  @KsYunField(name = "DnatName")
  private String DnatName;

  /** 公网端口 */
  @KsYunField(name = "PublicPort")
  private String PublicPort;

  /** 服务器的私网IP */
  @KsYunField(name = "PrivateIpAddress")
  private String PrivateIpAddress;

  /** 协议类型 */
  @KsYunField(name = "IpProtocol")
  private String IpProtocol;

  /** 服务器端口 */
  @KsYunField(name = "PrivatePort")
  private String PrivatePort;

  /** 描述信息 */
  @KsYunField(name = "Description")
  private String Description;
}
