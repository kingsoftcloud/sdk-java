package ksyun.client.aicp.startnotebook.v20240612;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname StartNotebookResponse
* @Description StartNotebook 返回体
*/
@Data
@ToString
public class StartNotebookResponse extends BaseResponseModel {
    /**开发任务ID*/
    @JsonProperty("NotebookId")
    private String NotebookId;

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

}
