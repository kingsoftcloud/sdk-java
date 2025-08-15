package ksyun.client.epc.modifysovpcattributes.v20151101;

import common.annotation.KsYunField;
import java.util.List;
import lombok.Data;

/**
 * @Classname ModifySoVpcAttributesRequest @Description 请求参数
 */
@Data
public class ModifySoVpcAttributesRequest {
  /** 待修改信息的VPC的ID。 */
  @KsYunField(name = "VpcId")
  private String VpcId;

  /** VPC的描述信息。 */
  @KsYunField(name = "Description")
  private String Description;

  /**
   * VPC的DNS服务器地址。 • 参数 - N：表示DNS服务器地址的序号，单次调用数量上限为5个，每个DnsServer必须以合法IP形式给出。 • 多个IP之间用&分隔。 •
   * 不填则配置为默认DNS服务器地址。
   */
  @KsYunField(name = "DnsServers")
  private List<String> DnsServersList;

  /** VPC的名称。 */
  @KsYunField(name = "VpcName")
  private String VpcName;
}
