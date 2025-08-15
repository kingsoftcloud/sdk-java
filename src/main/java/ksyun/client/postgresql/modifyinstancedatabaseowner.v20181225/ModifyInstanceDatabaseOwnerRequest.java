package ksyun.client.postgresql.modifyinstancedatabaseowner.v20181225;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ModifyInstanceDatabaseOwnerRequest @Description 请求参数
 */
@Data
public class ModifyInstanceDatabaseOwnerRequest {
  /** 实例ID */
  @KsYunField(name = "DBInstanceIdentifier")
  private String DBInstanceIdentifier;

  /** 数据库名称 */
  @KsYunField(name = "InstanceDatabaseName")
  private String InstanceDatabaseName;

  /** 数据库拥有者(账户) */
  @KsYunField(name = "Owner")
  private String Owner;
}
