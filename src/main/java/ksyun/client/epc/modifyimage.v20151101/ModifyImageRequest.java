package ksyun.client.epc.modifyimage.v20151101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ModifyImageRequest @Description 请求参数
 */
@Data
public class ModifyImageRequest {
  /** 镜像名称 */
  @KsYunField(name = "ImageName")
  private String ImageName;

  /** 原镜像ID */
  @KsYunField(name = "ImageId")
  private String ImageId;
}
