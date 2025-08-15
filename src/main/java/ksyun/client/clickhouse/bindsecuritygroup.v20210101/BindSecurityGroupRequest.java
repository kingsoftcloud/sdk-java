package ksyun.client.clickhouse.bindsecuritygroup.v20210101;

import common.annotation.KsYunField;
import java.util.List;
import lombok.Data;

/**
 * @Classname BindSecurityGroupRequest @Description 请求参数
 */
@Data
public class BindSecurityGroupRequest {
  /** 商品类型：Clickhouse固定取值：523。 */
  @KsYunField(name = "ProductType")
  private Integer ProductType;

  /** 安全组ID列表。 */
  @KsYunField(name = "SecurityGroupIds", type = 2)
  private List<String> SecurityGroupIdsList;

  /** 实例ID列表。 */
  @KsYunField(name = "InstanceIds")
  private String InstanceIds;
}
