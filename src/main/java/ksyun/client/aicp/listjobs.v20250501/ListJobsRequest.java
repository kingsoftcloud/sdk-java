package ksyun.client.aicp.listjobs.v20250501;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ListJobsRequest
 * @Description 请求参数
 */
@Data
public class ListJobsRequest {
    /**
     * 页码
     */
    @KsYunField(name = "page_index")
    private Integer Page_index;

    /**
     * 页大小
     */
    @KsYunField(name = "page_size")
    private Integer Page_size;

    /**
     * 空间ID
     * 默认为用户当前空间
     */
    @KsYunField(name = "space_id")
    private Integer Space_id;

    /**
     * 任务名称
     */
    @KsYunField(name = "job_name")
    private String Job_name;

    /**
     * 用户名称
     */
    @KsYunField(name = "user_name")
    private String User_name;

    /**
     * 任务状态
     * starting/stopped/stopping/run_start/run_running/run_succeeded/aborted/error
     */
    @KsYunField(name = "status")
    private String Status;

}