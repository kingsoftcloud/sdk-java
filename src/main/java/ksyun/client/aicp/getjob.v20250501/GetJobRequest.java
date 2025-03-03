package ksyun.client.aicp.getjob.v20250501;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname GetJobRequest
 * @Description 请求参数
 */
@Data
public class GetJobRequest {
    /**
     * 任务ID
     */
    @KsYunField(name = "job_id")
    private Integer Job_id;

    /**
     * 空间ID
     */
    @KsYunField(name = "space_id")
    private Integer Space_id;

}