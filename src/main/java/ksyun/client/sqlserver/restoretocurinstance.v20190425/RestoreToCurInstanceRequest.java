package ksyun.client.sqlserver.restoretocurinstance.v20190425;

import common.annotation.KsYunField;
import java.util.List;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname RestoreToCurInstanceRequest @Description 请求参数
 */
@Data
public class RestoreToCurInstanceRequest {
  /** 实例ID */
  @KsYunField(name = "DBInstanceIdentifier")
  private String DBInstanceIdentifier;

  /** 备份ID 根据备份恢复，必传备份ID，且必传SrcDatabases和DstDatabases */
  @KsYunField(name = "DBBackupIdentifier")
  private String DBBackupIdentifier;

  /** 恢复时间 根据时间点恢复，必传时间点，且必传SrcDatabases和DstDatabases；格式：yyyy-MM-dd HH:mm:ss */
  @KsYunField(name = "RestorableTime")
  private String RestorableTime;

  /** ```json 源 [{ “DatabaseName”: “wang”, “WholeDatabase”:“True”, “TableNames”: [ “li”] }] ``` */
  @KsYunField(name = "SrcDatabases")
  private List<SrcDatabasesDto> SrcDatabasesList;

  @Data
  @ToString
  public static class SrcDatabasesDto {
    /** 数据库名称 */
    @KsYunField(name = "DatabaseName")
    private String DatabaseName;

    /** 是否为整库 */
    @KsYunField(name = "WholeDatabase")
    private String WholeDatabase;

    /** 数据表列表 */
    @KsYunField(name = "TableNames")
    private List<String> TableNamesList;
  }

  /** ```json 目标 [{ “DatabaseName”: “wang”, “WholeDatabase”:“True”, “TableNames”: [ “li”] }] ``` */
  @KsYunField(name = "DstDatabases")
  private List<DstDatabasesDto> DstDatabasesList;

  @Data
  @ToString
  public static class DstDatabasesDto {
    /** 数据库库名 */
    @KsYunField(name = "DatabaseName")
    private String DatabaseName;

    /** 是否是整库 */
    @KsYunField(name = "WholeDatabase")
    private String WholeDatabase;

    /** 数据表列表 */
    @KsYunField(name = "TableNames")
    private List<String> TableNamesList;
  }
}
