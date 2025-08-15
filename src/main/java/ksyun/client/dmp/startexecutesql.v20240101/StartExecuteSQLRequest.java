package ksyun.client.dmp.startexecutesql.v20240101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname StartExecuteSQLRequest @Description 请求参数
 */
@Data
public class StartExecuteSQLRequest {
  /** 数据库名称 */
  @KsYunField(name = "DatabaseName")
  private String DatabaseName;

  /** SQL语句 */
  @KsYunField(name = "Statement")
  private String Statement;
}
