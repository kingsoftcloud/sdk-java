package ksyun.client.aicp.stopnotebook.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname StopNotebookRequest
* @Description 请求参数
*/
@Data
public class StopNotebookRequest{
    /**开发任务ID*/
    @KsYunField(name="NotebookId")
    private String NotebookId;

}