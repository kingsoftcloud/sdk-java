package ksyun.client.aicp.createsandboxinstancecommit.v20260401;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateSandboxInstanceCommitResponse
* @Description CreateSandboxInstanceCommit 返回体
*/
@Data
@ToString
public class CreateSandboxInstanceCommitResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**提交任务ID*/
    @JsonProperty("TaskId")
    private String TaskId;

    /**任务初始状态（Pending）*/
    @JsonProperty("Status")
    private String Status;

    /**目标镜像完整地址*/
    @JsonProperty("Image")
    private String Image;

}
