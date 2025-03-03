package ksyun.client.krds.startauditdetailexporttask.v20160701;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname StartAuditDetailExportTaskRequest
 * @Description 请求参数
 */
@Data
public class StartAuditDetailExportTaskRequest {
    /**
     * 实例ID
     */
    @KsYunField(name = "DBInstanceIdentifier")
    private String DBInstanceIdentifier;

    /**
     * 导出字段选择
     * 例如：ExecTime,Sql
     * 可选择多个参数，以,进行隔开
     * ExecTime:执行完成时间
     * Sql：SQL
     * DbName：数据库名称
     * UserName：用户名称
     * SourceIp：客户端IP
     * RunResult：状态
     * RowSent：更新行数
     * Duration：执行耗时
     */
    @KsYunField(name = "ExportFileds")
    private String ExportFileds;

    /**
     * 导出开始时间
     * 例如：2021-08-31 14:14:55
     */
    @KsYunField(name = "AuditBeginTime")
    private String AuditBeginTime;

    /**
     * 导出结束时间
     * 例如：2021-08-31 14:14:55
     */
    @KsYunField(name = "AuditEndTime")
    private String AuditEndTime;


}