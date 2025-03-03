package ksyun.client.kmr.cancelflinkjobrun.v20240814;

import common.annotation.KsYunField;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * @Classname CancelFlinkJobRunRequest
 * @Description 请求参数
 */
@Data
public class CancelFlinkJobRunRequest {
    /**
     * 工作空间ID
     */
    @KsYunField(name = "WorkspaceId")
    private String WorkspaceId;

    /**
     * 作业的ID和作业类型组成的数组
     * JobRunId:xxx
     * JobType:flink
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
         * 作业类型：flink
         */
        private String JobType;
    }

}