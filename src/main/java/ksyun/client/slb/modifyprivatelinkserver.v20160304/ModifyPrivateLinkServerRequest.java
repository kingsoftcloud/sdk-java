package ksyun.client.slb.modifyprivatelinkserver.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ModifyPrivateLinkServerRequest @Description 请求参数
 */
@Data
public class ModifyPrivateLinkServerRequest {
  /** PrivateLinkServer的ID */
  @KsYunField(name = "PrivateLinkServerId")
  private String PrivateLinkServerId;

  /** PrivateLinkServer名称 */
  @KsYunField(name = "PrivateLinkServerName")
  private String PrivateLinkServerName;

  /** 描述 */
  @KsYunField(name = "Description")
  private String Description;

  /** 删除保护 */
  @KsYunField(name = "DeleteProtection")
  private String DeleteProtection;
}
