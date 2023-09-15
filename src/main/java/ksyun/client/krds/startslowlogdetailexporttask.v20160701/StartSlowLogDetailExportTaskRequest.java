package ksyun.client.krds.startslowlogdetailexporttask.v20160701;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname StartSlowLogDetailExportTaskRequest
* @Description 请求参数
*/
@Data
public class StartSlowLogDetailExportTaskRequest{
    /**实例ID*/
    @KsYunField(name="DBInstanceIdentifier")
    private String DBInstanceIdentifier;

    /**开始时间	yyyy-MM-dd HH:mm:ss*/
    @KsYunField(name="AuditBeginTime")
    private String AuditBeginTime;

    /**结束时间	yyyy-MM-dd HH:mm:ss*/
    @KsYunField(name="AuditEndTime")
    private String AuditEndTime;

    /**查询类型		可多选,以\`,`分开； SELECT,INSERT,UPDATE,DELETE,OTHER*/
    @KsYunField(name="AccessSqlStatement")
    private String AccessSqlStatement;


}