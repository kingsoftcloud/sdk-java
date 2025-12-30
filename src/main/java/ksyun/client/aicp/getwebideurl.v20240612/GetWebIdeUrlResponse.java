package ksyun.client.aicp.getwebideurl.v20240612;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname GetWebIdeUrlResponse
* @Description GetWebIdeUrl 返回体
*/
@Data
@ToString
public class GetWebIdeUrlResponse extends BaseResponseModel {

    /**Jupyter连接地址*/
    @JsonProperty("JupyterWebUrl")
    private String JupyterWebUrl;

    /**Vscode连接地址*/
    @JsonProperty("VscodeWebUrl")
    private String VscodeWebUrl;

    /**开发任务ID*/
    @JsonProperty("NotebookId")
    private String NotebookId;

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

}
