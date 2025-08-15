package ksyun.client.tidb.createsecuritygroup.v20210520;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname CreateSecurityGroupRequest @Description 请求参数
 */
@Data
public class CreateSecurityGroupRequest {
  /** 商品类型。取固定值：577。 */
  @KsYunField(name = "ProductType")
  private Integer ProductType;

  /** 安全组名称。长度[2,64] */
  @KsYunField(name = "SecurityGroupName")
  private String SecurityGroupName;

  /** 安全组IP类型。默认ipv4；取值：ipv4，ipv6。 */
  @KsYunField(name = "IpVersion")
  private String IpVersion;

  /** 安全组描述。 */
  @KsYunField(name = "Description")
  private String Description;
}
