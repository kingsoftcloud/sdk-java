package ksyun.client.slb.modifyalblistener.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ModifyAlbListenerRequest @Description 请求参数
 */
@Data
public class ModifyAlbListenerRequest {
  /** 应用型监听器的ID */
  @KsYunField(name = "AlbListenerId")
  private String AlbListenerId;

  /** 应用型负载均衡监听器的名称 */
  @KsYunField(name = "AlbListenerName")
  private String AlbListenerName;

  /** 应用型监听器的状态 */
  @KsYunField(name = "AlbListenerState")
  private String AlbListenerState;

  /** 证书的ID */
  @KsYunField(name = "CertificateId")
  private String CertificateId;

  /** TLS安全策略 */
  @KsYunField(name = "TlsCipherPolicy")
  private String TlsCipherPolicy;

  /** LoadBalancerAcl的ID */
  @KsYunField(name = "AlbListenerAclId")
  private String AlbListenerAclId;

  /** 后端协议版本(HTTP1.0|HTTP1.1) */
  @KsYunField(name = "HttpProtocol")
  private String HttpProtocol;

  /** 是否启用HTTP/2 */
  @KsYunField(name = "EnableHttp2")
  private Boolean EnableHttp2;

  /** 是否开启双向认证 */
  @KsYunField(name = "CaEnabled")
  private Boolean CaEnabled;

  /** 客户端证书 */
  @KsYunField(name = "CaCertificateId")
  private String CaCertificateId;

  /** 是否开启QUIC */
  @KsYunField(name = "EnableQuicUpgrade")
  private Boolean EnableQuicUpgrade;

  /** QUIC监听器id */
  @KsYunField(name = "QuicListenerId")
  private String QuicListenerId;
}
