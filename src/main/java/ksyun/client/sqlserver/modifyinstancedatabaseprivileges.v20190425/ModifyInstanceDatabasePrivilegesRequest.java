package ksyun.client.sqlserver.modifyinstancedatabaseprivileges.v20190425;

import common.annotation.KsYunField;
import java.util.List;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname ModifyInstanceDatabasePrivilegesRequest @Description 请求参数
 */
@Data
public class ModifyInstanceDatabasePrivilegesRequest {
  /** 实例ID */
  @KsYunField(name = "DBInstanceIdentifier")
  private String DBInstanceIdentifier;

  /** 数据库名称 */
  @KsYunField(name = "InstanceDatabaseName")
  private String InstanceDatabaseName;

  /***/
  @KsYunField(name = "InstanceDatabasePrivileges")
  private List<InstanceDatabasePrivilegesDto> InstanceDatabasePrivilegesList;

  @Data
  @ToString
  public static class InstanceDatabasePrivilegesDto {
    /** 账号名称 */
    @KsYunField(name = "InstanceAccountName")
    private String InstanceAccountName;

    /** 账号权限 */
    @KsYunField(name = "Privilege")
    private String Privilege;
  }
}
