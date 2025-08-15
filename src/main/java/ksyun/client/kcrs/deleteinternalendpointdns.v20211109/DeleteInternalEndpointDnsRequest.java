package ksyun.client.kcrs.deleteinternalendpointdns.v20211109;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DeleteInternalEndpointDnsRequest @Description 请求参数
 */
@Data
public class DeleteInternalEndpointDnsRequest {
  /** 实例id */
  @KsYunField(name = "InstanceId")
  private String InstanceId;

  /** vpcid */
  @KsYunField(name = "VpcId")
  private String VpcId;

  /** 内网访问链路ip */
  @KsYunField(name = "EniLBIp")
  private String EniLBIp;

  /**
   * 解析的域名，有效值：<br>
   * PrivateDomain：内网域名
   */
  @KsYunField(name = "InternalEndpointDns")
  private String InternalEndpointDns;
}
