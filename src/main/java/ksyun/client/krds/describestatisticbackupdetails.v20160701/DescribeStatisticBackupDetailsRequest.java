package ksyun.client.krds.describestatisticbackupdetails.v20160701;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname DescribeStatisticBackupDetailsRequest
 * @Description 请求参数
 */
@Data
public class DescribeStatisticBackupDetailsRequest {
    /**
     * 必传：数据类型，区分查询类型；
     * backup：实例备份；
     * binglog：实例binglog备份；
     * delbackup：已删除实例备份；
     */
    @KsYunField(name = "DataType")
    private String DataType;

    /**
     * 快照：snapshot
     * 自动备份：autobackup
     */
    @KsYunField(name = "BackupType")
    private String BackupType;

    /**
     * 数据开始条数
     * 默认:0 
     */
    @KsYunField(name = "Marker")
    private Integer Marker;

    /**
     * 数据每页展示条数；
     * 默认：10
     */
    @KsYunField(name = "MaxRecords")
    private Integer MaxRecords;

}