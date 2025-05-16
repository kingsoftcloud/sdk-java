package ksyun.client.tidb.describetask.v20210520;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname DescribeTaskRequest
 * @Description 请求参数
 */
@Data
public class DescribeTaskRequest {
    /**
     * 实例ID
     */
    @KsYunField(name = "InstanceId")
    private String InstanceId;

    /**
     * 任务名称
     */
    @KsYunField(name = "TaskName")
    private String TaskName;

}