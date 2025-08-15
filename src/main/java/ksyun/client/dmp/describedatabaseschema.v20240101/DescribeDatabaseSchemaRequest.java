package ksyun.client.dmp.describedatabaseschema.v20240101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribeDatabaseSchemaRequest @Description 请求参数
 */
@Data
public class DescribeDatabaseSchemaRequest {
  /** 数据库Id */
  @KsYunField(name = "DatabaseId")
  private Integer DatabaseId;
}
