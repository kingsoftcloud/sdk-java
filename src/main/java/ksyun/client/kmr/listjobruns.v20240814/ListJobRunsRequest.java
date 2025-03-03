package ksyun.client.kmr.listjobruns.v20240814;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ListJobRunsRequest
 * @Description 请求参数
 */
@Data
public class ListJobRunsRequest {
    /**
     * 工作空间ID
     */
    @KsYunField(name = "WorkspaceId")
    private String WorkspaceId;

    /**
     * 查询返回的最大记录数
     */
    @KsYunField(name = "MaxResults")
    private Integer MaxResults;

}