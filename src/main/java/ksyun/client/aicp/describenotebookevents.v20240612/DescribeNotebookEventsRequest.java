package ksyun.client.aicp.describenotebookevents.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname DescribeNotebookEventsRequest
 * @Description 请求参数
 */
@Data
public class DescribeNotebookEventsRequest {
    /**
     * 开发任务ID
     */
    @KsYunField(name = "NotebookId")
    private String NotebookId;

}