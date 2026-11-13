package ksyun.client.aicp.resumerun.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ResumeRunRequest
* @Description 请求参数
*/
@Data
public class ResumeRunRequest{
    /***/
    @KsYunField(name="AgentId")
    private String AgentId;

    /***/
    @KsYunField(name="SessionId")
    private String SessionId;

    /***/
    @KsYunField(name="RunId")
    private String RunId;

    /***/
    @KsYunField(name="CheckpointId")
    private String CheckpointId;

    /***/
    @KsYunField(name="ResumeAttemptId")
    private String ResumeAttemptId;

    /***/
    @KsYunField(name="InvocationId")
    private String InvocationId;

    /***/
    @KsYunField(name="Stream")
    private Boolean Stream;

    /***/
    @KsYunField(name="Background")
    private Boolean Background;

    /***/
    @KsYunField(name="Model")
    private String Model;

    /***/
    @KsYunField(name="ResumeInstructionEnabled")
    private Boolean ResumeInstructionEnabled;

    /***/
    @KsYunField(name="ResumeInstruction")
    private String ResumeInstruction;

}
