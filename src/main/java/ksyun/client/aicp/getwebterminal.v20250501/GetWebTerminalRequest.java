package ksyun.client.aicp.getwebterminal.v20250501;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname GetWebTerminalRequest
 * @Description 请求参数
 */
@Data
public class GetWebTerminalRequest {
    /**
     * 任务ID
     */
    @KsYunField(name = "job_id")
    private Integer Job_id;

    /**
     * 任务Task ID
     */
    @KsYunField(name="task_id")
    private Integer Task_id;

    /**
     * 任务Task Pod 名称
     */
    @KsYunField(name="pod_name")
    private String Pod_name;

    /**空间ID
*/
    @KsYunField(name="space_id")
    private Integer Space_id;

}