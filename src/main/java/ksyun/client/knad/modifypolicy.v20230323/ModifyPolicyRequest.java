package ksyun.client.knad.modifypolicy.v20230323;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ModifyPolicyRequest @Description 请求参数
 */
@Data
public class ModifyPolicyRequest {
  /***/
  @KsYunField(name = "KnadId")
  private String KnadId;

  /** 防护模板ID（默认：1075） */
  @KsYunField(name = "TemplateId")
  private Integer TemplateId;

  /** 是否封禁Udp（1：封禁 0：不封禁） */
  @KsYunField(name = "UdpBlock")
  private Integer UdpBlock;

  /** 是否封禁Tcp（1：封禁 0：不封禁） */
  @KsYunField(name = "TcpBlock")
  private Integer TcpBlock;

  /** 是否封禁Icmp（1：封禁 0：不封禁） */
  @KsYunField(name = "IcmpBlock")
  private Integer IcmpBlock;
}
