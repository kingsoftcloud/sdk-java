package ksyun.client.mongodb.renamemongodbinstance.v20170101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname RenameMongoDBInstanceRequest @Description 请求参数
 */
@Data
public class RenameMongoDBInstanceRequest {
  /** 服务ID */
  @KsYunField(name = "InstanceId")
  private String InstanceId;

  /** 服务名称 */
  @KsYunField(name = "Name")
  private String Name;
}
