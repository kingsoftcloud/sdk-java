package ksyun.client.sqlserver.finishimporttask.v20190425;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname FinishImportTaskRequest
 * @Description 请求参数
 */
@Data
public class FinishImportTaskRequest {
    /**
     * 实例ID
     */
    @KsYunField(name = "DBInstanceIdentifier")
    private String DBInstanceIdentifier;

    /**
     * 任务ID
     */
    @KsYunField(name = "ImportTaskId")
    private String ImportTaskId;

}