package ksyun.client.aicp.deletejob.v20250501;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname DeleteJobRequest
 * @Description 请求参数
 */
@Data
public class DeleteJobRequest {
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