package ksyun.client.slb.deletealbbackendservergroup.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DeleteAlbBackendServerGroupRequest @Description 请求参数
 */
@Data
public class DeleteAlbBackendServerGroupRequest {
  /** ALB服务器组id */
  @KsYunField(name = "BackendServerGroupId")
  private String BackendServerGroupId;
}
