package ksyun.client.aicp.getpodlogs.v20250501;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname GetPodLogsRequest
 * @Description 请求参数
 */
@Data
public class GetPodLogsRequest {
    /**
     * 任务ID
     */
    @KsYunField(name = "job_id")
    private Integer Job_id;

    /**
     * 任务task ID
     */
    @KsYunField(name = "task_id")
    private Integer Task_id;

    /**
     * pod名称
     * 查询单个pod的日志，若不传则查询task下全部pod的日志
     */
    @KsYunField(name = "pod_name")
    private String Pod_name;

    /**
     * 关键词
     * 若需要匹配多个关键字，则用空格连接
     */
    @KsYunField(name = "key_word")
    private String Key_word;

    /**
     * 尾行数
     */
    @KsYunField(name = "tail")
    private Integer Tail;

    /**
     * 空间ID
     */
    @KsYunField(name = "space_id")
    private Integer Space_id;

}