package ksyun.client.krds.describedbbackups.v20160701;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribeDBBackupsRequest
 * @Description 请求参数
 */
@Data
public class DescribeDBBackupsRequest {
    /**
     * 实例ID
     */
    @KsYunField(name = "DBInstanceIdentifier")
    private String DBInstanceIdentifier;

    /**
     * 数据库快照类型	数据库快照类型，取值范围：AutoBackup（自动产生的备份）、Snapshot（手动发起的备份）
     */
    @KsYunField(name = "BackupType")
    private String BackupType;

    /**
     * 备份搜索关键字	备份搜索关键字（根据备份名字）
     */
    @KsYunField(name = "Keyword")
    private String Keyword;

    /**
     * 获取记录开始偏移量	默认：0，获取记录开始偏移量  default=0
     */
    @KsYunField(name = "Marker")
    private String Marker;

    /**
     * 每页结果中包含的最大条数	默认：10，每页结果中包含的最大条数  区间 [10,100]
     */
    @KsYunField(name = "MaxRecords")
    private Integer MaxRecords;


}