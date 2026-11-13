package ksyun.client.aicp.runagent.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname RunAgentRequest
* @Description 请求参数
*/
@Data
public class RunAgentRequest{
    /***/
    @KsYunField(name="AgentId")
    private String AgentId;

    /***/
    @KsYunField(name="Messages",type=2)
    private List<String> MessagesList;

    /***/
    @KsYunField(name="SessionId")
    private String SessionId;

    /***/
    @KsYunField(name="Model")
    private String Model;

    /***/
    @KsYunField(name="Stream")
    private Boolean Stream;

    /***/
    @KsYunField(name="Background")
    private Boolean Background;

    /***/
    @KsYunField(name="ApiFormat")
    private String ApiFormat;

    /***/
    @KsYunField(name="ResponsesInput")
    private String ResponsesInput;

    /***/
    @KsYunField(name="PreviousResponseId")
    private String PreviousResponseId;

    /***/
    @KsYunField(name="InvocationId")
    private String InvocationId;

}
