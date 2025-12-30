package ksyun.client.aicp.createnotebook.v20240612;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateNotebookResponse
* @Description CreateNotebook 返回体
*/
@Data
@ToString
public class CreateNotebookResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**开发任务ID*/
    @JsonProperty("NotebookId")
    private String NotebookId;

}
