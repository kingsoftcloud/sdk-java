package ksyun.client.epc.createsosubnet.v20151101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname CreateSoSubnetRequest @Description 请求参数
 */
@Data
public class CreateSoSubnetRequest {
  /** 要创建的子网所属VPC的ID。 */
  @KsYunField(name = "VpcId")
  private String VpcId;

  /** 要创建的子网所属的可用区ID */
  @KsYunField(name = "ZoneId")
  private String ZoneId;

  /** 子网的名称。 */
  @KsYunField(name = "SubnetName")
  private String SubnetName;

  /** 子网的描述信息。 */
  @KsYunField(name = "Description")
  private String Description;

  /**
   * 子网的网段。 • 子网的网段必须从属于子网所属VPC的网段。 • 子网网段不能与所属VPC路由条目的目标网段相同，但可以是目标网段的子集。 • 子网网段的掩码长度与VPC网段相关，具体如下：
   * ◦ 10.XX.XX.XX网段掩码范围：8 ~ 29 ◦ 172.16.XX.XX网段掩码范围：12 ~ 29 ◦ 192.168.XX.XX网段掩码范围：16 ~ 29
   */
  @KsYunField(name = "CidrBlock")
  private String CidrBlock;
}
