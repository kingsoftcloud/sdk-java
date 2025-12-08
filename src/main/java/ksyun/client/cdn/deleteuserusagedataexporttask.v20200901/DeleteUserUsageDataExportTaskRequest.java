package ksyun.client.cdn.deleteuserusagedataexporttask.v20200901;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DeleteUserUsageDataExportTaskRequest
* @Description 请求参数
*/
@Data
public class DeleteUserUsageDataExportTaskRequest{
    /**任务ID*/
    @KsYunField(name="TaskID")
    private String TaskID;

}
