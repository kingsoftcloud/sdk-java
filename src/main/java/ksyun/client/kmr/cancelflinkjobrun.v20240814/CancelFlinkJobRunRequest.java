package ksyun.client.kmr.cancelflinkjobrun.v20240814;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CancelFlinkJobRunRequest
* @Description 请求参数
*/
@Data
public class CancelFlinkJobRunRequest{
    /**工作空间ID*/
    @KsYunField(name="WorkspaceId")
    private String WorkspaceId;

    /***/
    @KsYunField(name="JobRunIds",type=2)
    private List<JobRunIdsDto1> JobRunIdsList;

    @Data
    @ToString
    public static class JobRunIdsDto1 {
        /**作业ID*/
        @KsYunField(name="JobRunId")
        private String JobRunId;

        /**作业类型：flink*/
        @KsYunField(name="JobType")
        private String JobType;

    }

}
