package ksyun.client.epc.acceptshareimage.v20151101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname AcceptShareImageRequest @Description 请求参数
 */
@Data
public class AcceptShareImageRequest {
  /***/
  @KsYunField(name = "ImageId")
  private String ImageId;
}
