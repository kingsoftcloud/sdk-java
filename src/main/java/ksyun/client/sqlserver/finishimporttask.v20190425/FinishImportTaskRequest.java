package ksyun.client.sqlserver.finishimporttask.v20190425;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname FinishImportTaskRequest
* @Description 请求参数
*/
@Data
public class FinishImportTaskRequest{
    /**实例ID*/
    @KsYunField(name="DBInstanceIdentifier")
    private String DBInstanceIdentifier;

    /**任务ID*/
    @KsYunField(name="ImportTaskId")
    private String ImportTaskId;

}
