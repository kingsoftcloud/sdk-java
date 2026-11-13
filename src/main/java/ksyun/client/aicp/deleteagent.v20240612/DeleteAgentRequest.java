package ksyun.client.aicp.deleteagent.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DeleteAgentRequest
* @Description 请求参数
*/
@Data
public class DeleteAgentRequest{
    /***/
    @KsYunField(name="AgentId")
    private String AgentId;

}
