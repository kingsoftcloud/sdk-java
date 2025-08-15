package ksyun.client.krds.restoretosginstance.v20160701;

import common.annotation.KsYunField;
import java.util.List;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname RestoreToSgInstanceRequest @Description 请求参数
 */
@Data
public class RestoreToSgInstanceRequest {
  /** 实例ID */
  @KsYunField(name = "DBInstanceIdentifier")
  private String DBInstanceIdentifier;

  /** 备份ID 根据备份恢复，必传备份ID，且必传SrcDatabases和DstDatabases */
  @KsYunField(name = "DBBackupIdentifier")
  private String DBBackupIdentifier;

  /** 恢复时间 根据时间点恢复，必传时间点，且必传SrcDatabases和DstDatabases；格式：yyyy-MM-dd HH:mm:ss */
  @KsYunField(name = "RestorableTime")
  private String RestorableTime;

  /**
   * 源 [{<br>
   * "DatabaseName": "wang",<br>
   * "WholeDatabase":"True",<br>
   * "TableNames": [<br>
   * "li"]<br>
   * }]
   */
  @KsYunField(name = "SrcDatabases")
  private List<SrcDatabasesDto> SrcDatabasesList;

  @Data
  @ToString
  public static class SrcDatabasesDto {
    /** 数据库名称 */
    @KsYunField(name = "DatabaseName")
    private String DatabaseName;

    /** 是否为整个库表 */
    @KsYunField(name = "WholeDatabase")
    private String WholeDatabase;

    /** 指定数据表对应的列表啊 */
    @KsYunField(name = "TableNames")
    private List<String> TableNamesList;
  }

  /**
   * 目标 [{<br>
   * "DatabaseName": "wang",<br>
   * "WholeDatabase":"True",<br>
   * "TableNames": [<br>
   * "li"]<br>
   * }]
   */
  @KsYunField(name = "DstDatabases")
  private List<DstDatabasesDto> DstDatabasesList;

  @Data
  @ToString
  public static class DstDatabasesDto {
    /** 数据库库名 */
    @KsYunField(name = "DatabaseName")
    private String DatabaseName;

    /** 是否为整个库表 */
    @KsYunField(name = "WholeDatabase")
    private String WholeDatabase;

    /** 数据表列表 */
    @KsYunField(name = "TableNames")
    private List<String> TableNamesList;
  }
}
