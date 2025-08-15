package ksyun.client.sqlserver.createinstancedatabase.v20190425;

import common.annotation.KsYunField;
import java.util.List;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname CreateInstanceDatabaseRequest @Description 请求参数
 */
@Data
public class CreateInstanceDatabaseRequest {
  /** 实例ID */
  @KsYunField(name = "DBInstanceIdentifier")
  private String DBInstanceIdentifier;

  /** 数据库名称 */
  @KsYunField(name = "InstanceDatabaseName")
  private String InstanceDatabaseName;

  /** 数据库字符集 */
  @KsYunField(name = "InstanceDatabaseCollation")
  private String InstanceDatabaseCollation;

  /**
   * 数据库描述
   *
   * <p>```json 必须中文、英文字母开头，可以包含数字、中文、英文、下划线（_）、短横线（-） ```
   */
  @KsYunField(name = "InstanceDatabaseDescription")
  private String InstanceDatabaseDescription;

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
