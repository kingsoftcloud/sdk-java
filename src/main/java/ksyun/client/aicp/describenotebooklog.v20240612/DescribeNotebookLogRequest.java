package ksyun.client.aicp.describenotebooklog.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeNotebookLogRequest
* @Description 请求参数
*/
@Data
public class DescribeNotebookLogRequest{
    /**开发任务Id*/
    @KsYunField(name="NotebookId")
    private String NotebookId;

    /**日志默认显示时间，单位秒；比如10分钟内的，值为600*/
    @KsYunField(name="SinceSeconds")
    private Integer SinceSeconds;

    /**日志显示行数，比如显示30行，值为30*/
    @KsYunField(name="TailLines")
    private String TailLines;

}
