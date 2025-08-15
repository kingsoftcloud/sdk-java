package ksyun.client.milvus.listbackup.v20231010;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ListBackupRequest @Description 请求参数
 */
@Data
public class ListBackupRequest {
  /** 实例id */
  @KsYunField(name = "InstanceId")
  private String InstanceId;

  /** 备份名称(模糊查询) */
  @KsYunField(name = "BackupName")
  private String BackupName;

  /**
   * 开始页码
   *
   * <p>```json 注意：第一页默认页码0 ```
   */
  @KsYunField(name = "Offset")
  private Integer Offset;

  /**
   * 每页展示条数
   *
   * <p>```json 注意：默认每页展示10条 ```
   */
  @KsYunField(name = "Limit")
  private Integer Limit;
}
