package ksyun.client.aicp.getimage.v20250501;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname GetImageRequest @Description 请求参数
 */
@Data
public class GetImageRequest {
  /** 镜像ID */
  @KsYunField(name = "id")
  private Integer Id;
}
