package ksyun.client.aicp.describenotebooktimeline.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeNotebookTimeLineRequest
* @Description 请求参数
*/
@Data
public class DescribeNotebookTimeLineRequest{
    /**开发任务ID*/
    @KsYunField(name="NotebookId")
    private String NotebookId;

}
