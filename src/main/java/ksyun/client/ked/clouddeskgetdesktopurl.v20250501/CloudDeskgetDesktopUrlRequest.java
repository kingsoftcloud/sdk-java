package ksyun.client.ked.clouddeskgetdesktopurl.v20250501;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname CloudDeskgetDesktopUrlRequest @Description 请求参数
 */
@Data
public class CloudDeskgetDesktopUrlRequest {
  /** 访问token */
  @KsYunField(name = "token")
  private String Token;

  /** 实例id */
  @KsYunField(name = "instanceId")
  private String InstanceId;
}
