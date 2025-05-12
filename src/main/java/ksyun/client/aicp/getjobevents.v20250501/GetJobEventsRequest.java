package ksyun.client.aicp.getjobevents.v20250501;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname GetJobEventsRequest
 * @Description 请求参数
 */
@Data
public class GetJobEventsRequest {
    /**
     * 任务ID
     */
    @KsYunField(name = "job_id")
    private Integer Job_id;

    /**
     * 任务Task ID
     * 若不传taskId则查询任务最新一次task的事件
     */
    @KsYunField(name="task_id")
    private Integer Task_id;

    /**空间ID*/
    @KsYunField(name="space_id")
    private Integer Space_id;

}