package ksyun.client.krds.describesecuritygroup.v20160701;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribeSecurityGroupRequest @Description 请求参数
 */
@Data
public class DescribeSecurityGroupRequest {
  /** 安全组id */
  @KsYunField(name = "SecurityGroupId")
  private String SecurityGroupId;

  /** 安全组类型：IPV4 / IPV6 （默认IPV4） */
  @KsYunField(name = "Type")
  private String Type;
}
