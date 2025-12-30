package ksyun.client.aicp.deletenotebook.v20240612;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeleteNotebookResponse
* @Description DeleteNotebook 返回体
*/
@Data
@ToString
public class DeleteNotebookResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**开发任务ID*/
    @JsonProperty("NotebookId")
    private String NotebookId;

}
