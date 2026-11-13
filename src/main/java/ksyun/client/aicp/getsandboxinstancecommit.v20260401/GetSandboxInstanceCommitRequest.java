package ksyun.client.aicp.getsandboxinstancecommit.v20260401;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname GetSandboxInstanceCommitRequest
* @Description 请求参数
*/
@Data
public class GetSandboxInstanceCommitRequest{
    /**沙箱实例ID*/
    @KsYunField(name="InstanceId")
    private String InstanceId;

    /**提交任务ID*/
    @KsYunField(name="TaskId")
    private String TaskId;

}
