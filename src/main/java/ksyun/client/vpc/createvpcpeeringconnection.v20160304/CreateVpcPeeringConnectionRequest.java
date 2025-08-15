package ksyun.client.vpc.createvpcpeeringconnection.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname CreateVpcPeeringConnectionRequest @Description 请求参数
 */
@Data
public class CreateVpcPeeringConnectionRequest {
  /** 发起端Vpc的ID */
  @KsYunField(name = "VpcId")
  private String VpcId;

  /** 对等连接的名称 */
  @KsYunField(name = "PeeringName")
  private String PeeringName;

  /** 接受端Vpc的ID */
  @KsYunField(name = "PeerVpcId")
  private String PeerVpcId;

  /** 接受端Vpc的region */
  @KsYunField(name = "PeerRegion")
  private String PeerRegion;

  /** 接受端账号ID */
  @KsYunField(name = "PeerAccountId")
  private String PeerAccountId;

  /** 对等连接的带宽，同机房时可缺省，带宽值为1000且不可修改，跨机房时不可缺省 */
  @KsYunField(name = "BandWidth")
  private Integer BandWidth;

  /** 购买时长，计费类型为包年包月时不可缺省。 */
  @KsYunField(name = "PurchaseTime")
  private Integer PurchaseTime;

  /** 项目的ID */
  @KsYunField(name = "ProjectId")
  private String ProjectId;

  /** 对等连接的计费类型，同机房的对端连接此参数缺省 */
  @KsYunField(name = "ChargeType")
  private String ChargeType;
}
