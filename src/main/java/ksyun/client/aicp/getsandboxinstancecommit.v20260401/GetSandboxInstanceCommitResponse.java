package ksyun.client.aicp.getsandboxinstancecommit.v20260401;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname GetSandboxInstanceCommitResponse
* @Description GetSandboxInstanceCommit 返回体
*/
@Data
@ToString
public class GetSandboxInstanceCommitResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**提交任务ID*/
    @JsonProperty("TaskId")
    private String TaskId;

    /**容器名称*/
    @JsonProperty("ContainerName")
    private String ContainerName;

    /**任务创建时间*/
    @JsonProperty("CreatedAt")
    private String CreatedAt;

    /**任务最终状态（Pending/Running/Succeeded/Failed）*/
    @JsonProperty("Status")
    private String Status;

    /**目标镜像完整地址*/
    @JsonProperty("Image")
    private String Image;

    /**KCI任务阶段*/
    @JsonProperty("Stage")
    private String Stage;

    /**镜像摘要*/
    @JsonProperty("ImageDigest")
    private String ImageDigest;

    /**镜像引用（地址@摘要）*/
    @JsonProperty("ImageRef")
    private String ImageRef;

    /**任务开始时间*/
    @JsonProperty("StartedAt")
    private String StartedAt;

    /**任务完成时间*/
    @JsonProperty("FinishedAt")
    private String FinishedAt;

    /**最后观测时间*/
    @JsonProperty("LastObservedAt")
    private String LastObservedAt;

    /**失败时的错误码（仅任务失败时返回）*/
    @JsonProperty("ErrorCode")
    private String ErrorCode;

}
