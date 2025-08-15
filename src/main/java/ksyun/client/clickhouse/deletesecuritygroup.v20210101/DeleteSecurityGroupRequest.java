package ksyun.client.clickhouse.deletesecuritygroup.v20210101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DeleteSecurityGroupRequest @Description 请求参数
 */
@Data
public class DeleteSecurityGroupRequest {
  /** 安全组ID列表。 */
  @KsYunField(name = "SecurityGroupIds")
  private String SecurityGroupIds;

  /** 商品类型：Clickhouse固定取值：523。 */
  @KsYunField(name = "ProductType")
  private Integer ProductType;
}
