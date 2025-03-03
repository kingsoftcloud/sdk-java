package ksyun.client.krds.listslowlogdetailexporttask.v20160701;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ListSlowLogDetailExportTaskRequest
 * @Description 请求参数
 */
@Data
public class ListSlowLogDetailExportTaskRequest {
    /**
     * 实例ID
     */
    @KsYunField(name = "DBInstanceIdentifier")
    private String DBInstanceIdentifier;

    /**
     * 当前条：默认0
     */
    @KsYunField(name = "Marker")
    private String Marker;

    /**
     * 每页显示大小，默认10		区间 ：[10,10000]
     */
    @KsYunField(name = "MaxRecords")
    private String MaxRecords;


}