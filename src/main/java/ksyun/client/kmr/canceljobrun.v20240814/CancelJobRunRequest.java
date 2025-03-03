package ksyun.client.kmr.canceljobrun.v20240814;

import common.annotation.KsYunField;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * @Classname CancelJobRunRequest
 * @Description 请求参数
 */
@Data
public class CancelJobRunRequest {
    /**
     * 工作空间ID
     */
    @KsYunField(name = "WorkspaceId")
    private String WorkspaceId;

    /**
     * 停止作业
     * 支持批量停止
     */
    @KsYunField(name = "JobRunIds", type = 2)
    private List<JobRunIdsDto> JobRunIdsList;

    @Data
    @ToString
    public static class JobRunIdsDto {
        /**
         * 作业ID
         */
        private String JobRunId;
        /**
         * 作业类型：spark、ray
         */
        private String JobType;
    }

}