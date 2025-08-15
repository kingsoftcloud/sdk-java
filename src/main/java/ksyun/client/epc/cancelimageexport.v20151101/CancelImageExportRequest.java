package ksyun.client.epc.cancelimageexport.v20151101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname CancelImageExportRequest @Description 请求参数
 */
@Data
public class CancelImageExportRequest {
  /***/
  @KsYunField(name = "ImageId")
  private String ImageId;
}
