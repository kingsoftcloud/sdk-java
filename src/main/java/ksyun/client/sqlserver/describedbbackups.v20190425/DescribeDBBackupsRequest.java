package ksyun.client.sqlserver.describedbbackups.v20190425;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeDBBackupsRequest
* @Description 请求参数
*/
@Data
public class DescribeDBBackupsRequest{
    /**实例ID*/
    @KsYunField(name="DBInstanceIdentifier")
    private String DBInstanceIdentifier;

    /**模糊搜索

```json
依据备份名称过滤
```*/
    @KsYunField(name="Keyword")
    private String Keyword;

    /**备份类型

```json
数据库快照类型，取值范围：
AutoBackup（自动产生的备份）
Snapshot（手动发起的备份）
```*/
    @KsYunField(name="BackupType")
    private String BackupType;

    /**获取记录开始偏移量*/
    @KsYunField(name="Marker")
    private Integer Marker;

    /**每页结果中包含的最大条数*/
    @KsYunField(name="MaxRecords")
    private Integer MaxRecords;

}
