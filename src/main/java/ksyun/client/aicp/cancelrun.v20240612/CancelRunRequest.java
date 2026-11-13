package ksyun.client.aicp.cancelrun.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CancelRunRequest
* @Description 请求参数
*/
@Data
public class CancelRunRequest{
    /***/
    @KsYunField(name="AgentId")
    private String AgentId;

    /***/
    @KsYunField(name="SessionId")
    private String SessionId;

    /***/
    @KsYunField(name="InvocationId")
    private String InvocationId;

    /***/
    @KsYunField(name="ScopeId")
    private String ScopeId;

    /***/
    @KsYunField(name="ClientToken")
    private String ClientToken;

}
