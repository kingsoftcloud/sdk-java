package ksyun.client.postgresql.describedbbackups.v20181225;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribeDBBackupsRequest @Description 请求参数
 */
@Data
public class DescribeDBBackupsRequest {
  /** 实例ID */
  @KsYunField(name = "DBInstanceIdentifier")
  private String DBInstanceIdentifier;

  /** 数据库快照类型，取值范围：AutoBackup（自动产生的备份）、Snapshot（手动发起的备份） */
  @KsYunField(name = "BackupType")
  private String BackupType;

  /** 备份搜索关键字 */
  @KsYunField(name = "Keyword")
  private String Keyword;

  /**
   * 获取记录开始偏移量
   *
   * <p>默认：0
   */
  @KsYunField(name = "Marker")
  private Integer Marker;

  /**
   * 每页结果中包含的最大条数
   *
   * <p>默认：10,区间10~100
   */
  @KsYunField(name = "MaxRecords")
  private Integer MaxRecords;
}
