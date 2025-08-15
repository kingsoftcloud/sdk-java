package ksyun.client.milvus.createsecuritygroup.v20231010;

import common.annotation.KsYunField;
import java.util.List;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname CreateSecurityGroupRequest @Description 请求参数
 */
@Data
public class CreateSecurityGroupRequest {
  /** 安全组名称 */
  @KsYunField(name = "Name")
  private String Name;

  /** 安全组类型，现仅支持：ipv4 */
  @KsYunField(name = "IpVersion")
  private String IpVersion;

  /** 描述 */
  @KsYunField(name = "Detail")
  private String Detail;

  /** 安全组规则列表 */
  @KsYunField(name = "Rules")
  private List<RulesDto> RulesList;

  @Data
  @ToString
  public static class RulesDto {
    /** 若要绑定规则，此字段为必填 */
    @KsYunField(name = "Cidr")
    private String Cidr;

    /** 描述 */
    @KsYunField(name = "Detail")
    private String Detail;
  }
}
