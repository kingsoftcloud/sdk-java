package ksyun.client.dmp.updatedatabasetable.v20240101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname UpdateDatabaseTableRequest @Description 请求参数
 */
@Data
public class UpdateDatabaseTableRequest {
  /***/
  @KsYunField(name = "DatabaseId")
  private String DatabaseId;
}
