package ksyun.client.milvus.describesecuritygroup.v20231010;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribeSecurityGroupRequest @Description 请求参数
 */
@Data
public class DescribeSecurityGroupRequest {
  /** 安全组ID */
  @KsYunField(name = "SecurityGroupId")
  private String SecurityGroupId;
}
