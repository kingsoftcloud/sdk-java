package ksyun.client.sqlserver.modifyinstancedatabaseinfo.v20190425;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ModifyInstanceDatabaseInfoRequest @Description 请求参数
 */
@Data
public class ModifyInstanceDatabaseInfoRequest {
  /** 实例ID */
  @KsYunField(name = "DBInstanceIdentifier")
  private String DBInstanceIdentifier;

  /** 数据库名称 */
  @KsYunField(name = "InstanceDatabaseName")
  private String InstanceDatabaseName;

  /** 数据库描述 */
  @KsYunField(name = "InstanceDatabaseDescription")
  private String InstanceDatabaseDescription;
}
