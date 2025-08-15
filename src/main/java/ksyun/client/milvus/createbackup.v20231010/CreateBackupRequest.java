package ksyun.client.milvus.createbackup.v20231010;

import common.annotation.KsYunField;
import java.util.List;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname CreateBackupRequest @Description 请求参数
 */
@Data
public class CreateBackupRequest {
  /** 实例id */
  @KsYunField(name = "InstanceId")
  private String InstanceId;

  /** 备份名称 */
  @KsYunField(name = "BackupName")
  private String BackupName;

  /**
   * 备份collection信息
   *
   * <p>```json 若要全部备份，则可以不填； 若要指定备份，则手动具体指定。 ```
   */
  @KsYunField(name = "DBCollection", type = 2)
  private List<DBCollectionDto> DBCollectionList;

  @Data
  @ToString
  public static class DBCollectionDto {
    /** db名称 */
    private String DbName;

    /** 描述 */
    private String Description;

    /** collection列表 */
    @KsYunField(name = "Collections", type = 2)
    private List<String> CollectionsList;
  }
}
