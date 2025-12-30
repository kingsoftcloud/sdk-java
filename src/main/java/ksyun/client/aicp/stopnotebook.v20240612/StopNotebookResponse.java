package ksyun.client.aicp.stopnotebook.v20240612;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname StopNotebookResponse
* @Description StopNotebook 返回体
*/
@Data
@ToString
public class StopNotebookResponse extends BaseResponseModel {

    /**开发任务ID*/
    @JsonProperty("NotebookId")
    private String NotebookId;

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

}
