package ksyun.client.krds.listauditdetailexporttask.v20160701;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname ListAuditDetailExportTaskRequest
 * @Description 请求参数
 */
@Data
public class ListAuditDetailExportTaskRequest {
    /**
     * 实例ID
     */
    @KsYunField(name = "DBInstanceIdentifier")
    private String DBInstanceIdentifier;

    /**
     * 查询开始条数
     */
    @KsYunField(name = "Marker")
    private String Marker;

    /**
     * 查询每页暂时条数
     */
    @KsYunField(name = "MaxRecords")
    private String MaxRecords;

}