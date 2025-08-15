package ksyun.client.epc.exportimage.v20151101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ExportImageRequest @Description 请求参数
 */
@Data
public class ExportImageRequest {
  /***/
  @KsYunField(name = "ImageId")
  private String ImageId;

  /***/
  @KsYunField(name = "Ks3Bucket")
  private String Ks3Bucket;

  /***/
  @KsYunField(name = "ObjectName")
  private String ObjectName;
}
