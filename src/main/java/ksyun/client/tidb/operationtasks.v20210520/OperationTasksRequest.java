package ksyun.client.tidb.operationtasks.v20210520;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname OperationTasksRequest
* @Description 请求参数
*/
@Data
public class OperationTasksRequest{
    /**实例id*/
    @KsYunField(name="InstanceId")
    private String InstanceId;

    /**任务名称列表，多个任务以  英文逗号分隔*/
    @KsYunField(name="TaskList")
    private String TaskList;

    /**操作类型：
DeleteTask 删除 
RetryTask  重试 
PauseTask  暂停 
ResumeTask 恢复*/
    @KsYunField(name="Operation")
    private String Operation;

}
